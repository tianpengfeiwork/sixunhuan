/*
 * @(#) StringPool.java
 * @Author:liuyongjian(liuyongjian@travelsky.com) 2013-02-28
 * @Copyright (c) 2002-2013 Travelsky Limited. All rights reserved.
 */
package com.sixunhuan.nh.lanban.nh.core.util;

/**
 * 字符串常量池
 * 
 * @author liuyongjian
 * @version 1.0
 */
public class StringPool {
    /**
     * 表示一个逻辑与字符串(&amp;)
     */
    public static final String AMPERSAND = "&";
    /**
     * 表示一个逻辑与字符串的html实体形式(&amp;amp;)
     */
    public static final String AMPERSAND_ENCODED = "&amp;";
    /**
     * 表示一个单引号字符串(')
     */
    public static final String APOSTROPHE = "'";
    /**
     * ASCII字母表
     */
    public static final String[] ASCII_TABLE = new String[128];

    /**
     * 表示字符串(@)
     */
    public static final String AT = "@";

    /**
     * 反斜杠(\)
     */
    public static final String BACK_SLASH = "\\";

    /**
     * 表示字符串(BETWEEN)
     */
    public static final String BETWEEN = "BETWEEN";

    /**
     * 空字符串
     */
    public static final String BLANK = "";

    /**
     * 尖号(^)
     */
    public static final String CARET = "^";

    /**
     * 表示字符串(]]>)
     */
    public static final String CDATA_CLOSE = "]]>";

    /**
     * 表示字符串(<![CDATA[)
     */
    public static final String CDATA_OPEN = "<![CDATA[";

    /**
     * 右中括号(])字符串
     */
    public static final String CLOSE_BRACKET = "]";

    /**
     * 右括号(})字符串
     */
    public static final String CLOSE_CURLY_BRACE = "}";

    /**
     * 右括号())字符串
     */
    public static final String CLOSE_PARENTHESIS = ")";

    /**
     * 冒号(:)字符串
     */
    public static final String COLON = ":";
    /**
     * 逗号(,)字符串
     */
    public static final String COMMA = ",";

    /**
     * 一个逗号和一个空格字符组成的字符串
     */
    public static final String COMMA_AND_SPACE = ", ";
    /**
     * 表示破折号(-)字符串
     */
    public static final String DASH = "-";
    /**
     * 表示美元符号($)字符串
     */
    public static final String DOLLAR = "$";
    /**
     * 表示字符串(${)
     */
    public static final String DOLLAR_AND_OPEN_CURLY_BRACE = "${";
    /**
     * 表示两个单引号('')的字符串
     */
    public static final String DOUBLE_APOSTROPHE = "''";
    /**
     * 表示两个右中括号(]])
     */
    public static final String DOUBLE_CLOSE_BRACKET = "]]";
    /**
     * 表示两个右大括号(}})
     */
    public static final String DOUBLE_CLOSE_CURLY_BRACE = "}}";
    /**
     * 表示两个英文破折号(--)
     */
    public static final String DOUBLE_DASH = "--";
    /**
     * 表示两个左中括号([[)
     */
    public static final String DOUBLE_OPEN_BRACKET = "[[";
    /**
     * 表示两个左大括号({{)
     */
    public static final String DOUBLE_OPEN_CURLY_BRACE = "{{";
    /**
     * 表示两个句点(..)
     */
    public static final String DOUBLE_PERIOD = "..";
    /**
     * 表示两个双引号("")
     */
    public static final String DOUBLE_QUOTE = "\"\"";
    /**
     * 表示两个斜杠(//)
     */
    public static final String DOUBLE_SLASH = "//";
    /**
     * 表示两个空格
     */
    public static final String DOUBLE_SPACE = "  ";
    /**
     * 表示两个下划线(__)
     */
    public static final String DOUBLE_UNDERLINE = "__";
    /**
     * 表示感叹号(!)字符串
     */
    public static final String EXCLAMATION = "!";

    /**
     * 表示等号(=)字符串
     */
    public static final String EQUAL = "=";
    /**
     * 表示字符串(false)
     */
    public static final String FALSE = "false";
    /**
     * 斜杠(/)字符串
     */
    public static final String FORWARD_SLASH = "/";
    /**
     * 表示四个空格的字符串
     */
    public static final String FOUR_SPACES = "    ";
    /**
     * 反撇号(`)
     */
    public static final String GRAVE_ACCENT = "`";
    /**
     * 大于号(&gt;)字符串
     */
    public static final String GREATER_THAN = ">";
    /**
     * 大于或等于(&gt;=)字符串
     */
    public static final String GREATER_THAN_OR_EQUAL = ">=";
    /**
     * 表示一个unicode字符(\\u00A1)的字符串
     */
    public static final String INVERTED_EXCLAMATION = "\u00A1";
    /**
     * 表示一个unicode字符(\\u00BF)的字符串
     */
    public static final String INVERTED_QUESTION = "\u00BF";

    /**
     * 表示字符串(IS NOT NULL)
     */
    public static final String IS_NOT_NULL = "IS NOT NULL";

    /**
     * 表示字符串(IS NULL)
     */
    public static final String IS_NULL = "IS NULL";
    /**
     * 表示字符串(ISO-8859-1)
     */
    public static final String ISO_8859_1 = "ISO-8859-1";
    /**
     * 表示小于号(&lt;)字符串
     */
    public static final String LESS_THAN = "<";
    /**
     * 表示小于或等于号(&lt;=)字符串
     */
    public static final String LESS_THAN_OR_EQUAL = "<=";
    /**
     * 表示字符串(LIKE)
     */
    public static final String LIKE = "LIKE";
    /**
     * 表示减号(-)字符串
     */
    public static final String MINUS = "-";
    /**
     * 表示字符串(&amp;nbsp;)
     */
    public static final String NBSP = "&nbsp;";
    /**
     * 表示换行符(\n)字符串
     */
    public static final String NEW_LINE = "\n";
    /**
     * 表示不等于(!=)字符串
     */
    public static final String NOT_EQUAL = "!=";
    /**
     * 表示字符串(NOT LIKE)
     */
    public static final String NOT_LIKE = "NOT LIKE";
    /**
     * 表示字符串(null)
     */
    public static final String NULL = "null";
    /**
     * 表示左中括号([)字符串
     */
    public static final String OPEN_BRACKET = "[";
    /**
     * 表示左大于号({)字符串
     */
    public static final String OPEN_CURLY_BRACE = "{";
    /**
     * 表示左小括号(()字符串
     */
    public static final String OPEN_PARENTHESIS = "(";
    /**
     * 表示和当前操作系统相关的行分割符.
     * <p>
     * <ul>
     * <li>在Unix/Linux系统上，行分隔符是\n</li>
     * <li>在Windows系统上，行分割符是\r\n</li>
     * </ul>
     * </p>
     */
    public static final String OS_EOL = System.getProperty("line.separator");
    /**
     * 表示百分号(%)字符串
     */
    public static final String PERCENT = "%";
    /**
     * 表示句点(.)字符串
     */
    public static final String PERIOD = ".";
    /**
     * 表示竖线(|)字符串
     */
    public static final String PIPE = "|";
    /**
     * 表示加号(+)字符串
     */
    public static final String PLUS = "+";
    /**
     * 表示井号(#)字符串
     */
    public static final String POUND = "#";
    /**
     * 表示问号(?)字符串
     */
    public static final String QUESTION = "?";
    /**
     * 表示双引号(")字符串
     */
    public static final String QUOTE = "\"";
    /**
     * 表示回车符(\r)字符串
     */
    public static final String RETURN = "\r";
    /**
     * 表示回车换行符(\r\n)字符串
     */
    public static final String RETURN_NEW_LINE = "\r\n";
    /**
     * 表示分号(;)字符串
     */
    public static final String SEMICOLON = ";";
    /**
     * 相当于{@link #FORWARD_SLASH}
     */
    public static final String SLASH = FORWARD_SLASH;

    /**
     * 空格字符串
     */
    public static final String SPACE = " ";

    /**
     * 空字符串
     */
    public static final String EMPTY = "";

    /**
     * 星号字符串(*)
     */
    public static final String STAR = "*";

    /**
     * 制表符字符串(\t)
     */
    public static final String TAB = "\t";

    /**
     * 波浪线字符串(~)
     */
    public static final String TILDE = "~";

    /**
     * 表示字符串(true)
     */
    public static final String TRUE = "true";

    /**
     * 下划线字符串(_)
     */
    public static final String UNDERLINE = "_";

    /**
     * 表示字符串(UTC)
     */
    public static final String UTC = "UTC";

    /**
     * 表示字符串(UTF-8)
     */
    public static final String UTF8 = "UTF-8";
    /**
     * 表示字符串(RSA). RSA是一种费对称加密算法.
     */
    public static final String RSA = "RSA";
    /**
     * 表示字符串(DES). DES
     */
    public static final String DES = "DES";
    /**
     * 表示字符串(AES). AES是一种对称加密算法的名称
     */
    public static final String AES = "AES";
    /**
     * 表示字符串(TripleDes), TripleDes是三重DES加密算法，是一种对称加密算法的名称
     */
    public static final String TRIPLE_DES = "TripleDes";
    /**
     * 表示字符串(Blowfish)。 Blowfish是一种对称加密算法的名称
     */
    public static final String BLOWFISH = "Blowfish";
    /**
     * 换行符
     */
    public static final String ENTER_LINE = "\r\n";

    static {
        for (int i = 0; i < 128; i++) {
            ASCII_TABLE[i] = String.valueOf((char) i);
        }
    }

    /**
     * 私有的构造方法
     */
    private StringPool() {

    }
}
