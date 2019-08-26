package com.qxc.api;

import com.qxc.pojo.SpiritCode;
import com.qxc.services.SpiritCodeServices;
import com.qxc.utils.APIRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SpiritCodeAPI {


    @Resource
    SpiritCodeServices services;

    @RequestMapping("/addSpiritcode.do")
    public APIRequest add(Integer year,Integer[] code ,String[] color,String[] jmsht,String[] shengxiao){

        if(code == null || code.length < 49){
            return new APIRequest(false,"参数错误！");
        }

        SpiritCode[] scs = new SpiritCode[49];


        for (int i = 0; i < scs.length; i++) {
            scs[i] = new SpiritCode(code[i],color[i],shengxiao[i],jmsht[i],year);
        }
        APIRequest add = services.add(scs);
        return add;
    }


    @RequestMapping("/editSpiritCode.do")
    public APIRequest edit(SpiritCode sc){
        return services.edit(sc);
    }

    @RequestMapping("/deleteSpiritCode.do")
    public APIRequest delete(Integer year){
        return services.delete(year);
    }

    @RequestMapping("/loadSpiritCode.do")
    public APIRequest query(Integer year){
        return services.query(year);
    }

    @RequestMapping("/loadmaxyear.do")
    public APIRequest queryMaxYear(Integer year){
        return services.queryMaxYear();
    }


    public APIRequest queryByid(Integer id){
        return services.queryByid(id);
    }

}
