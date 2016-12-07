package com.baidu.pangu;

import com.baidu.driver4j.bdrp.client.BdrpClient;
import com.baidu.pangu.bdrp.TestService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;

/**
 * Created by yangchuanlian on 2016/6/27.
 */


public class bdrpTest {

    ApplicationContext applicationContext;


    @Before
    public void setUp() {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void test() {
        TestService testService = (TestService) applicationContext.getBean("testService");
        testService.sayHi("alex");
    }



}
