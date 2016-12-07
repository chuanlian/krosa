package com.baidu.pangu;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by yangchuanlian on 2016/7/26.
 */
public class md5Test {

    @Test
    public void md5() {

        String suffix = "2002792489";
        String key = "cust_info_cache_" + suffix;

        System.out.println(tools.md5(key));

        System.out.println(makeMD5("北京竞酷体育管理有限公司"));
        System.out.println(makeMD5("北京竞酷体育管理有限公司"));
        System.out.println(new Date());

    }


    /**
     * MD5加密
     */
    private String makeMD5(String key) {
        if (key == null || key.length() == 0) return "";

        String ret = key;
        try {
            ret = DigestUtils.md5Hex(key.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            return null;
        }
        return ret;
    }

    /**
     * 将指定日期的时间改为00:00:00
     *
     * @return
     */
    private Date getDateForZeroHour(Date dt) {
        if (dt == null) {
            dt = new Date();
        }
        Calendar cal = new GregorianCalendar();
        cal.setTime(dt);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        return cal.getTime();
    }
}
