package com.baidu.pangu.http;

import java.io.Serializable;

/**
 * Created by yangchuanlian on 2016/8/2.
 */
public class ReachRecordVo implements Serializable {
    private String contactDetail;

    private Long reachId;

    private Integer reachProductLine;

    private Integer reachStatus;

    private String lastReachTime;

    public String getContactDetail() {
        return contactDetail;
    }

    public void setContactDetail(String contactDetail) {
        this.contactDetail = contactDetail;
    }

    public Long getReachId() {
        return reachId;
    }

    public void setReachId(Long reachId) {
        this.reachId = reachId;
    }

    public Integer getReachProductLine() {
        return reachProductLine;
    }

    public void setReachProductLine(Integer reachProductLine) {
        this.reachProductLine = reachProductLine;
    }

    public Integer getReachStatus() {
        return reachStatus;
    }

    public void setReachStatus(Integer reachStatus) {
        this.reachStatus = reachStatus;
    }

    public String getLastReachTime() {
        return lastReachTime;
    }

    public void setLastReachTime(String lastReachTime) {
        this.lastReachTime = lastReachTime;
    }
}
