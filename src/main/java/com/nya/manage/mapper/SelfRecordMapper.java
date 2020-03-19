package com.nya.manage.mapper;

import com.nya.manage.entity.SelfRecord;

public interface SelfRecordMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(SelfRecord record);

    int insertSelective(SelfRecord record);

    SelfRecord selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(SelfRecord record);

    int updateByPrimaryKey(SelfRecord record);
}