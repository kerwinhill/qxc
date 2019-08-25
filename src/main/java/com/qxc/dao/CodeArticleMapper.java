package com.qxc.dao;

import com.qxc.pojo.CodeArticle;

public interface CodeArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CodeArticle record);

    int insertSelective(CodeArticle record);

    CodeArticle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CodeArticle record);

    int updateByPrimaryKey(CodeArticle record);


}