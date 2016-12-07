package com.baidu.pangu;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangchuanlian on 2016/7/26.
 */
public class ListTest {

    @Test
    public void remove() {
        List<Integer> ids = new ArrayList<Integer>();
        for (int k = 0; k < 10; k++) {
            ids.add(k);
        }
        System.out.println(JSON.toJSONString(ids));

    }
}
