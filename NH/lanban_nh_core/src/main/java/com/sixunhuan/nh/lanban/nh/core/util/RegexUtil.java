/**
 * Copyright (c) 2016,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 * Project Name:ubs_nh_core
 * Package Name:com.travelsky.pss.ubs.nh.core.util
 * File Name:RegexUtil.java
 * Date:2016年12月29日 上午11:25:20
 * 
 */
package com.sixunhuan.nh.lanban.nh.core.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ClassName: RegexUtil <br/>
 * Description: 一些需求格式校验 Date: 2016年12月29日 上午11:25:20 <br/>
 * <br/>
 * 
 * @author TPF(tianpengfeiwork@sina.com)
 * 
 *         修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */

public class RegexUtil {
    /*
     * 6位年月日 正则校验 ，能够识别 润年 以及大小月
     */
    private static final String REGEX_DATE_YYMMDD = "^([0-9]{2})(((0[13578]|1[02])(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)(0[1-9]|[12][0-9]|30))|(02(0[1-9]|[1][0-9]|2[0-8])))|(((0[48]|[2468][048]|[13579][26]))0229)$";
    /*
     * 时间校验HHmm
     */
    private static final String REGEX_DATE_TIME_HHMM = "^(([0-1][0-9])|([1-2][0-3]))([0-5][0-9])$";
    private static final String REGEX_DATE_TIME_YYMMDDHHMM = "^((([0-9]{2})(((0[13578]|1[02])(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)(0[1-9]|[12][0-9]|30))|(02(0[1-9]|[1][0-9]|2[0-8])))|(((0[48]|[2468][048]|[13579][26]))0229)))(([0-1][0-9])|([1-2][0-3]))([0-5][0-9])$";

    /*
     * 航班号的验证，包含2位航空公司代码，以及后缀
     */
    private static final String REGEX_FLIGHT_AIRLINE_NUM_TWO = "^[0-9A-Z][A-Z][0-9]{1,4}[A-Z]{0,1}|^[A-Z][0-9A-Z][0-9]{1,4}[A-Z]{0,1}";

    /**
     * 
     * checkDateStr:校验6位String(yymmdd) 时间是否合理 。分闰年，大小月。 比如:
     * <ul>
     * <li>150229 返回 false</li>
     * <li>151131 返回 false</li>
     * <li>140229 返回 true</li>
     * <li>151231 返回 true</li>
     * </ul>
     * 
     * @param dateStr
     *            String :yymmdd
     * @return boolean
     */
    public static boolean checkDateStrYYMMDD(String dateStr) {
        Pattern pattern = Pattern.compile(REGEX_DATE_YYMMDD);
        Matcher matcher = pattern.matcher(dateStr);
        return matcher.matches();
    }

    /**
     * 
     * checkDateTimeStr:校验4位String(HHmm) 时间是否合理 。 比如:
     * <ul>
     * <li>1560 返回 false</li>
     * <li>1561 返回 false</li>
     * <li>2401 返回 false</li>
     * <li>1600 返回 true</li>
     * <li>0001 返回 true</li>
     * </ul>
     * 
     * @param timeStr
     *            String HHmm
     * @return boolean
     */
    public static boolean checkTimeStrHHMM(String timeStr) {
        Pattern pattern = Pattern.compile(REGEX_DATE_TIME_HHMM);
        Matcher matcher = pattern.matcher(timeStr);
        return matcher.matches();
    }

    /**
     * 
     * checkDateTimeStr:校验10位String(yyMMddHHmm) 日期时间是否合理 。 比如:
     * <ul>
     * <li>1502291521 返回 false</li>
     * <li>1511311224 返回 false</li>
     * <li>1402291560 返回 false</li>
     * <li>1512312401 返回 false</li>
     * <li>1402290001 返回 true</li>
     * </ul>
     * 
     * @param dateTimeStr
     *            string yyMMddHHmm
     * @return boolean
     */
    public static boolean checkDateTimeStrYYMMDDHHMM(String dateTimeStr) {
        Pattern pattern = Pattern.compile(REGEX_DATE_TIME_YYMMDDHHMM);
        Matcher matcher = pattern.matcher(dateTimeStr);
        return matcher.matches();
    }

    /**
     * 
     * chececkFilghtAllNanme:航班号的验证，包含2位航空公司代码，以及后缀
     * 
     * @param filghtAllNanme
     *            String
     * @return boolean
     */
    public static boolean chececkFilghtAllNanme(String filghtAllNanme) {
        Pattern pattern = Pattern.compile(REGEX_FLIGHT_AIRLINE_NUM_TWO);
        Matcher matcher = pattern.matcher(filghtAllNanme);
        return matcher.matches();
    }
}
