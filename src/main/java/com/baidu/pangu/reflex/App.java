package com.baidu.pangu.reflex;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * Created by yangchuanlian on 2016/7/18.
 */
public class App {

    private final static Class[] constructorParams = {Serializable.class};

    public static void main(String[] args) throws NoSuchMethodException {
        Class<?> clazz = null;
        try {
            clazz = Class.forName("com.baidu.pangu.reflex.MyClass");
            Constructor cons = clazz.getConstructor();
            try {
                MyClass  myClass = (MyClass) cons.newInstance("yang");
                myClass.sayHi();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
