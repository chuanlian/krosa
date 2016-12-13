package com.baidu.pangu.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by yangchuanlian on 2016/12/13.
 */
public class UserInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation arg0) throws Throwable {
        try {

            // 拦截方法是否是UserService接口的printUser方法
            if (arg0.getMethod().getName().equals("printUser")) {
                Object[] args = arg0.getArguments();// 被拦截的参数
                System.out.println("user:" + args[0]);
                arg0.getArguments()[0] = "hello!";// 修改被拦截的参数

            }

            System.out.println(arg0.getMethod().getName() + "---!");
            return arg0.proceed();// 运行UserService接口的printUser方法

        } catch (Exception e) {
            throw e;
        }
    }
}
