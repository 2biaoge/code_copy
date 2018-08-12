package com.qf.servlet;

import com.qf.dao.UserDao;
import com.qf.pojo.UserInfo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext2.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        java.util.List<UserInfo> all = userDao.findAll();
        for (UserInfo userInfo : all) {
            System.out.println(userInfo.getId()+userInfo.getUserPass()+userInfo.getUserName());

        }
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
