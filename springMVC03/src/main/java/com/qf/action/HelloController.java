package com.qf.action;

import com.qf.dto.FriendDTO;
import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("/add.do")
    public ModelAndView addFriend(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("addOne", "添加个屁。。。。。");
        mv.setViewName("/index.jsp");
        return mv;
    }

    @RequestMapping("/list.do")
    public ModelAndView listFriend(HttpServletRequest request,HttpServletResponse response){
        ModelAndView mv=new ModelAndView();
        List<FriendDTO> list=new ArrayList<>();
        list.add(new FriendDTO("张三", "qwertyuiop"));
        list.add(new FriendDTO("李四", "asdfghjkl"));
        list.add(new FriendDTO("王五", "zxcvbnm"));
        list.add(new FriendDTO("赵六", "1234567890"));

        mv.addObject("friendList",list);

        mv.setViewName("/list.jsp");

        return mv;
    }

}
