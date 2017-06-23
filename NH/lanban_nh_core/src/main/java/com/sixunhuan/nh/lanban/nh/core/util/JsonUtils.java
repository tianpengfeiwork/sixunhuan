package com.sixunhuan.nh.lanban.nh.core.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import flexjson.JSONDeserializer;
import flexjson.JSONException;
import flexjson.JSONSerializer;
import flexjson.ObjectBinder;
import flexjson.ObjectFactory;
import flexjson.transformer.DateTransformer;



/**
 * 
 * Description: <br/>
 * 对象-json相互转换的方法 <br/>
 * 
 * <b>修改历史:</b> <br/>
 * version 1.0.0 2014-3-14 Ever Initial Version <br/>
 */
public class JsonUtils {

    /**
     * 
     * object2json: 序列化对象为Json字符串，此方法json带有class信息 <br/>
     * 
     * @param object
     *            待序列化的对象
     * @param prettyPring
     *            是否要格式化的Json(分行有缩进)
     * @return Json字符串 <br/>
     */
    public static String object2json(Object object, boolean prettyPring) {

        String json = new JSONSerializer().exclude("hash", "hash1")
                .transform(new DateTransformer("yyyy-MM-dd HH:mm:ss"), Date.class).prettyPrint(prettyPring)
                .deepSerialize(object);
        return json;
    }

    /**
     * 
     * object2json: 序列化对象为Json字符串，此方法json不带有class信息 <br/>
     * 
     * @param object
     *            待序列化的对象
     * @param prettyPring
     *            是否要格式化的Json(分行有缩进)
     * @return Json字符串 <br/>
     */
    public static String object2jsonNoClass(Object object, boolean prettyPring) {

        String json = new JSONSerializer().exclude("hash", "hash1").exclude("*.class")
                .transform(new DateTransformer("yyyy-MM-dd HH:mm:ss"), Date.class).prettyPrint(prettyPring)
                .deepSerialize(object);
        return json;
    }

    /**
     * json2object:转换json对象为object,此方法json不需要有class信息 <br/>
     * 
     * @param json
     *            需要转换的json字符串
     * @param classz
     *            要转化的对象所使用的classloader
     * 
     * @return 目标对象<br/>
     */
    @SuppressWarnings("rawtypes")
    public static <T> T json2objectNoClass(String json, Class classz) {
        // 记录当前的classloader
        ClassLoader currentClassloader = Thread.currentThread().getContextClassLoader();
        // 将当前上下文的classloader设置为目标classloader
        Thread.currentThread().setContextClassLoader(classz.getClassLoader());

        try {

            T object = new JSONDeserializer<T>().use(Date.class, new ObjectFactory() {
                public Object instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
                    List<DateFormat> dateFormats;

                    dateFormats = new ArrayList<DateFormat>();
                    dateFormats.add(DateFormat.getDateTimeInstance());
                    dateFormats.add(DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG));
                    dateFormats.add(DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM));
                    dateFormats.add(DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT));
                    dateFormats.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
                    dateFormats.add(new SimpleDateFormat("EEE MMM d hh:mm:ss a z yyyy"));
                    dateFormats.add(new SimpleDateFormat("EEE MMM d HH:mm:ss z yyyy"));
                    dateFormats.add(new SimpleDateFormat("MM/dd/yy hh:mm:ss a"));
                    dateFormats.add(new SimpleDateFormat("MM/dd/yy"));
                    try {
                        if (value instanceof Double) {
                            return instantiateDate((Class) targetType, ((Double) value).longValue(), context);
                        } else if (value instanceof Long) {
                            return instantiateDate((Class) targetType, (Long) value, context);
                        } else {
                            for (DateFormat format : dateFormats) {
                                try {
                                    return format.parse(value.toString());
                                } catch (ParseException e) {
                                    continue;
                                }
                            }
                            throw new JSONException(String.format(
                                    "%s:  Parsing date %s was not recognized as a date format",
                                    context.getCurrentPath(), value));
                        }
                    } catch (IllegalAccessException e) {
                        throw new JSONException(String.format("%s:  Error encountered trying to instantiate %s",
                                context.getCurrentPath(), ((Class) targetType).getName()), e);
                    } catch (InstantiationException e) {
                        throw new JSONException(String.format(
                                "%s: instantiate %s.  Make sure a public constructor accepts a single Long.",
                                context.getCurrentPath(), ((Class) targetType).getName()), e);
                    } catch (InvocationTargetException e) {
                        throw new JSONException(String.format(
                                "%s: instantiate %s.  Make sure a public constructor accepts a single Long.",
                                context.getCurrentPath(), ((Class) targetType).getName()), e);
                    }
                }

                private Date instantiateDate(Class<?> targetType, Long value, ObjectBinder context)
                        throws IllegalAccessException, InstantiationException, InvocationTargetException {
                    try {
                        Constructor constructor = targetType.getConstructor(Long.TYPE);
                        return (Date) constructor.newInstance(value);
                    } catch (NoSuchMethodException e) {
                        Date d = (Date) targetType.newInstance();
                        d.setTime(value);
                        return d;
                    }
                }
            }).deserialize(json, classz);

            return object;
        } finally {
            // 反序列化完毕,将当前的上下文的classloader还原
            Thread.currentThread().setContextClassLoader(currentClassloader);
        }
    }

    /**
     * 私有的构造方法
     */
    private JsonUtils() {

    }
}
