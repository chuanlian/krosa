package com.baidu.pangu.thread;

import com.alibaba.fastjson.JSON;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangchuanlian on 2016/11/23.
 */
public class Main {

    public static void main(String[] args) {
        Map<String, Object> saleSet = new HashMap<String, Object>();
        saleSet.put("remain_apply_times", 10);
        saleSet.put("apply_times_date", new Date());
        System.out.println(JSON.toJSONString(saleSet));
        saleSet.put("remain_apply_times", 123);
        System.out.println(JSON.toJSONString(saleSet));
    }
}
