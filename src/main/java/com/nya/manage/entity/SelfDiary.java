package com.nya.manage.entity;

public class SelfDiary {
    private Integer diaryId;

    private Integer selfId;

    private String diaryDate;

    private String diaryWeather;

    private String diaryLocation;

    private String diaryMood;

    private Long createTime;

    private Long updateTime;

    private String diaryContent;

    public Integer getDiaryId() {
        return diaryId;
    }

    public void setDiaryId(Integer diaryId) {
        this.diaryId = diaryId;
    }

    public Integer getSelfId() {
        return selfId;
    }

    public void setSelfId(Integer selfId) {
        this.selfId = selfId;
    }

    public String getDiaryDate() {
        return diaryDate;
    }

    public void setDiaryDate(String diaryDate) {
        this.diaryDate = diaryDate == null ? null : diaryDate.trim();
    }

    public String getDiaryWeather() {
        return diaryWeather;
    }

    public void setDiaryWeather(String diaryWeather) {
        this.diaryWeather = diaryWeather == null ? null : diaryWeather.trim();
    }

    public String getDiaryLocation() {
        return diaryLocation;
    }

    public void setDiaryLocation(String diaryLocation) {
        this.diaryLocation = diaryLocation == null ? null : diaryLocation.trim();
    }

    public String getDiaryMood() {
        return diaryMood;
    }

    public void setDiaryMood(String diaryMood) {
        this.diaryMood = diaryMood == null ? null : diaryMood.trim();
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

    public String getDiaryContent() {
        return diaryContent;
    }

    public void setDiaryContent(String diaryContent) {
        this.diaryContent = diaryContent == null ? null : diaryContent.trim();
    }
}