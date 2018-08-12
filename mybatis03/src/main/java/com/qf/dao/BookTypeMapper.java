package com.qf.dao;

import com.qf.pojo.BookType;

public interface BookTypeMapper {
    int deleteByPrimaryKey(Long typeId);

    int insert(BookType record);

    int insertSelective(BookType record);

    BookType selectByPrimaryKey(Long typeId);

    int updateByPrimaryKeySelective(BookType record);

    int updateByPrimaryKey(BookType record);
}