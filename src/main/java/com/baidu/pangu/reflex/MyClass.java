package com.baidu.pangu.reflex;

import java.io.Serializable;

/**
 * Created by yangchuanlian on 2016/7/18.
 */
public class MyClass implements Serializable {

    private String name;

    public MyClass() {

    }

    public MyClass(String name) {
        this.name = name;
    }

    public void sayHi() {
        System.out.println("hi," + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
