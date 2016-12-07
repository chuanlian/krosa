package com.baidu.pangu.bdrp;

/**
 * Created by yangchuanlian on 2016/6/28.
 */
public class App2 {

    public static void main(String[] args) throws InterruptedException {
        Integer i = 0;
        while (true) {
            System.out.println("test success!" + i.toString());
            Thread.sleep(1000);
            i++;
        }
    }
}
