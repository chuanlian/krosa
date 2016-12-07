package com.baidu.pangu.vo;

/**
 * Created by yangchuanlian on 2016/8/5.
 */
public class TestObject {

    private transient Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
