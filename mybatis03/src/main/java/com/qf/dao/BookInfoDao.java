package com.qf.dao;

import com.qf.dto.BookAllDto;
import com.qf.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class BookInfoDao {
    public void findBookId(){
        SqlSession sqlSesssion = MybatisUtil.getSqlSesssion();
        BookAllDto dto = sqlSesssion.selectOne("com.qf.dao.BookInfoMapper.selectBookAndTypeById",2L);

        sqlSesssion.close();

    }

    public static void main(String[] args) {
        BookInfoDao bookInfoDao=new BookInfoDao();
        bookInfoDao.findBookId();
    }
}
