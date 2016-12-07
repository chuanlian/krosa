package com.baidu.pangu.http;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

/**
 * Created by yangchuanlian on 2016/8/15.
 */
public class App {

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.setCode("1234");
        testClass.setPassword("123123");
        testClass.setUser("23adfsfasd");

        List<Ob1> ob1s = new ArrayList<Ob1>();
        for (int k = 0; k < 10; k++) {
            Ob1 ob1 = new Ob1();
            ob1.setAcctId(k + "");
            ob1.setBatchIdentity(10000000L + k);
            ob1s.add(ob1);
        }
        testClass.setOb1s(ob1s);

        String jsonText = com.alibaba.fastjson.JSON.toJSONString(testClass);
        System.out.println(jsonText);

        TestClass testClass1 = JSON.parseObject(jsonText, TestClass.class);
        System.out.println(testClass1.getCode());

    }
}
