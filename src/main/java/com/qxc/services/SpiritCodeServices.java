package com.qxc.services;

import com.qxc.dao.SpiritCodeMapper;
import com.qxc.pojo.SpiritCode;
import com.qxc.utils.APIRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SpiritCodeServices {

    @Resource
    SpiritCodeMapper mapper;



    public APIRequest add(SpiritCode[] scs){
        APIRequest request = new APIRequest(false,"参数异常！");
        if(scs != null){
            int sum = 0;
            for (int i = 0; i < scs.length; i++) {
                int result = mapper.insertSelective(scs[i]);
                if(result > 0){
                    sum++;
                }
            }
            if(sum == scs.length){
                request = new APIRequest(true,"成功！");
                System.out.println("success....");
            }
        }
        return request;
    }


    public APIRequest edit(SpiritCode sc){

        APIRequest request = new APIRequest(false,"参数异常！");
        if(sc != null){
            System.out.println(sc.getId()+"-----"+sc.getCode());
            int i = mapper.updateByPrimaryKeySelective(sc);
            if(i > 0){
                request = new APIRequest(true,"成功！");
            }
        }
        return request;
    }

    public APIRequest delete(Integer year){
        APIRequest request = new APIRequest(false,"参数异常！");
        if(year != null){
            int i = mapper.deleteByPrimaryKey(year);
            if(i > 0){
                request = new APIRequest(true,"成功！");
            }
        }
        return request;
    }

    public APIRequest query(Integer year){
        APIRequest request = new APIRequest(false,"请选择年份！");
        if(year != null){
            List<SpiritCode> query = mapper.query(year);
            if(query != null || query.size() > 0){
                request.setResult(true);
                request.setData(query);
                request.setMsg("成功！");
            }else{
                request.setMsg("没有查询到相关数据");
            }
        }

        return  request;
    }

    public APIRequest queryByid(Integer id){
        APIRequest request = new APIRequest(false,"参数异常！");
        if(id != null){
            SpiritCode spiritCode = mapper.selectByPrimaryKey(id);
            if(spiritCode != null ){
                request.setResult(true);
                request.setData(spiritCode);
                request.setMsg("成功！");
            }else{
                request.setMsg("没有查询到相关数据");
            }
        }

        return  request;
    }

    public APIRequest queryMaxYear() {
        Integer integer = mapper.queryMaxYear();
        return new APIRequest(true,"最近一年數據",integer);
    }
}
