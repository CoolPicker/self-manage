package com.nya.manage.entity;

public class SelfRecord {
    private Integer recordId;

    private Integer selfId;

    private Integer flagId;

    private Integer completeScale;

    private String dateStr;

    private String timeStr;

    private Long flagTime;

    private String recordNote;

    private Long createTime;

    private Long updateTime;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getSelfId() {
        return selfId;
    }

    public void setSelfId(Integer selfId) {
        this.selfId = selfId;
    }

    public Integer getFlagId() {
        return flagId;
    }

    public void setFlagId(Integer flagId) {
        this.flagId = flagId;
    }

    public Integer getCompleteScale() {
        return completeScale;
    }

    public void setCompleteScale(Integer completeScale) {
        this.completeScale = completeScale;
    }

    public String getDateStr() {
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr == null ? null : dateStr.trim();
    }

    public String getTimeStr() {
        return timeStr;
    }

    public void setTimeStr(String timeStr) {
        this.timeStr = timeStr == null ? null : timeStr.trim();
    }

    public Long getFlagTime() {
        return flagTime;
    }

    public void setFlagTime(Long flagTime) {
        this.flagTime = flagTime;
    }

    public String getRecordNote() {
        return recordNote;
    }

    public void setRecordNote(String recordNote) {
        this.recordNote = recordNote == null ? null : recordNote.trim();
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