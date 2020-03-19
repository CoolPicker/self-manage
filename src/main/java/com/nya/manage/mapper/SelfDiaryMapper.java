package com.nya.manage.mapper;

import com.nya.manage.entity.SelfDiary;

public interface SelfDiaryMapper {
    int deleteByPrimaryKey(Integer diaryId);

    int insert(SelfDiary record);

    int insertSelective(SelfDiary record);

    SelfDiary selectByPrimaryKey(Integer diaryId);

    int updateByPrimaryKeySelective(SelfDiary record);

    int updateByPrimaryKeyWithBLOBs(SelfDiary record);

    int updateByPrimaryKey(SelfDiary record);
}