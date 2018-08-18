package com.qf.controller;

import com.qf.dto.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Action {

    @RequestMapping("/login.do")
    public ModelAndView login(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        //拿到用户名进行校验




        //把用户信息存入Session
        UserInfo userInfo = new UserInfo(name,password);
        HttpSession session = request.getSession();
        session.setAttribute("userinfo",userInfo);


        mv.addObject("name", name);
        mv.addObject("password",password);
        mv.setViewName("index");
        return mv;

    }
}
