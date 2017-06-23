/**
 *
 * @(#)Xml2Object.java 1.0.0 2014-3-22 by Ever
 *
 * Copyright (c) 2013 TravelSky. 
 * All rights reserved.    
 * Travelsky CONFIDENTIAL   
 *
 **/

package com.sixunhuan.nh.lanban.nh.core.util;

import java.io.ByteArrayInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;


/**
 * Description: <br/>
 * Xml操作工具类 <br/>
 * 
 * <b>修改历史:</b> <br/>
 * version 1.0.0 2014-3-22 Ever Initial Version <br/>
 */
public class XmlUtils {
   /* *//**
     * 
     * xml2Object: Description <br/>
     * 
     * @exception <br/>
     * @param xml
     *            String <br/>
     * @param clazz
     *            Class<T> <br/>
     * @return (T) um.unmarshal
     * @throws UbsException
     *             if has error <br/>
     *//*
    @SuppressWarnings("unchecked")
    public static <T> T xml2Object(String xml, Class<T> clazz) throws UbsException {
        // 记录当前的classloader
        ClassLoader currentClassloader = Thread.currentThread().getContextClassLoader();
        // 将当前上下文的classloader设置为目标classloader
        Thread.currentThread().setContextClassLoader(clazz.getClassLoader());
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
            Unmarshaller um = jaxbContext.createUnmarshaller();
            return (T) um.unmarshal(new ByteArrayInputStream(xml.getBytes("UTF-8")));
        } catch (Exception e) {
            throw new UbsException(ErrorCodes.PROPERTY_READ_ERROR);
        } finally {
            // 反序列化完毕,将当前的上下文的classloader还原
            Thread.currentThread().setContextClassLoader(currentClassloader);
        }
    }

    *//**
     * 私有的构造方法
     *//*
    *//**
     * Creates a new instance of XmlUtils.<br/>
     * Description: <br/>
     *//*
    private XmlUtils() {

    }*/
}
