package com.qxc.services;

import com.qxc.dao.CodeArticleMapper;
import com.qxc.pojo.CodeArticle;
import com.qxc.utils.APIRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CodeAriticleServices {

    @Resource
    CodeArticleMapper mapper;

    public APIRequest add(CodeArticle codeArticle){
        if(codeArticle == null){
            return new APIRequest(false,"请输入正确的参数！");
        }
        mapper.insertSelective(codeArticle);
        return new APIRequest(true,"添加成功");
    }


    public APIRequest eidt(CodeArticle codeArticle){
        if(codeArticle == null){
            return new APIRequest(false,"请输入正确的参数！");
        }
        mapper.updateByPrimaryKeySelective(codeArticle);
        return new APIRequest(true,"修改成功");
    }

    public APIRequest delete(Integer id){
        if(id == null){
            return new APIRequest(false,"请输入正确的参数！");
        }
        mapper.deleteByPrimaryKey(id);
        return new APIRequest(true,"删除成功");
    }




}
