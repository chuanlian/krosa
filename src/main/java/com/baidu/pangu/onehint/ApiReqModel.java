package com.baidu.pangu.onehint;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yangchuanlian on 2016/8/5.
 */
public class ApiReqModel implements Serializable {

    /**
     * 安全密钥：由apiAppid+加密盐+apiTime拼接后，MD5（32位小写）加密生成；
     * 线下环境加密盐为1234567890，线上请联系RD获取
     */
    private String apiKey;

    /**
     * 传1 即可
     */
    private Integer apiAppid;

    /**
     * 当前时间戳，5分钟内有效
     */
    private Long apiTime;

    /**
     * 触达详细信息
     */
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
