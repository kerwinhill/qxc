package com.qxc.api;


import com.qxc.pojo.Users;
import com.qxc.services.UsersServices;
import com.qxc.utils.APIRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class UsersAPI {

    @Resource
    UsersServices services;

    @RequestMapping("login.do")
    public APIRequest login(Users users){
        return services.login(users);
    }



}
