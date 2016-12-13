package com.baidu.pangu.interceptor;

/**
 * Created by yangchuanlian on 2016/12/13.
 */
public class UserServiceImpl implements UserService {
    @Override
    public void printUser(String user) {
        System.out.println("printUser user:" + user);// 显示user
    }
}
