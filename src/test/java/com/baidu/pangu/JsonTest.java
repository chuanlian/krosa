package com.baidu.pangu;

import com.alibaba.fastjson.JSON;
import com.baidu.pangu.vo.TestObject;
import org.junit.Test;

/**
 * Created by yangchuanlian on 2016/8/5.
 */
public class JsonTest {

    @Test
    public void toJson() {
        TestObject testObject = new TestObject();
        testObject.setId(100L);
        testObject.setName("yangchuanlian");
        System.out.println(JSON.toJSONString(testObject));
    }
}
