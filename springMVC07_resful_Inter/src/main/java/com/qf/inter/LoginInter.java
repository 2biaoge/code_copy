package com.qf.inter;

import com.qf.dto.UserInfo;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //在具体的功能方法前拦截

        //因为配置拦截器设置的拦截所有  所以把请求地址中带有login的放行（如果是登录的URL不需要校验Session。直接执行）
        String requestURI = request.getRequestURI();
        if (requestURI.indexOf("login")>0) {
            return true;//放行登录的请求，直接到action
        }


        //首先识别

        //1.判断是否登录
        HttpSession session = request.getSession();
        Object userinfo = session.getAttribute("userinfo");
        UserInfo dto=null;

        if(StringUtils.isEmpty(userinfo)){
            dto=(UserInfo) userinfo;
            System.out.println(dto.getName());
            //3.如果已经登录正常执行请求

            return true;//放行

        }else { //2.如果没有登录，不让执行请求，返回到登录页面

            request.getRequestDispatcher("mylogin").forward(request,response);

            return false;//不放行
        }


    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
