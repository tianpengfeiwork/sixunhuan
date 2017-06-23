/**
 * Copyright (c) 2017,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 * Project Name:ubs_nh_core
 * Package Name:com.travelsky.pss.ubs.nh.core.util
 * File Name:PropertyFileUtil.java
 * Date:2017年5月17日 下午2:14:01
 * 
 */
package com.sixunhuan.nh.lanban.nh.core.util;

import java.io.File;

import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;


/**
 * ClassName: PropertyFileUtil <br/>
 * Description: TODO <br/>
 * Date: 2017年5月17日 下午2:14:01 <br/>
 * <br/>
 * 
 * @author Hss(邮箱)
 * 
 *         修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */

public class PropertyFileUtil {

   /* *//**
     * logger:logger
     * 
     *//*
    //private static JcfLogger logger = JcfLogFactory.getJcfLogger(PropertyFileUtil.class);

    *//**
     * 
     * readProperty:读取property文件 <br/>
     * 
     * @param configFileName
     *            文件名称
     * @param prop
     *            存放的property对象
     * @throws IOException
     * @throws UbsException
     * <br/>
     *//*
    public static void readProperty(String configFileName, Properties prop) throws IOException, UbsException {
        InputStream inputStream = null;
        try {
            inputStream = IoUtils.getConfigFileInputStream(configFileName);
            read(inputStream, prop);
        } catch (Exception e) {
            logger.error(LogConstants.UBS_LOG_ERROR_MANUAL, PropertyFileUtil.class.getName() + ".readProperty()",
                    "[ERRORINFO]" + e.getMessage(), e);
        } finally {
            IoUtils.closeQuietly(inputStream);
        }

    }

    *//**
     * 
     * readProperty:根据路径读取配置文件 <br/>
     * 
     * @param path
     *            配置文件路径
     * @param clsLoader
     *            ClassLoader
     * @return Properties
     * @throws UbsException
     * @throws IOException
     *//*
    public static Properties readProperty(String path, ClassLoader clsLoader) throws UbsException, IOException {
        Properties prop = new Properties();
        InputStream inputStream = null;
        try {
            inputStream = IoUtils.getConfigFileInputStream(clsLoader, path);
            read(inputStream, prop);
        } catch (Exception e) {
            logger.error(LogConstants.UBS_LOG_ERROR_MANUAL, PropertyFileUtil.class.getName() + ".readProperty()",
                    "[ERRORINFO]" + e.getMessage(), e);
        } finally {
            IoUtils.closeQuietly(inputStream);
        }
        return prop;
    }

    *//**
     * 
     * read:读取文件 <br/>
     * 
     * @param inputStream
     *            由调用者关闭
     * @param prop
     *            存在读取内容的prop
     * @throws UbsException
     * <br/>
     *//*
    public static void read(InputStream inputStream, Properties prop) throws UbsException {
        InputStreamReader isr = null;
        try {
            isr = new InputStreamReader(inputStream, CharsetUtils.UTF8);
            Properties p = new Properties();
            p.load(isr);
            prop.putAll(p);
        } catch (Exception e) {
            logger.error(LogConstants.UBS_LOG_ERROR_MANUAL, PropertyFileUtil.class.getName() + ".read()", "[ERRORINFO]"
                    + e.getMessage(), e);
        } finally {
            IoUtils.closeQuietly(isr);
        }
    }

    *//**
     * 私有的构造方法
     *//*
    private PropertyFileUtil() {

    }
}

*//**
 * 
 * ClassName: PropertyFilter <br/>
 * Description: 代码规范注释 <br/>
 * Date: 2016-5-24 下午5:42:46 <br/>
 * <br/>
 * 
 * @author zhw(邮箱)
 * 
 *         修改记录
 * @version V1.0.0 2016-5-24 zhw Initial version<br/>
 * 
 *//*
class PropertyFilter implements FileFilter {
    @Override
    public boolean accept(File arg0) {
        return arg0.getName().endsWith(".properties");

    }*/
}
