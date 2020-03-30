package com.nya.manage.mapper;

import com.nya.manage.entity.Clothes;

import java.util.List;

public interface ClothesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Clothes record);

    int insertSelective(Clothes record);

    Clothes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Clothes record);

    int updateByPrimaryKey(Clothes record);

    Integer selectMaxId();

    List<Clothes> selectByStorageId(Integer storageId);
}