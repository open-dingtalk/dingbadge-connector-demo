/**
 * Alibaba-inc.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.dingtalk.dingbadge.util;

import com.aliyun.dingtalkyida_1_0.models.SearchFormDatasHeaders;
import com.aliyun.dingtalkyida_1_0.models.SearchFormDatasRequest;
import com.aliyun.dingtalkyida_1_0.models.SearchFormDatasResponse;
import com.aliyun.dingtalkyida_1_0.models.SearchFormDatasResponseBody;
import com.aliyun.teaopenapi.models.Config;
import com.aliyun.teautil.models.RuntimeOptions;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiGettokenRequest;
import com.dingtalk.api.response.OapiGettokenResponse;
import com.taobao.api.ApiException;

/**
 * 钉钉宜搭开放接口客户端
 *
 * @author moheng.ll
 * @version $Id: DingtalkClient.java, v 0.1 2022-03-11 9:11 下午 moheng.ll Exp $$
 */
public class DingtalkYidaClient {

    /**
     * 从宜搭表单获取数据
     *
     * @param searchFormDatasRequest 查询请求对象
     * @return 宜搭表单数据
     * @throws Exception
     */
    public static SearchFormDatasResponseBody.SearchFormDatasResponseBodyData getOneFormData(SearchFormDatasRequest searchFormDatasRequest, String accessToken) throws Exception {
        com.aliyun.dingtalkyida_1_0.Client client = createClient();
        SearchFormDatasHeaders searchFormDatasHeaders = new SearchFormDatasHeaders();
        searchFormDatasHeaders.xAcsDingtalkAccessToken = accessToken;

        SearchFormDatasResponse response = client.searchFormDatasWithOptions(searchFormDatasRequest, searchFormDatasHeaders, new RuntimeOptions());
        return response.getBody().data.get(0);

    }


    /**
     * 使用 Token 初始化账号Client
     *
     * @return Client
     * @throws Exception
     */
    public static com.aliyun.dingtalkyida_1_0.Client createClient() throws Exception {
        Config config = new Config();
        config.protocol = "https";
        config.regionId = "central";
        return new com.aliyun.dingtalkyida_1_0.Client(config);
    }

    /**
     * 企业自建应用获取accessToken
     *
     * @param appKey    应用AppKey
     * @param appSecret 应用AppSecret
     * @return
     */
    public static String getAccessToken(String appKey, String appSecret) {
        try {
            DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/gettoken");
            OapiGettokenRequest req = new OapiGettokenRequest();
            req.setCorpid(appKey);
            req.setCorpsecret(appSecret);
            req.setHttpMethod("GET");
            OapiGettokenResponse rsp = client.execute(req);
            return rsp.getAccessToken();
        } catch (ApiException e) {
            return null;
        }

    }
}
