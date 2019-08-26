package com.qxc.dao;

import com.qxc.pojo.LotteryResult;
import com.qxc.pojo.LotteryResultDetails;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LotteryResultMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LotteryResult record);

    int insertSelective(LotteryResult record);

    LotteryResult selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LotteryResult record);

    int updateByPrimaryKey(LotteryResult record);

    @Select("select * from LotteryResult where year = #{year}")
    List<LotteryResult> query(Integer year);

    @Select("select \n" +
            "\tresult.id,result.codeid,result.year,result.timer,\n" +
            "\tresult.b1,sc1.code b1code,sc1.color b1color,sc1.shengxiao b1shengxiao,sc1.jmsht b1jmsht,\n" +
            "\tresult.b2,sc2.code b2code,sc2.color b2color,sc2.shengxiao b2shengxiao,sc2.jmsht b2jmsht,\n" +
            "\tresult.b3,sc3.code b3code,sc3.color b3color,sc3.shengxiao b3shengxiao,sc3.jmsht b3jmsht,\n" +
            "\tresult.b4,sc4.code b4code,sc4.color b4color,sc4.shengxiao b4shengxiao,sc4.jmsht b4jmsht,\n" +
            "\tresult.b5,sc5.code b5code,sc5.color b5color,sc5.shengxiao b5shengxiao,sc5.jmsht b5jmsht,\n" +
            "\tresult.b6,sc6.code b6code,sc6.color b6color,sc6.shengxiao b6shengxiao,sc6.jmsht b6jmsht,\n" +
            "\tresult.b7,sc7.code b7code,sc7.color b7color,sc7.shengxiao b7shengxiao,sc7.jmsht b7jmsht\n" +
            "from LotteryResult result\n" +
            "left join SpiritCode sc1\n" +
            "on result.b1 = sc1.id\n" +
            "left join SpiritCode sc2\n" +
            "on result.b2 = sc2.id\n" +
            "left join SpiritCode sc3\n" +
            "on result.b3 = sc3.id\n" +
            "left join SpiritCode sc4\n" +
            "on result.b4 = sc4.id\n" +
            "left join SpiritCode sc5\n" +
            "on result.b5 = sc5.id\n" +
            "left join SpiritCode sc6\n" +
            "on result.b6 = sc6.id\n" +
            "left join SpiritCode sc7\n" +
            "on result.b7 = sc7.id\n" +
            "where result.year = #{year}")
    List<LotteryResultDetails> queryDetails(Integer year);

    @Select("select year from LotteryResult group by year")
    List<Integer> queryYear();
}