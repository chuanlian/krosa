package com.baidu.pangu.interceptor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yangchuanlian on 2016/12/13.
 */
public class App {


    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext_interceptor.xml");

        UserService us = (UserService) ctx.getBean("userService");
        us.printUser("shawn");
        System.out.println("=========");
        us.printUser("printUser");
    }
}
