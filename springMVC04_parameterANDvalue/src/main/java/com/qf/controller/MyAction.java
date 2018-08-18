package com.qf.controller;

import com.qf.dto.Car;
import com.qf.dto.CarType;
import com.qf.dto.DTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping
public class MyAction {

    @RequestMapping("/add.do")
    public ModelAndView addOne() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", 6578);
        mv.setViewName("/index.jsp");
        return mv;
    }


    @RequestMapping("/ok.do")
    public String ok() {

        return "/ok.jsp";//直接返回地址不能携带数据
    }

    @RequestMapping("/hello.do")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        //      modelAndView.setViewName("ok.do");//-----------http://localhost:8080/frist/ok.do
        // x   modelAndView.setViewName("/ok.do");//------------8080/ok.do
//
        modelAndView.setViewName("/first/ok.do");//-----------http://localhost:8080/frist/ok.do

        return modelAndView;
    }

    @RequestMapping("/addCar.do")
    public String addcar(HttpServletRequest request) {
        System.out.println("添加成功。。。");
        request.setAttribute("car1", "玛莎拉蒂");

        return "/listCar.do";
    }

    @RequestMapping("/listCar.do")
    public ModelAndView listcar(HttpServletRequest request) {
        Object car1 = request.getAttribute("car1");
        ModelAndView mv = new ModelAndView();
        mv.addObject("car1", car1);
        mv.setViewName("/ok.jsp");
        return mv;
    }


    //方法和页面之间的传值 ModelAndView
    @RequestMapping("/listDTO.do")

    //方案一：ModelAndView
    /*setViewName设置跳转地址
      addObject方法传数据*/
    public ModelAndView listdto() {
        ModelAndView mv = new ModelAndView();
        List<DTO> list = new LinkedList<>();
        list.add(new DTO("kkkkk", "lllll"));
        list.add(new DTO("DTO1", "zheshi两个参数的DTO"));
        list.add(new DTO("DTO2", "zffffffffffff"));
        list.add(new DTO("DTO3", "aaaaaaaaaaaaaaaaaa"));
        mv.addObject("listDto", list);
        mv.setViewName("/dto.jsp");
        return mv;
    }

    //方案二：Model
    /*Model只能传数据，不能返回具体的页面地址。
    返回地址，需要依靠return一个路径。（返回类型需要是String）*/

    @RequestMapping("/dtomodel.do")
    public String listdto2(Model model) {
        List<DTO> list = new LinkedList<>();
        list.add(new DTO("老三", "buyaobilian"));
        list.add(new DTO("劳务", "haohaoxuexi"));
        list.add(new DTO("老器", "yueruguowan"));
        list.add(new DTO("老刘", "hahahaha"));
        //传值
        model.addAttribute("dtolist", list);
        //跳转
        return "/dto.jsp";
    }

    //页面到方法之间的传值
//    方案一:request.getPamerter
    @RequestMapping("addd.do")
    public String addcar2(HttpServletRequest request) {
        String carname = request.getParameter("carname");
        System.out.println(carname);

        request.setAttribute("car", carname);

        return "/car.jsp";
    }


    //方案二：指定具体的类型接受具体的参数
/*
接受整形类型Integer(传递错误不进Action)
接受字符串类型String
接受数组类型Integer[]
只是针对基本类型。
*/
    @RequestMapping("/addd1.do")
    public String addcar3(String carname, Integer carcount, HttpServletRequest request) {

        System.out.println(carname);
        System.out.println(carcount);

        DTO car = new DTO(carname, "carcount");

        request.setAttribute("car", car);


        return "/car.jsp";
    }

//@RequestMapping("/updateCar.do")
//    public String updateCar(String carname, Integer carnum, Integer[] cid){
//    System.out.println(carname);
//    System.out.println(carnum);
//    for (Integer integer : cid) {
//        System.out.println(integer);
//    }
//
//        return "/index.jsp";


    @RequestMapping("/updateCar.do")
    public String updateCar2(Car car) {
        System.out.println(car.getCarname());
        System.out.println(car.getCarnum());
        Integer[] cids = car.getCid();
        for (Integer integer : cids) {
            System.out.println(integer);
        }

        System.out.println("日期："+new SimpleDateFormat().format(car.getCarbirth()));

        CarType carType=new CarType();
        System.out.println("类别："+car.getCarType().getTypename());
        return "/index.jsp";
    }


    @RequestMapping("/addcarcar.do")
    public ModelAndView add(){
        ModelAndView modelAndView = new ModelAndView();
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("博实结911",1234.3,new Date()));
        cars.add(new Car("兰博基尼",87654.8765,new Date()));
        cars.add(new Car("奔驰迈巴赫",1.325,new Date()));
        modelAndView.addObject("cars",cars);
        modelAndView.setViewName("/addcar.jsp");
        return modelAndView;
    }


}
