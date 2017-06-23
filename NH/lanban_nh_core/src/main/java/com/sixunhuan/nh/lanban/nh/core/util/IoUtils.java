/*
 * @(#) IOUtils.java
 * @Author:Ever(yszhang@travelsky.com) 2013-02-28
 * @Copyright (c) 2002-2013 Travelsky Limited. All rights reserved.
 */
package com.sixunhuan.nh.lanban.nh.core.util;

import java.io.IOException;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

/**
 * IO工具类
 * 
 * @author liuyongjian
 * @version 1.0
 */
public class IoUtils {

    /**
     * 读取输入流的内容，并转换成字节数组
     * 
     * @exception
     * @param is
     *            InputStream
     * @return byte[]
     * @throws IOException
     *             if has error
     */
    public static byte[] toByteArray(InputStream is) throws IOException {
        return org.apache.commons.io.IOUtils.toByteArray(is);
    }

    /**
     * 读取输入流的内容，并根据指定的字符集转换成字符串
     * 
     * @exception
     * @param is
     *            InputStream
     * @param charset
     *            String
     * @return String
     * @throws IOException
     *             if has error
     */
    public static String toString(InputStream is, String charset) throws IOException {
        return new String(toByteArray(is), charset);
    }

    /**
     * getConfigFileInputStream 根据classLoader获取InputStream
     * 
     * @param cl
     *            ClassLoader
     * @param fileName
     *            文件名
     * @return InputStream
     * @throws IOException
     */
    public static InputStream getConfigFileInputStream(ClassLoader cl, String fileName) throws IOException {
        InputStream is = cl.getResourceAsStream(fileName);
        return is;
    }

    /**
     * 优雅地关闭输入字节流
     * 
     * @param is
     *            InputStream
     */
    public static void closeQuietly(InputStream is) {
        org.apache.commons.io.IOUtils.closeQuietly(is);
    }

    /**
     * 优雅地关闭输出字节流
     * 
     * @param os
     */
    public static void closeQuietly(OutputStream os) {
        org.apache.commons.io.IOUtils.closeQuietly(os);
    }

    /**
     * 优雅地关闭输入字符流
     * 
     * @param reader
     *            Reader
     */
    public static void closeQuietly(Reader reader) {
        org.apache.commons.io.IOUtils.closeQuietly(reader);
    }

    /**
     * 从输入字节流<tt>is</tt>读入全部内容并转换成文本, 编码采用utf-8
     * 
     * @exception
     * @param is
     *            InputStream
     * @return String
     * @throws IOException
     *             if has error
     */
    public static String readText(InputStream is) throws IOException {
        return readText(is, CharsetUtils.UTF8);
    }

    /**
     * 读入整个文本
     * 
     * @exception
     * @param is
     *            InputStream
     * @param encoding
     *            String
     * @return String
     * @throws IOException
     *             if has error
     */
    public static String readText(InputStream is, String encoding) throws IOException {
        byte[] buf = toByteArray(is);
        return new String(buf, encoding);
    }

    /**
     * 获取配置文件的输入流
     * OSGI容器里：Thread.currentThread().getContextClassLoader().getResource
     * ("sys/common.properties")
     * =jar:file:/E:/apache-karaf-jcf1.2.2/data/cache/org
     * .eclipse.osgi/bundles/145
     * /1/.cp/dep_common_core-1.0.0.jar!/sys/common.properties
     * 需要通过JAR来获取，而IoUtils
     * .class.getResource=bundleresource://145.fwk20545116:27/
     * sys/common.properties 所以为了处理方便，使用InputStream
     * 
     * @param fileName
     *            文件名,不支持文件夹，如果是文件夹虽然InputStream不为空，但其没有任何内容
     * @return InputStream
     * @throws IOException
     */
    public static InputStream getConfigFileInputStream(String fileName) throws IOException {
        ClassLoader cl = IoUtils.class.getClassLoader();
        return getConfigFileInputStream(cl, fileName);
    }
}
