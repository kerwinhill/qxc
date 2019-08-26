package com.qxc.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qxc.pojo.Users;
import com.qxc.utils.APIRequest;
import com.qxc.utils.Connect;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
@RequestMapping("/admin")
public class LoginController {



    @RequestMapping("/login.do")
    public APIRequest login(Users users, HttpSession session){
        String str = "username=" + users.getUsername() + "&pwd=" + users.getPwd();
        System.out.println(str);
        String s = Connect.interfaceUtil("http://localhost:9999/qxc/api/login.do", str);
        System.out.println("****:"+s);
        ObjectMapper mapper = new ObjectMapper();
        try {
            APIRequest api = mapper.readValue(s,APIRequest.class);
            if(api.isResult()){
                session.setAttribute("users",api.getData());
                return new APIRequest(true,"登陆成功",null);
            }
            System.out.println(api.getData());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return new APIRequest(false,"用户名或者密码错误！",null);
    }
}
