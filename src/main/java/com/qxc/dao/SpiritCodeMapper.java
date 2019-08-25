package com.qxc.dao;

import com.qxc.pojo.SpiritCode;

public interface SpiritCodeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SpiritCode record);

    int insertSelective(SpiritCode record);

    SpiritCode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpiritCode record);

    int updateByPrimaryKey(SpiritCode record);
}