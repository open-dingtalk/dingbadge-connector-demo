/**
 * Alibaba-inc.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.dingtalk.dingbadge.controller;

import com.alibaba.fastjson.JSON;
import com.aliyun.dingtalkyida_1_0.models.SearchFormDatasRequest;
import com.aliyun.dingtalkyida_1_0.models.SearchFormDatasResponseBody;
import com.dingtalk.dingbadge.model.BadgeQueryRequest;
import com.dingtalk.dingbadge.model.BadgeQueryResponse;
import com.dingtalk.dingbadge.util.DingConnectorUtil;
import com.dingtalk.dingbadge.util.DingtalkYidaClient;
import org.apache.commons.codec.binary.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 钉工牌查询连接器demo
 *
 * @author moheng.ll
 * @version $Id: BadgeConnectorController.java, v 0.1 2022-03-10 10:19 上午 moheng.ll Exp $$
 */
@Controller
public class BadgeConnectorController {

    /**
     * 连接器平台
     */
    private static final String API_SECRET = "your api secret";

    /**
     * 连接器平台请求中签名串
     */
    private static final String HEADER_SIGNATURE = "x-ddpaas-signature";

    /**
     * 连接器平台请求中时间戳
     */
    private static final String HEADER_TIMESTAMP = "x-ddpaas-signature-timestamp";

    /**
     * 宜搭平台的表单应用编码
     */
    private static final String YIDA_APP_TYPE = "your app type";

    /**
     * 宜搭平台的表单uuid
     */
    private static final String YIDA_FORM_UUID = "your form uuid";

    /**
     * 宜搭平台的表单应用秘钥
     */
    private static final String YIDA_SYS_TOKEN = "your system token";

    /**
     * 宜搭平台的表单-员工字段
     */
    private static final String YIDA_EMPLOYEE_FIELD = "EmployeeField_8f66";

    /**
     * 宜搭平台的表单-员工字段
     */
    private static final String YIDA_BACKGROUND_FIELD = "TextField_72c1";

    /**
     * 钉钉开放平台应用（企业自建）-AppKey
     */
    private static final String APP_KEY = "your appKey";

    /**
     * 钉钉开放平台应用（企业自建）-AppSecret
     */
    private static final String APP_SECRET = "your appSecret";


    /**
     * 钉工牌查询
     *
     * @param signature 签名串
     * @param timestamp 时间戳
     * @param request   请求体
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/badgeQuery")
    public String badgeQuery(@RequestHeader(HEADER_SIGNATURE) String signature, @RequestHeader(HEADER_TIMESTAMP) String timestamp, @RequestBody
            BadgeQueryRequest request) throws Exception {

        BadgeQueryResponse badgeQueryResponse = new BadgeQueryResponse();


        // 1. 参数校验
        if (StringUtils.equals(signature, DingConnectorUtil.calcSignature(API_SECRET, timestamp))) {
            // 2. 查询宜搭数据

            SearchFormDatasRequest searchFormDatasRequest = new SearchFormDatasRequest()
                    .setSystemToken(YIDA_SYS_TOKEN)
                    .setFormUuid(YIDA_FORM_UUID)
                    .setUserId(request.getStaffId())
                    .setAppType(YIDA_APP_TYPE)
                    .setSearchFieldJson("{\""+YIDA_EMPLOYEE_FIELD+"_id\": [\""+request.getStaffId()+"\"]}");
            String accessToken = DingtalkYidaClient.getAccessToken(APP_KEY, APP_SECRET);
            SearchFormDatasResponseBody.SearchFormDatasResponseBodyData data = DingtalkYidaClient.getOneFormData(searchFormDatasRequest, accessToken);

            // 3. 构造钉工牌返回结果
            badgeQueryResponse.setSuccess(true);
            badgeQueryResponse.setQrBackgroundImage((String)data.getFormData().get(YIDA_BACKGROUND_FIELD));

        } else {
            badgeQueryResponse.setSuccess(false);
            badgeQueryResponse.setErrorCode("xxx");
            badgeQueryResponse.setErrorCode("signature check error");
        }

        return JSON.toJSONString(badgeQueryResponse);
    }


}
