package com.baidu.pangu.onehint;

/**
 * Created by yangchuanlian on 2016/8/5.
 */
public class ReachRecordVo {

    /**
     * 触达id，必填
     */
    private Long reachId;

    /**
     * 电话
     */
    private String contactDetail;

    /**
     * 触达产品线
     */
    private Integer reachProductLine;

    /**
     * 触达状态
     */
    private Integer reachStatus;

    /**
     * 最近触达时间,格式："2016-08-05 11:07:30"
     */
    private String lastReachTime;

    /**
     * 第一次触达时间,格式："2016-08-05 11:07:30"
     */
    private String reachAddTime;


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

    public String getReachAddTime() {
        return reachAddTime;
    }

    public void setReachAddTime(String reachAddTime) {
        this.reachAddTime = reachAddTime;
    }
}
