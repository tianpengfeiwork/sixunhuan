/**
 * Copyright (c) 2016,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 * Project Name:gbc_nh_core
 * Package Name:com.travelsky.gbc.nh.util
 * File Name:CollectionUtils.java
 * Date:2016年7月1日 下午6:56:12
 * 
 */
package com.sixunhuan.nh.lanban.nh.core.util;

import java.util.Collection;

/**
 * ClassName: CollectionUtils <br/>
 * Description: <br/>
 * Date: 2016年7月1日 下午6:56:12 <br/>
 * <br/>
 * 
 * @author fanzhao
 * 
 *         修改记录
 * @version 2016年7月1日 maximus Initial version<br/>
 * 
 */

public class CollectionUtils {
    /**
     * isEmpty: Description <br/>
     * 
     * @param co
     *            Collection<?>
     * @return Description <br/>
     */
    public static boolean isEmpty(Collection<?> co) {
        if (co == null || co.size() == 0) {
            return true;
        }
        return false;
    }

    /**
     * isNotEmpty: Description <br/>
     * 
     * @param co
     *            Collection<?>
     * @return Description <br/>
     */
    public static boolean isNotEmpty(Collection<?> co) {
        if (isEmpty(co)) {
            return false;
        }
        return true;
    }
}
