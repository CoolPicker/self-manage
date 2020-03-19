package com.nya.manage.mapper;

import com.nya.manage.entity.SelfUser;

public interface SelfUserMapper {
    int deleteByPrimaryKey(Integer selfId);

    int insert(SelfUser record);

    int insertSelective(SelfUser record);

    SelfUser selectByPrimaryKey(Integer selfId);

    int updateByPrimaryKeySelective(SelfUser record);

    int updateByPrimaryKey(SelfUser record);
}