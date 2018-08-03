package com.qf;

import com.qf.dao.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TsetDao {

    @Test
    public void tsetDaoAdd(){
        //加载spring的核心配置文件applicationcontext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        //获取对象
        UserDao userDao = (UserDao) context.getBean("userDao");
        UserDao userDao2 = (UserDao) context.getBean("userDao");

        //调用方法
        userDao.addUser();
        userDao2.addUser();

        System.out.println(userDao.toString());
        System.out.println(userDao2.toString());

        //关闭容器
        context.close();
    }
}
