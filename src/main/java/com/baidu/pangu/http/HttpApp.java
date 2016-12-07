package com.baidu.pangu.http;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by yangchuanlian on 2016/8/2.
 */
public class HttpApp {

    public static void main(String[] args) {
        System.out.println(HttpRequestUtils.doGet());
        System.out.println(HttpRequestUtils.doPost());
        System.out.println(HttpRequestUtils.doPost(getJsonText()));
    }


    private static String getJsonText() {
        ApiReqModel apiReqModel = new ApiReqModel();
        apiReqModel.setApiAppid(1);
        apiReqModel.setApiKey(UUID.randomUUID().toString());
        apiReqModel.setApiTime(System.currentTimeMillis());
        apiReqModel.setReachRecords(getReachRecords());
        return JSON.toJSONString(apiReqModel);
    }

    private static List<ReachRecordVo> getReachRecords() {
        List<ReachRecordVo> reachRecords = new ArrayList<ReachRecordVo>();
        for (int i = 0; i < 5; i++) {
            ReachRecordVo reachRecordVo = new ReachRecordVo();
            reachRecordVo.setReachId(1000000L + i);
            reachRecordVo.setReachProductLine(0);
            reachRecordVo.setReachStatus(0);
            reachRecordVo.setContactDetail("1312008199" + i);
            reachRecordVo.setLastReachTime("2016-08-02");
            reachRecords.add(reachRecordVo);
        }
        return reachRecords;
    }
}
