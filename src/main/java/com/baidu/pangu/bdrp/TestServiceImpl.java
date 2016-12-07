package com.baidu.pangu.bdrp;

/**
 * Created by yangchuanlian on 2016/6/27.
 */
public class TestServiceImpl implements TestService {

    @Override
    public void sayHi(String name) {
        System.out.println("hi," + name);
    }
}
