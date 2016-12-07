package com.baidu.pangu.http;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yangchuanlian on 2016/8/2.
 */
public class ApiReqModel implements Serializable {

    private String apiKey;

    private Integer apiAppid;

    private Long apiTime;

    private List<ReachRecordVo> reachRecords;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public Integer getApiAppid() {
        return apiAppid;
    }

    public void setApiAppid(Integer apiAppid) {
        this.apiAppid = apiAppid;
    }

    public Long getApiTime() {
        return apiTime;
    }

    public void setApiTime(Long apiTime) {
        this.apiTime = apiTime;
    }

    public List<ReachRecordVo> getReachRecords() {
        return reachRecords;
    }

    public void setReachRecords(List<ReachRecordVo> reachRecords) {
        this.reachRecords = reachRecords;
    }

}
