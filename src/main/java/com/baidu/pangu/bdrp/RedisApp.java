/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.pangu.bdrp;

import com.alibaba.fastjson.JSON;
import com.baidu.bjf.cache.redis.RedisClient;
import com.baidu.driver4j.bdrp.client.BdrpClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yangchuanlian on 2016/12/6.
 */
public class RedisApp {

    public static void main(String[] args) throws Exception {
        final RedisClient client = new RedisClient();
        client.setRedisServer("10.36.55.25");
        client.setPort(9000);
        // client.setRedisAuthKey("123456");
        client.init();
        // client.flushall();

        // test hash set
        String key = "SessionKey";
        client.hput(key, "F", "100");
        Object value = client.hget(key, "F");
        if ("100".equals(value)) {
            System.out.println("hput ok");
            System.out.println("hget ok");
        }

        client.set("yangchuanlian", "yangchuan");
        System.out.println(client.get("yangchuanlian"));


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BdrpClient bdrpClient = (BdrpClient) applicationContext.getBean("advancedbnsBdrpClientFactory");
        System.out.println(bdrpClient.get("yangchuanlian"));

    }
}
