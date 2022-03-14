/**
 * Alibaba-inc.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.dingtalk.dingbadge.model;

import java.util.List;

/**
 * 钉工牌查询返回对象
 *
 * @author moheng.ll
 * @version $Id: BadgeQueryResponse.java, v 0.1 2022-03-14 3:53 下午 moheng.ll Exp $$
 */
public class BadgeQueryResponse {

    /**
     * 是否调用成功
     */
    private Boolean success;

    /**
     * 异常码
     */
    private String errorCode;

    /**
     * 异常信息
     */
    private String errorMsg;

    /**
     * 码颜色
     */
    private String qrColor;

    /**
     * 码背景图片url
     */
    private String qrBackgroundImage;

    /**
     * 码子标题区域
     */
    private SubTitle subTitle;

    /**
     * 码扩展区域
     */
    private List<ExternalInfo> qrExternalInfo;

    /**
     * 码注释区
     */
    private QrRemark qrRemark;

    /**
     * Getter method for property success.
     *
     * @return property value of success
     */
    public Boolean isSuccess() {
        return success;
    }

    /**
     * Setter method for property success.
     *
     * @param success value to be assigned to property success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * Getter method for property errorCode.
     *
     * @return property value of errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Setter method for property errorCode.
     *
     * @param errorCode value to be assigned to property errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter method for property errorMsg.
     *
     * @return property value of errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Setter method for property errorMsg.
     *
     * @param errorMsg value to be assigned to property errorMsg
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    /**
     * Getter method for property qrColor.
     *
     * @return property value of qrColor
     */
    public String getQrColor() {
        return qrColor;
    }

    /**
     * Setter method for property qrColor.
     *
     * @param qrColor value to be assigned to property qrColor
     */
    public void setQrColor(String qrColor) {
        this.qrColor = qrColor;
    }

    /**
     * Getter method for property qrBackgroundImage.
     *
     * @return property value of qrBackgroundImage
     */
    public String getQrBackgroundImage() {
        return qrBackgroundImage;
    }

    /**
     * Setter method for property qrBackgroundImage.
     *
     * @param qrBackgroundImage value to be assigned to property qrBackgroundImage
     */
    public void setQrBackgroundImage(String qrBackgroundImage) {
        this.qrBackgroundImage = qrBackgroundImage;
    }

    /**
     * Getter method for property subTitle.
     *
     * @return property value of subTitle
     */
    public SubTitle getSubTitle() {
        return subTitle;
    }

    /**
     * Setter method for property subTitle.
     *
     * @param subTitle value to be assigned to property subTitle
     */
    public void setSubTitle(SubTitle subTitle) {
        this.subTitle = subTitle;
    }

    /**
     * Getter method for property qrExternalInfo.
     *
     * @return property value of qrExternalInfo
     */
    public List<ExternalInfo> getQrExternalInfo() {
        return qrExternalInfo;
    }

    /**
     * Setter method for property qrExternalInfo.
     *
     * @param qrExternalInfo value to be assigned to property qrExternalInfo
     */
    public void setQrExternalInfo(List<ExternalInfo> qrExternalInfo) {
        this.qrExternalInfo = qrExternalInfo;
    }

    /**
     * Getter method for property qrRemark.
     *
     * @return property value of qrRemark
     */
    public QrRemark getQrRemark() {
        return qrRemark;
    }

    /**
     * Setter method for property qrRemark.
     *
     * @param qrRemark value to be assigned to property qrRemark
     */
    public void setQrRemark(QrRemark qrRemark) {
        this.qrRemark = qrRemark;
    }
}
