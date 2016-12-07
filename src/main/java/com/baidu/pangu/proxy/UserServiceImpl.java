package com.baidu.pangu.proxy;

/**
 * Created by yangchuanlian on 2016/7/18.
 */
public class UserServiceImpl implements UserService {

    /**
     * 目标方法
     */
    @Override
    public void add() {
        System.out.println("--------------------add---------------");
    }
}
