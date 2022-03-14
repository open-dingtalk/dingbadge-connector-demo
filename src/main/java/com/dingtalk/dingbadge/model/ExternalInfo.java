/**
 * Alibaba-inc.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.dingtalk.dingbadge.model;

/**
 * 码扩展信息
 *
 * @author moheng.ll
 * @version $Id: ExternalInfo.java, v 0.1 2022-03-14 3:56 下午 moheng.ll Exp $$
 */
public class ExternalInfo {

    /**
     * 标题
     */
    private String title;

    /**
     * 子标题
     */
    private String subTitle;

    /**
     * 链接
     */
    private String url;

    /**
     * 是否可见
     */
    private Boolean visible;

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
     * Getter method for property subTitle.
     *
     * @return property value of subTitle
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * Setter method for property subTitle.
     *
     * @param subTitle value to be assigned to property subTitle
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    /**
     * Getter method for property url.
     *
     * @return property value of url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Setter method for property url.
     *
     * @param url value to be assigned to property url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter method for property visible.
     *
     * @return property value of visible
     */
    public Boolean isVisible() {
        return visible;
    }

    /**
     * Setter method for property visible.
     *
     * @param visible value to be assigned to property visible
     */
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
}
