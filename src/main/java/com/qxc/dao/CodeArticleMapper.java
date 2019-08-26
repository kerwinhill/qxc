package com.qxc.dao;

import com.qxc.pojo.CodeArticle;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CodeArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CodeArticle record);

    int insertSelective(CodeArticle record);

    CodeArticle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CodeArticle record);

    int updateByPrimaryKey(CodeArticle record);


    @Select("select * from CodeArticle order by articletime desc")
    List<CodeArticle> loadCodeAriticle();


}