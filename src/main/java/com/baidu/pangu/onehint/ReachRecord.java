package com.baidu.pangu.onehint;

import java.io.Serializable;

/**
 * Created by yangchuanlian on 2016/7/28.
 */
public class ReachRecord implements Serializable {

    /**
     * 触达id,必填
     */
    private Long reachId;

    /**
     * 触达产品线,必填：0 EDM触达
     */
    private Integer reachProductLine;

    /**
     * 实际触达联系数据：电话或者邮箱
     */
    private String contactDetail;

    /**
     * 最后一次触达时间
     */
    private String lastReachTime;

    /**
     * 触达总次数
     */
    private Integer reachTimes;

    /**
     * 触达状态：0 未知、 1 发送成功、 2 到达落地页、3 达到注册页、4 获取验证码、
     * 5 糯米账号注册成功、6 糯米团单审核通过，7 直通车推广审核通过
     */
    private Integer reachStatus;


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

    public String getContactDetail() {
        return contactDetail;
    }

    public void setContactDetail(String contactDetail) {
        this.contactDetail = contactDetail;
    }

    public String getLastReachTime() {
        return lastReachTime;
    }

    public void setLastReachTime(String lastReachTime) {
        this.lastReachTime = lastReachTime;
    }

    public Integer getReachTimes() {
        return reachTimes;
    }

    public void setReachTimes(Integer reachTimes) {
        this.reachTimes = reachTimes;
    }

    public Integer getReachStatus() {
        return reachStatus;
    }

    public void setReachStatus(Integer reachStatus) {
        this.reachStatus = reachStatus;
    }

}
