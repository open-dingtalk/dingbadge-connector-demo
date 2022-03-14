/**
 * Alibaba-inc.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.dingtalk.dingbadge.model;

/**
 * 码子标题区域
 *
 * @author moheng.ll
 * @version $Id: SubTitle.java, v 0.1 2022-03-14 4:03 下午 moheng.ll Exp $$
 */
public class SubTitle {
    /**
     * 标题
     */
    private String title;

    /**
     * 颜色
     */
    private String color;

    /**
     * Getter method for property title.
     *
     * @return property value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter method for property title.
     *
     * @param title value to be assigned to property title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter method for property color.
     *
     * @return property value of color
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter method for property color.
     *
     * @param color value to be assigned to property color
     */
    public void setColor(String color) {
        this.color = color;
    }
}
