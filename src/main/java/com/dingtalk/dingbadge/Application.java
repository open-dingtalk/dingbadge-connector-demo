/**
 * Alibaba-inc.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.dingtalk.dingbadge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot 启动类
 *
 * @author moheng.ll
 * @version $Id: Application.java, v 0.1 2022-03-10 9:23 上午 moheng.ll Exp $$
 */
@SpringBootApplication
public class Application {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // 固定的代码 启动springboot程序 初始化spring容器
        SpringApplication.run(Application.class, args);
    }
}
