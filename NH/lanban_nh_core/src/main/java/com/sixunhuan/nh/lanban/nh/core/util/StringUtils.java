package com.sixunhuan.nh.lanban.nh.core.util;

import com.sixunhuan.nh.lanban.nh.core.constants.SysConstants;

/**
 * ClassName: StringUtils <br/>
 * Description: <br/>
 * Date: 2017年3月2日 下午3:24:53 <br/>
 * <br/>
 * 
 * @author 2970(邮箱)
 * 
 *         修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */
public class StringUtils {
    //private static JcfLogger logger = JcfLogFactory.getJcfLogger(StringUtils.class);

    private static final StringUtils stringUtils = new StringUtils();

    /**
     * 将字符串<tt>s</tt>累加<tt>n</tt>次. 如果<code>s == null</code>，那么返回null,如果
     * <code>n <= 0</code>,那么原样返回<tt>s</tt>
     * <p>
     * 比如:
     * <ul>
     * <li>multiply(null,*) ==</li>
     * <li>multiply(text,0) == text</li>
     * <li>multiply(text,-1) == text</li>
     * <li>multiply("",2) == ""</li>
     * <li>multiply("a",2) == "aa"</li>
     * </ul>
     * </p>
     * 
     * @param s
     *            String
     * @param n
     *            int
     * @return String
     */
    public static String multiply(String s, int n) {
        String result = null;
        if (s != null) {
            result = s;
            if (n > 0) {
                StringBuilder sb = new StringBuilder(n * s.length());
                for (int i = 0; i < n; i++) {
                    sb.append(s);
                }
                result = sb.toString();
            }
        }
        return result;
    }

    /**
     * 判断给定的字符串是否为空
     * 
     * @param s
     *            String
     * @return boolean
     */
    public static boolean isNotEmpty(String s) {
        return !isEmpty(s);
    }

    /**
     * 见{@link org.apache.commons.lang.StringUtils#isEmpty(String)}
     * 
     * @param s
     *            String
     * @return boolean
     */
    public static boolean isEmpty(String s) {
        return org.apache.commons.lang.StringUtils.isEmpty(s);
    }

    /**
     * 见{@link org.apache.commons.lang.StringUtils#equals(String, String)}
     * 
     * @param text1
     *            String
     * @param text2
     *            String
     * @return boolean
     */
    public static boolean equals(String text1, String text2) {
        return org.apache.commons.lang.StringUtils.equals(text1, text2);
    }

    /**
     * 见
     * {@link org.apache.commons.lang.StringUtils#equalsIgnoreCase(String, String)}
     * 
     * @param text1
     *            String
     * @param text2
     *            String
     * @return boolean
     */
    public static boolean equalsIgnoreCase(String text1, String text2) {
        return org.apache.commons.lang.StringUtils.equalsIgnoreCase(text1, text2);
    }

    /**
     * 私有的构造方法
     */
    private StringUtils() {

    }

    /**
     * 
     * tooStringEqual:
     * 
     * @exception <br/>
     * @param stra
     *            String <br/>
     * @param strb
     *            String <br/>
     * @return false <br/>
     */
    public static boolean twoStringEqualWithStringNull(String stra, String strb) {
        if (StringUtils.isEmpty(stra)) {
            stra = SysConstants.STRING_NULL;
        }
        if (StringUtils.isEmpty(strb)) {
            strb = SysConstants.STRING_NULL;
        }
        if (stra.equalsIgnoreCase(strb)) {
            return true;
        }
        return false;

    }

}
