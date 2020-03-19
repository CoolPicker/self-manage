package com.nya.manage.mapper;

import com.nya.manage.entity.SelfFlag;

public interface SelfFlagMapper {
    int deleteByPrimaryKey(Integer flagId);

    int insert(SelfFlag record);

    int insertSelective(SelfFlag record);

    SelfFlag selectByPrimaryKey(Integer flagId);

    int updateByPrimaryKeySelective(SelfFlag record);

    int updateByPrimaryKey(SelfFlag record);
}