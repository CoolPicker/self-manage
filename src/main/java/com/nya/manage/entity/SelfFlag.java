package com.nya.manage.entity;

public class SelfFlag {
    private Integer flagId;

    private String flagName;

    private Integer flagLevel;

    private String flagContent;

    private Integer parentId;

    private String flagChildren;

    private String flagIdAbsolute;

    private String flagNameAbsolute;

    private Integer selfId;

    private Long createTime;

    private Long updateTime;

    public Integer getFlagId() {
        return flagId;
    }

    public void setFlagId(Integer flagId) {
        this.flagId = flagId;
    }

    public String getFlagName() {
        return flagName;
    }

    public void setFlagName(String flagName) {
        this.flagName = flagName == null ? null : flagName.trim();
    }

    public Integer getFlagLevel() {
        return flagLevel;
    }

    public void setFlagLevel(Integer flagLevel) {
        this.flagLevel = flagLevel;
    }

    public String getFlagContent() {
        return flagContent;
    }

    public void setFlagContent(String flagContent) {
        this.flagContent = flagContent == null ? null : flagContent.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getFlagChildren() {
        return flagChildren;
    }

    public void setFlagChildren(String flagChildren) {
        this.flagChildren = flagChildren == null ? null : flagChildren.trim();
    }

    public String getFlagIdAbsolute() {
        return flagIdAbsolute;
    }

    public void setFlagIdAbsolute(String flagIdAbsolute) {
        this.flagIdAbsolute = flagIdAbsolute == null ? null : flagIdAbsolute.trim();
    }

    public String getFlagNameAbsolute() {
        return flagNameAbsolute;
    }

    public void setFlagNameAbsolute(String flagNameAbsolute) {
        this.flagNameAbsolute = flagNameAbsolute == null ? null : flagNameAbsolute.trim();
    }

    public Integer getSelfId() {
        return selfId;
    }

    public void setSelfId(Integer selfId) {
        this.selfId = selfId;
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
}