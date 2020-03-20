package com.nya.manage.entity;

public class SelfUser {
    private Integer selfId;

    private String selfName;

    // 阻止序列化
    private transient String selfPass;

    private Integer selfStatus;

    private Long createTime;

    private Long updateTime;

    public Integer getSelfId() {
        return selfId;
    }

    public void setSelfId(Integer selfId) {
        this.selfId = selfId;
    }

    public String getSelfName() {
        return selfName;
    }

    public void setSelfName(String selfName) {
        this.selfName = selfName == null ? null : selfName.trim();
    }

    public String getSelfPass() {
        return selfPass;
    }

    public void setSelfPass(String selfPass) {
        this.selfPass = selfPass == null ? null : selfPass.trim();
    }

    public Integer getSelfStatus() {
        return selfStatus;
    }

    public void setSelfStatus(Integer selfStatus) {
        this.selfStatus = selfStatus;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SelfUser{" +
                "selfName='" + selfName + '\'' +
                ", selfPass='" + selfPass + '\'' +
                ", selfStatus=" + selfStatus +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}