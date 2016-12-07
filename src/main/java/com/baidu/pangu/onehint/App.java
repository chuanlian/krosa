package com.baidu.pangu.onehint;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by yangchuanlian on 2016/7/28.
 */
public class App {


    public static void main(String[] args) {
        ApiReqModel apiReqModel = new ApiReqModel();
        apiReqModel.setApiAppid(1);
        apiReqModel.setApiTime(System.currentTimeMillis());
        apiReqModel.setApiKey(UUID.randomUUID().toString());
        List<ReachRecordVo> reachRecords = new ArrayList<ReachRecordVo>();
        for (int k = 0; k < 2; k++) {
            ReachRecordVo reachRecord = new ReachRecordVo();
            reachRecord.setReachId(100000L + k);
            reachRecord.setContactDetail("13810192333");
            reachRecord.setReachProductLine(0);
            reachRecord.setReachStatus(0);
            reachRecord.setLastReachTime("2016-07-10 10:23:12");
            reachRecord.setReachAddTime("2016-07-10 10:23:12");
            reachRecords.add(reachRecord);
        }
        apiReqModel.setReachRecords(reachRecords);
        System.out.println(JSON.toJSONString(apiReqModel));
    }
}
