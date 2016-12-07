package com.baidu.pangu.bdrp;

import com.alibaba.fastjson.JSON;
import com.baidu.driver4j.bdrp.client.BdrpClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BdrpClient bdrpClient = (BdrpClient) applicationContext.getBean("advancedbnsBdrpClientFactory");

        test2(bdrpClient);
        // test1(bdrpClient);
    }

    private static void test2(BdrpClient bdrpClient) {
        String key1 = "yangchuanlian";
        bdrpClient.set(key1, "baidu sme team");
        bdrpClient.expire(key1, 30);


        String key2 = "xuwenzong";
        bdrpClient.set(key2.getBytes(), "ali ued".getBytes());
        bdrpClient.expire(key2.getBytes(), 30);

        String key3 = "yangkaixin";
        bdrpClient.set(key3.getBytes(), "Tsing hua".getBytes());
        bdrpClient.expire(key3, 30);


        System.out.println(JSON.toJSONString(bdrpClient.get("yangchuanlian")));
    }

    private static void test1(BdrpClient bdrpClient) {
        System.out.println("advancedbnsBdrpClientFactory set get String");
        bdrpClient.expire("TEST_KEY1", 15);
        bdrpClient.set("TEST_KEY1", "yangchuanlian");
        System.out.println(JSON.toJSONString(bdrpClient.get("TEST_KEY1")));

        System.out.println("advancedbnsBdrpClientFactory set get object");
        String key1 = "person:101";
        String key2 = "person:102";
        Person person1 = new Person(100, "yangkaixin");
        bdrpClient.set("person:101".getBytes(), SerializeUtil.serialize(person1));

        Person person2 = new Person(102, "yangxinyue");
        bdrpClient.set("person:102".getBytes(), SerializeUtil.serialize(person2));


        byte[] person11 = bdrpClient.get(key1.getBytes());
        Person person111 = (Person) SerializeUtil.unserialize(person11);
        System.out.println(JSON.toJSONString(person111));

        byte[] person22 = bdrpClient.get(key2.getBytes());
        Person person222 = (Person) SerializeUtil.unserialize(person22);
        System.out.println(JSON.toJSONString(person222));


        System.out.println("advancedbnsBdrpClientFactory set get list");
        String key3 = "list1";
        Set<Long> longs = new HashSet<Long>();
        for (int i = 0; i < 100; i++) {
            longs.add(Long.parseLong(i + ""));
        }
        bdrpClient.set(key3.getBytes(), SerializeUtil.serialize(longs));

        byte[] list1 = bdrpClient.get(key3.getBytes());
        Set<Long> longs1 = (Set<Long>) SerializeUtil.unserialize(list1);

        System.out.println(JSON.toJSONString(longs1));


        System.out.println("finished");
        System.out.println();
    }
}
