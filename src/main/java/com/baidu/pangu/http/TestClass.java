package com.baidu.pangu.http;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by yangchuanlian on 2016/8/15.
 */
public class TestClass {

    private String code;

    private String user;

    private String password;

    @JSONField(name = "taskClueMapListJSONString")
    private List<Ob1> ob1s;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Ob1> getOb1s() {
        return ob1s;
    }

    public void setOb1s(List<Ob1> ob1s) {
        this.ob1s = ob1s;
    }
}
