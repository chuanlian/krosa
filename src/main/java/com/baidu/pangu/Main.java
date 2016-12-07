package com.baidu.pangu;

import java.io.IOException;

/**
 * Created by yangchuanlian on 2016/11/21.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        if (args == null || args.length <= 0) {
            System.out.println("参数不能为空");
        }
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
