package com.qxc.dao;

import com.qxc.pojo.Users;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

public interface UsersMapper {
    @Transactional
    int deleteByPrimaryKey(Integer userid);

    int insert(Users record);

    int insertSelective(Users record);

    @Select("select * from tb_users where username = #{username} and pwd = #{pwd}")
    Users login(Users user);

    Users selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}