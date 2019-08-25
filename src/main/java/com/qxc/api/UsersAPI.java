package com.qxc.api;

import com.qxc.dao.UsersMapper;
import com.qxc.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UsersAPI {

    @Resource
    UsersMapper mapper;

    @Transactional
    @RequestMapping("register.do")
    public Object register(Users users){
        System.out.println("------------------");
        int insert = mapper.insert(users);
//        int i = mapper.deleteByPrimaryKey(1);
//        System.out.println(i);
        Users users1 = mapper.selectByPrimaryKey(1);
        System.out.println(users1);
        return mapper.selectByPrimaryKey(1);
    }

}
