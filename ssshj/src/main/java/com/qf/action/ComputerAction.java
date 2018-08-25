package com.qf.action;

import com.qf.dto.ComDTO;
import com.qf.dto.PageDTO;
import com.qf.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Auther: Administrator
 * Thanks for Everything
 */
@Controller
public class ComputerAction {

    @Autowired
    private ComputerService computerService;

    @RequestMapping("/addCom.do")
    public ModelAndView addCom(ComDTO dto){
        ModelAndView modelAndView = new ModelAndView();
        computerService.addCom(dto);
        modelAndView.setViewName("/listCom.do");
        return modelAndView;
    }

    @RequestMapping("/delCom.do")
    public ModelAndView delCom(Long[] ids){
        ModelAndView modelAndView = new ModelAndView();
        for (Long id : ids) {
            computerService.delCom(id);
        }
        modelAndView.setViewName("/listCom.do");
        return modelAndView;
    }

    @RequestMapping("/detailCom.do")
    public ModelAndView detailCom(Long id){
        ModelAndView modelAndView = new ModelAndView();
        ComDTO byId = computerService.findById(id);
        modelAndView.addObject("computerDTO",byId);
        modelAndView.setViewName("/comdetail.jsp");
        return modelAndView;
    }

    @RequestMapping("/editCom.do")
    public ModelAndView editCom(ComDTO dto){
        ModelAndView modelAndView = new ModelAndView();
        computerService.update(dto);
        modelAndView.setViewName("/listCom.do");
        return modelAndView;
    }

    @RequestMapping("/listCom.do")
    public ModelAndView listCom(HttpServletRequest request){
        String page = request.getParameter("page");
        ModelAndView modelAndView = new ModelAndView();
        PageDTO pageDTO = new PageDTO();//初始值，第一页0,分页大小5
        if(!StringUtils.isEmpty(page)) {
            int i = Integer.parseInt(page);
            if(i<0){
                i=0;
            }
            pageDTO.setPage(i);
        }
//        List<ComDTO> byPage = computerService.findByPage(pageDTO);
        //手动更新
        computerService.zhuanZhan("爱睡懒觉",21L);
        //模糊查询
        List<ComDTO> byPage = computerService.findByMode("IBM");
        //获取当前的page
        int currentPage = pageDTO.getPage();
        modelAndView.addObject("currentPage",currentPage);
        modelAndView.addObject("maxPage",pageDTO.getMaxPage());
        modelAndView.addObject("comList",byPage);
        modelAndView.setViewName("/comlist.jsp");
        return modelAndView;
    }

}



