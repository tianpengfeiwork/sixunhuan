/*
 * @(#) CharsetUtils.java
 * @Author:liuyongjian(liuyongjian@travelsky.com) 2013-02-28
 * @Copyright (c) 2002-2013 Travelsky Limited. All rights reserved.
 */
package com.sixunhuan.nh.lanban.nh.core.util;

import java.lang.Character.UnicodeBlock;

/**
 * 字符集工具类
 * 
 * @author liuyongjian
 * @version 1.0
 */
public class CharsetUtils {

    /**
     * LOGGER:the logger.
     * 
     */
    //private static JcfLogger logger = JcfLogFactory.getJcfLogger(CharsetUtils.class);

    /**
     * 表示UTF-8字符集名
     */
    public static final String UTF8 = "UTF-8";
    /**
     * 表示GBK字符集名
     */
    public static final String GBK = "GBK";
    /**
     * 表示GB18030字符集名
     */
    public static final String GB18030 = "GB18030";
    /**
     * 表示ISO8859-1字符集名
     */
    public static final String ISO8859 = "ISO8859-1";
    /**
     * 表示US-ASCII字符集名
     */
    public static final String ASCII = "US-ASCII";
    /**
     * 
     */
    public static final String GB2312 = "GB2312";
    /**
     * 表示GB CODE范围
     */
    static final String GB_CODE = "[\\u4e00-\\u9fa5]|[\\u3400-\\u4dbf]|[\\u9fa6-\\u9fbb]|"
            + "[\\uf900-\\ufa2d]|[\\ufa30-\\ufa6a]|[\\ufa70-\\ufad9]";

}
