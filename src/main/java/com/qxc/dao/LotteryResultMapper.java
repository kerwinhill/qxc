package com.qxc.dao;

import com.qxc.pojo.LotteryResult;

public interface LotteryResultMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LotteryResult record);

    int insertSelective(LotteryResult record);

    LotteryResult selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LotteryResult record);

    int updateByPrimaryKey(LotteryResult record);
}