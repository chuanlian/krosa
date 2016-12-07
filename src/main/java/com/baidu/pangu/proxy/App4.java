package com.baidu.pangu.proxy;

/**
 * Created by yangchuanlian on 2016/7/18.
 */
public class App4 {

    public static void main(String[] args) {
        staticProxy();
        dynamicProxy();
    }

    private static void staticProxy() {
        AbstractObject obj = new ProxyObject();
        obj.operation();
    }

    private static void dynamicProxy() {
        UserService userService = new UserServiceImpl();
        MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);
        UserService proxy = (UserService) invocationHandler.getProxy();
        proxy.add();
    }
}
