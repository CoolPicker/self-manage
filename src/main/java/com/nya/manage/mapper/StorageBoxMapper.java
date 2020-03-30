package com.nya.manage.mapper;

import com.nya.manage.entity.StorageBox;

import java.util.List;

public interface StorageBoxMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StorageBox record);

    int insertSelective(StorageBox record);

    StorageBox selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StorageBox record);

    int updateByPrimaryKey(StorageBox record);

    Integer selectMaxId();

    List<StorageBox> selectStorageBoxes();
}