package com.qf.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory =null;
    static {
        try {
            InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static SqlSession getSqlSession(){

        return sqlSessionFactory.openSession();
    }

}
