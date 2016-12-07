package com.baidu.pangu.bdrp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yangchuanlian on 2016/7/14.
 */
public class App3 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestService testService = (TestService) applicationContext.getBean("testService");

        testService.sayHi("yangkaixin");
    }
}
