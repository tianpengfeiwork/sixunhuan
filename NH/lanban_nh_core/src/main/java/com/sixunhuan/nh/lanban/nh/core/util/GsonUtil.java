/**
 * Copyright (c) 2016,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 * Project Name:ubs_nh_core
 * Package Name:com.travelsky.pss.ubs.nh.core.util
 * File Name:GsonUtil.java
 * Date:2016年11月23日 上午11:26:39
 * 
 */
package com.sixunhuan.nh.lanban.nh.core.util;

import org.apache.commons.lang.StringUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sixunhuan.nh.lanban.nh.core.constants.SysConstants;

/**
 * ClassName: GsonUtil <br/>
 * Description: <br/>
 * Date: 2016年11月23日 上午11:26:39 <br/>
 * <br/>
 * 
 * @author fanzhao(邮箱)
 * 
 *         修改记录
 * @version 2016年11月23日 fanzhao Initial version<br/>
 * 
 */

public class GsonUtil {
    private static Gson gson = null;
    private static Gson gsonPretty = null;

    static {
        GsonBuilder gb = new GsonBuilder();
        gb.serializeNulls();
        gson = gb.create();
        gsonPretty = gb.setPrettyPrinting().create();
    }

    /**
     * 
     * object2json: 序列化对象为Json字符串，此方法json带有class信息 <br/>
     * 
     * @param object
     *            待序列化的对象
     * @return Json字符串 <br/>
     */
    public static String object2json(Object object) {
        return gson.toJson(object);
    }

    /**
     * 
     * object2jsonPretty: 默认的pretty print是new line 013,替换为carriage return 015
     * 
     * 
     * @param object
     *            Description <br/>
     * @return Description <br/>
     */
    public static String object2jsonPretty(Object object) {
        String jsonStr = gson.toJson(object);
        jsonStr = StringUtils.replace(jsonStr, SysConstants.LEFT_BRACKET,
                decorateWithCarriage(SysConstants.LEFT_BRACKET));
        jsonStr = StringUtils.replace(jsonStr, SysConstants.RIGHT_BRACKET,
                decorateWithCarriage(SysConstants.RIGHT_BRACKET));
        jsonStr = StringUtils.replace(jsonStr, SysConstants.LEFT_BRACE, decorateWithCarriage(SysConstants.LEFT_BRACE));
        jsonStr = StringUtils
                .replace(jsonStr, SysConstants.RIGHT_BRACE, decorateWithCarriage(SysConstants.RIGHT_BRACE));
        jsonStr = StringUtils.replace(jsonStr, SysConstants.COMMA, decorateWithCarriage(SysConstants.COMMA));

        String targetStr = SysConstants.DOUBLE_QUOTE + SysConstants.RIGHT_BRACE;
        String replaceStr = SysConstants.DOUBLE_QUOTE + SysConstants.CARRIAGE_RETURN + SysConstants.RIGHT_BRACE;
        jsonStr = StringUtils.replace(jsonStr, targetStr, replaceStr);

        targetStr = SysConstants.STRING_LOW_NULL + SysConstants.RIGHT_BRACE;
        replaceStr = SysConstants.STRING_LOW_NULL + SysConstants.CARRIAGE_RETURN + SysConstants.RIGHT_BRACE;
        jsonStr = StringUtils.replace(jsonStr, targetStr, replaceStr);

        return jsonStr;
    }

    /**
     * 
     * decorateWithCarriage:
     * 
     * 
     * <br/>
     * 
     * @param input
     *            String
     * @return Description <br/>
     */
    private static String decorateWithCarriage(String input) {
        return input + SysConstants.CARRIAGE_RETURN;
    }

    /**
     * json2object:转换json对象为object，此方法json需要有class信息 <br/>
     * 
     * @param json
     *            需要转换的json字符串
     * 
     * @param clazz
     *            Description <br/>
     * @return 目标对象<br/>
     */
    public static <T> T json2object(String json, Class<T> clazz) {
        return gson.fromJson(json, clazz);
    }

    /**
     * 私有的构造方法
     */
    private GsonUtil() {

    }
}
