package com.nya.manage.entity;

public class SelfGoal {
    private Integer goalId;

    private Integer selfId;

    private String goalContent;

    private Integer goalLevel;

    private Integer goalTimes;

    private Integer isNew;

    private Integer goalYear;

    private Integer goalMonth;

    private Integer goalDay;

    private Long createTime;

    private Long updateTime;

    public Integer getGoalId() {
        return goalId;
    }

    public void setGoalId(Integer goalId) {
        this.goalId = goalId;
    }

    public Integer getSelfId() {
        return selfId;
    }

    public void setSelfId(Integer selfId) {
        this.selfId = selfId;
    }

    public String getGoalContent() {
        return goalContent;
    }

    public void setGoalContent(String goalContent) {
        this.goalContent = goalContent == null ? null : goalContent.trim();
    }

    public Integer getGoalLevel() {
        return goalLevel;
    }

    public void setGoalLevel(Integer goalLevel) {
        this.goalLevel = goalLevel;
    }

    public Integer getGoalTimes() {
        return goalTimes;
    }

    public void setGoalTimes(Integer goalTimes) {
        this.goalTimes = goalTimes;
    }

    public Integer getIsNew() {
        return isNew;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public Integer getGoalYear() {
        return goalYear;
    }

    public void setGoalYear(Integer goalYear) {
        this.goalYear = goalYear;
    }

    public Integer getGoalMonth() {
        return goalMonth;
    }

    public void setGoalMonth(Integer goalMonth) {
        this.goalMonth = goalMonth;
    }

    public Integer getGoalDay() {
        return goalDay;
    }

    public void setGoalDay(Integer goalDay) {
        this.goalDay = goalDay;
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