package com.qf.action;

import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyAction implements HttpRequestHandler {//这种方法类似于之前的servlet

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("hello","SpringMVC。。。。。。。。");
        request.getRequestDispatcher("/index.jsp").forward(request,response);

    }
}
