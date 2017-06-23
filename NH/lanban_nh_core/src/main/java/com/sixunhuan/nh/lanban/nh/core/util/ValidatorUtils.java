/**
 * @Copyright (c) 2002-2012 Travelsky Limited. All rights reserved.
 */
package com.sixunhuan.nh.lanban.nh.core.util;

/**
 * 提供数据或格式验证的工具类
 * 
 * @author 刘永健(liuyongjian@travelsky.com)
 * @since 2013/01/07
 */
public class ValidatorUtils {

    /**
     * 判断给定的年份是否闰年
     * 
     * @param year
     *            int
     * @return boolean
     */
    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static final int ASCII_BEGIN = 32;

    public static final int ASCII_END = 126;

}
