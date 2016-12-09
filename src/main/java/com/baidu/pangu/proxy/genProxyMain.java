package com.baidu.pangu.proxy;

import sun.misc.ProxyGenerator;

import javax.security.auth.Subject;
import java.io.FileOutputStream;

/**
 * Created by yangchuanlian on 2016/7/22.
 */
public class GenProxyMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        createProxyClassFile();
    }

    public static void createProxyClassFile() {
        String name = "ProxyUserService";
        byte[] data = ProxyGenerator.generateProxyClass(name, new Class[]{UserService.class});
        try {
            FileOutputStream out = new FileOutputStream(name + ".class");
            out.write(data);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
