/**
 * Alibaba-inc.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.dingtalk.dingbadge.util;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/**
 * 钉钉连接器工具
 *
 * @author moheng.ll
 * @version $Id: DingConnectorUtil.java, v 0.1 2022-03-14 3:36 下午 moheng.ll Exp $$
 */
public class DingConnectorUtil {

    /**
     * 钉钉连接器
     * @param apiSecret     连接器平台设置的签名密钥
     * @param ts            时间戳
     * @return              签名串
     * @throws Exception
     */
    public static String calcSignature(String apiSecret, String ts) throws Exception {
        Mac mac = Mac.getInstance("HmacSHA256");
        SecretKeySpec key = new SecretKeySpec(apiSecret.getBytes(), "HmacSHA256");
        mac.init(key);
        return Base64.getEncoder()
                .encodeToString(mac.doFinal(ts.getBytes()));

    }
}
