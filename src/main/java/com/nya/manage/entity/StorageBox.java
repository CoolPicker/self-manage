package com.nya.manage.entity;

public class StorageBox {
    private Integer id;

    private Integer spaceType;

    private String storageName;

    private Integer isCommonUse;

    private Long createTime;

    private Long updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpaceType() {
        return spaceType;
    }

    public void setSpaceType(Integer spaceType) {
        this.spaceType = spaceType;
    }

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName == null ? null : storageName.trim();
    }

    public Integer getIsCommonUse() {
        return isCommonUse;
    }

    public void setIsCommonUse(Integer isCommonUse) {
        this.isCommonUse = isCommonUse;
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