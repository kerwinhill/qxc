package com.qxc.dao;

import com.qxc.pojo.SpiritCode;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SpiritCodeMapper {
    int deleteByPrimaryKey(Integer id);

    @Transactional
    int insert(SpiritCode record);

    @Transactional
    int insertSelective(SpiritCode record);

    SpiritCode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpiritCode record);

    int updateByPrimaryKey(SpiritCode record);

    @Select("select * from SpiritCode where year = #{year} ")
    List<SpiritCode> query(Integer year);

    @Select("select max(year) from SpiritCode ")
    Integer queryMaxYear();
}