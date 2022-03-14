/**
 * Alibaba-inc.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.dingtalk.dingbadge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试页面
 *
 * @author moheng.ll
 * @version $Id: HelloController.java, v 0.1 2022-03-10 9:26 上午 moheng.ll Exp $$
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
