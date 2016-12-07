package com.baidu.pangu;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private static final int _1MB = 1024 * 1024;

    //@Test
    public void test() {
        byte[] space1 = new byte[2 * _1MB];
        byte[] space2 = new byte[2 * _1MB];
        byte[] space3 = new byte[2 * _1MB];
        byte[] space4 = new byte[4 * _1MB];
    }

    @Test
    public void Inter() {
        Integer n = 10;
        System.out.println(n);
        System.out.println(-n);
        Date date = org.apache.commons.lang.time.DateUtils.addDays(new Date(), -n.intValue());
        date = org.apache.commons.lang.time.DateUtils.truncate(date, 5);
        System.out.println(date);
    }

    @Test
    public void url() {
        String companyUrl = "https://";
        if (StringUtils.isNotBlank(companyUrl)) {
            if (StringUtils.equals(companyUrl, "http://") || StringUtils.equals(companyUrl, "https://")) {
                companyUrl = null;
            } else if (!companyUrl.startsWith("http://") && !companyUrl.startsWith("https://")) {
                companyUrl = "http://" + companyUrl;
            }
        } else {
            companyUrl = null;
        }
        System.out.println("companyUrl:" + companyUrl);

        String name = "�布依不舍～货源总代�";
        System.out.println(name.length());
    }

    @Test
    public void write() {
        String companyName = "asdfads";
        String contactCell = "13810426019";
        String submitInfo = String.format("companyName:%s,phone:%s", companyName, contactCell);
        System.out.println(submitInfo);
    }

    @Test
    public void toJson() {
        Map<String, Object> regMap = new HashMap<String, Object>();
        regMap.put("mobile", "13810109090");
        regMap.put("companyName", "dasf13412");
        regMap.put("currCityId", 38);
        regMap.put("currProvId", 1);
        System.out.println(JSON.toJSONString(regMap));


        String mm = "160621182307BQZT@ebaidu.com";
        System.out.println(mm.length());
    }
}
