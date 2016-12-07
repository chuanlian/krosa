package com.baidu.pangu;

import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by yangchuanlian on 2016/7/26.
 */
public class tools {

    public static String md5(String src) {

        MessageDigest md = null;

        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            // will never happen
        }

        try {
            byte[] digest = md.digest(src.getBytes("UTF-8"));
            return new String(Base64.encodeBase64(digest));
        } catch (UnsupportedEncodingException e) {
            // never happen
        }
        return null;
    }
}
