package com.qxc.services;

import com.qxc.dao.UsersMapper;
import com.qxc.pojo.Users;
import com.qxc.utils.APIRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UsersServices {

    @Resource
    UsersMapper mapper;

    public APIRequest login(Users users){

        if(users == null){
            return new APIRequest(false,"请输入用户名和密码");
        }
        System.out.println(users.getUsername());
        System.out.println(users.getPwd());
        Users login = mapper.login(users);
        if(login != null){
           return new APIRequest(true,"登录成功！",login);
        }
        return new APIRequest(false,"对不起用户名密码错误！");
    }


}
