/**
 * Copyright (c) 2016,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 * Project Name:dep_common_core
 * Package Name:com.travelsky.pss.dep.common.core.util
 * File Name:MathUtils.java
 * Date:2016-2-17 上午10:10:37
 * 
 */

package com.sixunhuan.nh.lanban.nh.core.util;

 
 /**
 * ClassName: MathUtils <br/>
 * Description: 常用的数学工具类 <br/>
 * Date: 2016-2-17 上午10:10:37 <br/>
 * <br/>
 * 
 * @author ZDP(zhangdp@travelsky.com)
 * 
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd ZDP(zhangdp@travelsky.com) 修改信息<br/>
 * 
 */
public class MathUtils {
    /**
     * 
     * minIndex:获取数组最小值的下标<br/>
     * @param ary
     *         待排序的数组
     * @return 该数组最小值的下标
     *    
     */
    public static int minIndex(long[] ary) {
        //最小值(暂时) 
        long minValue = ary[0];
        //下标(暂时)  
        int minIndex = 0;
        for (int i = 1; i < ary.length; i++) {
            if (ary[i] < minValue) {
                minIndex = i;
            }
        }
        
        return minIndex;
    }
}
