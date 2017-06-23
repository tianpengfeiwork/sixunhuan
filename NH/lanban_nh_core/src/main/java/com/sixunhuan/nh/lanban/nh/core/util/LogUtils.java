/**
 * Copyright (c) 2017,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 * Project Name:ubs_nh_core
 * Package Name:com.travelsky.pss.ubs.nh.core.util
 * File Name:LogUtil.java
 * Date:2017年1月10日 下午3:23:49
 * 
 */
package com.sixunhuan.nh.lanban.nh.core.util;

/**
 * ClassName: LogUtil <br/>
 * Description: <br/>
 * Date: 2017年1月10日 下午3:23:49 <br/>
 * <br/>
 * 
 * @author TPF(tianpengfeiwork@sina.com)
 * 
 *         修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */

public class LogUtils {
    /**
     * 
     * getMethodName:得到当前方法的名字。
     * 比如：com.travelsky.pss.ubs.nh.core.util.LogUtil.getMethodName()，
     * 返回：getMethodName。
     * 
     * <br/>
     * 
     * @return String
     * 
     */
    public static String getMethodName() {
        StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
        return traceElement.getMethodName();
    }

    /**
     * 
     * getClassName:得到当前类名。
     * 比如：com.travelsky.pss.ubs.nh.core.util.LogUtil.getMethodName()，
     * 返回：com.travelsky.pss.ubs.nh.core.util.LogUtil。
     * 
     * 
     * <br/>
     * 
     * @return String
     */
    public static String getClassName() {
        StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
        return traceElement.getClassName();
    }

    /**
     * 
     * getFileName:得到当前文件名
     * 比如：com.travelsky.pss.ubs.nh.core.util.LogUtil.getMethodName()，
     * 返回：LogUtil.java。
     * 
     * 
     * <br/>
     * 
     * @return String
     */
    public static String getFileName() {
        StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
        return traceElement.getFileName();
    }

    /**
     * 
     * getClassMethodName:得到当前类名+方法的名字
     * 比如：com.travelsky.pss.ubs.nh.core.util.LogUtil.getMethodName()，
     * 返回：com.travelsky.pss.ubs.nh.core.util.LogUtil.getMethodName
     * 
     * @return Description <br/>
     */
    public static String getClassMethodName() {
        StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
        return traceElement.getClassName() + "." + traceElement.getMethodName();
    }

}
