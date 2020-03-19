package com.nya.manage.mapper;

import com.nya.manage.entity.SelfGoal;

public interface SelfGoalMapper {
    int deleteByPrimaryKey(Integer goalId);

    int insert(SelfGoal record);

    int insertSelective(SelfGoal record);

    SelfGoal selectByPrimaryKey(Integer goalId);

    int updateByPrimaryKeySelective(SelfGoal record);

    int updateByPrimaryKey(SelfGoal record);
}