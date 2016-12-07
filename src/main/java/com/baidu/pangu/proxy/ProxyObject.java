package com.baidu.pangu.proxy;

/**
 * Created by yangchuanlian on 2016/7/18.
 */
public class ProxyObject extends AbstractObject {


    private RealObject realObject = new RealObject();

    @Override
    public void operation() {
        //调用目标对象之前可以做相关操作
        Long start = System.currentTimeMillis();
        realObject.operation();
        Long end = System.currentTimeMillis();
        //调用目标对象之后可以做相关操作
        System.out.println("cost time :" + (end - start));
    }
}
