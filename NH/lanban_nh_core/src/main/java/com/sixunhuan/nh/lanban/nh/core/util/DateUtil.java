package com.sixunhuan.nh.lanban.nh.core.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.TimeZone;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


;

/**
 * 
 * 日期工具类: 1.0.0 <br/>
 * 
 * <b>修改历史:</b> <br/>
 * version 1.0.0 2014-3-21 boy Initial Version <br/>
 * version 1.0.0 2014-5-21 liujm
 * 修改transEtermDate方法，支持输入“+”,“-”,“.”,五位或者七位的eterm日期格式<br/>
 */
public class DateUtil {

    public final static String CZ_FORMAT = "yyyyMMdd";
    public final static String ISO_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public final static String ISO_DATE_FORMAT = "yyyy-MM-dd";
    public final static String ISO_TIME_FORMAT = "HH:mm:ss";
    public final static String ETERM_FORMAT = "ddMMMyy";
    public final static String ETERM_FORMAT_LONG = "ddMMMyyyy";
    public final static String ETERM_FORMAT_OP_RECORD = "ddMMMHHmm";
    public final static String LONG_ETERM_TIME_FORMAT = "ddMMMyyHHmmss";
    public final static Integer ETERM_FORMAT_LENGTH = 7;
    public final static Integer ETERM_FORMAT_SHORT_LENGTH = 6;
    public final static Integer ETERM_DATE_LENGTH = 5;
    public final static Integer ETERM_SHORT_DATE_LENGTH = 4;
    public final static String WEEK_PATTERN = "EEEE";
    public final static String ECHO_CLOSE_TIME_FORMAT = "HHmm";
    public final static String ECHO_CLOSE_TIME_FORMAT_SPLITTED = "HH:mm";

    //private static JcfLogger logger = JcfLogFactory.getJcfLogger(DateUtil.class);

    private static List<DateTimeFormatter> formatterList = new LinkedList<DateTimeFormatter>();
    private static Properties character2number = new Properties();

    static {
        DateUtil.formatterList.addAll(defaultFormatters());
        DateUtil.formatterList.addAll(loadFormatters());
        loadCharacter2NumberProperties();
    }

    /**
     * 
     * loadCharacter2NumberProperties: <br/>
     */
    private static void loadCharacter2NumberProperties() {
        InputStream is = null;
        try {
            is = DateUtil.class.getResourceAsStream("character2number.properties");
            character2number.load(is);
        } catch (IOException e) {
            //logger.error("DateUtil.loadCharacter2NumberProperties:Error in getting  character2number.properties");
            throw new RuntimeException("config error, system exit");
        } finally {
            IoUtils.closeQuietly(is);
        }
    }

    /**
     * 
     * defaultFormatters: 默认的Formatters<br/>
     * 
     * @return <br/>
     */
    private static Collection<? extends DateTimeFormatter> defaultFormatters() {
        List<DateTimeFormatter> formatterList = new LinkedList<DateTimeFormatter>();
        Locale[] locales = new Locale[] { Locale.CHINA, Locale.US };
        for (Locale locale : locales) {
            DateTimeFormatter dtf = DateTimeFormat.shortDate().withLocale(locale); // 格式:
                                                                                   // 12-12-17
                                                                                   // 或
                                                                                   // 12/17/12
            formatterList.add(dtf);
            dtf = DateTimeFormat.mediumDate().withLocale(locale); // 格式:
                                                                  // 2012-12-17
                                                                  // 或 Dec 17,
                                                                  // 2012
            formatterList.add(dtf);
            dtf = DateTimeFormat.longDate().withLocale(locale); // 格式:
                                                                // 2012年12月17日 或
                                                                // December 17,
                                                                // 2012
            formatterList.add(dtf);
            dtf = DateTimeFormat.fullDate().withLocale(locale); // 格式；2012年12月17日
                                                                // 星期一 或 Monday,
                                                                // December 17,
                                                                // 2012
            formatterList.add(dtf);

            dtf = DateTimeFormat.shortTime().withLocale(locale); // 格式：上午11:53 或
                                                                 // 11:57 AM
            formatterList.add(dtf);
            dtf = DateTimeFormat.mediumTime().withLocale(locale); // 格式：11:53:55
                                                                  // 或 11:56:32
                                                                  // AM
            formatterList.add(dtf);
            dtf = DateTimeFormat.longTime().withLocale(locale); // 格式：上午11时53分55秒
                                                                // 或 11:56:32 AM
                                                                // CST
            formatterList.add(dtf);
            dtf = DateTimeFormat.fullTime().withLocale(locale); // 格式：上午11时52分04秒
                                                                // CST 或
                                                                // 11:56:32 AM
                                                                // CST
            formatterList.add(dtf);

            dtf = DateTimeFormat.shortDateTime().withLocale(locale);
            formatterList.add(dtf);
            dtf = DateTimeFormat.mediumDateTime().withLocale(locale);
            formatterList.add(dtf);
            dtf = DateTimeFormat.longDateTime().withLocale(locale);
            formatterList.add(dtf);
            dtf = DateTimeFormat.fullDateTime().withLocale(locale);
            formatterList.add(dtf);
        }

        return formatterList;
    }

    /**
     * 
     * loadFormatters: <br/>
     * 
     * @return Collection<? extends DateTimeFormatter> <br/>
     */
    private static Collection<? extends DateTimeFormatter> loadFormatters() {
        List<DateTimeFormatter> formatterList = new LinkedList<DateTimeFormatter>();

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(DateUtil.class.getResourceAsStream("date.format"),
                    "UTF-8"));
            String line = reader.readLine();
            while (line != null) {
                if (!line.trim().startsWith("#")) {

                    String[] tokens = line.split("\\|\\|");
                    Locale locale = new Locale(tokens[0].trim(), tokens[1].trim());
                    String format = tokens[2].trim();

                    DateTimeFormatter dtf = DateTimeFormat.forPattern(format).withLocale(locale)
                            .withZone(DateTimeZone.forTimeZone(TimeZone.getDefault()));
                    formatterList.add(dtf);
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            //logger.error("DateUtil.loadFormatters:Error in getting profile information from date.format");
            throw new RuntimeException("FUNCTION");
        } finally {
            IoUtils.closeQuietly(reader);
        }
        return formatterList;
    }

    /**
     * formatDate:格式化日期
     * 
     * @param date
     *            Date <br/>
     * @param format
     *            格式化样式
     * @param locale
     *            Locale <br/>
     * @param timeZone
     *            TimeZone <br/>
     * @return 格式化后的字符串
     */
    public static String formatDate(Date date, String format, Locale locale, TimeZone timeZone) {
        DateTimeFormatter dtf = DateTimeFormat.forPattern(format).withLocale(locale)
                .withZone(DateTimeZone.forTimeZone(timeZone));
        return dtf.print(new DateTime(date)).toUpperCase();
    }

    /**
     * formatDate:格式化日期
     * 
     * @param date
     *            Date <br/>
     * @param format
     *            格式化样式
     * @param locale
     *            Locale <br/>
     * @return 格式化后的字符串
     */
    public static String formatDate(Date date, String format, Locale locale) {
        return formatDate(date, format, locale, TimeZone.getDefault());
    }

    /**
     * formatDate:格式化日期
     * 
     * @param date
     *            Date <br/>
     * @param format
     *            格式化样式
     * @return 格式化后的字符串
     */
    public static String formatDate(Date date, String format) {
        return formatDate(date, format, Locale.US);
    }

}
