/**
 * Alibaba-inc.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.dingtalk.dingbadge.model;

/**
 * 钉工牌查询请求对象
 *
 * @author moheng.ll
 * @version $Id: BadgeQueryRequest.java, v 0.1 2022-03-10 6:22 下午 moheng.ll Exp $$
 */
public class BadgeQueryRequest {

    /**
     * 工号
     */
    private String staffId;

    /**
     * Getter method for property staffId.
     *
     * @return property value of staffId
     */
    public String getStaffId() {
        return staffId;
    }

    /**
     * Setter method for property staffId.
     *
     * @param staffId value to be assigned to property staffId
     */
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }
}
