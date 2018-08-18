package com.qf.controller;

import com.qf.dto.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Controller
public class Action {


    /**
     * 转发和重定向
     * @param request
     * @return
     */
    @RequestMapping("/addcar.do")
    public String text(HttpServletRequest request) {
        request.setAttribute("add", "老三的车");
        return "forward:/index.jsp";
    }

    @RequestMapping("addcar1.do")
    public String tsetredirect(HttpServletRequest request) {
        request.setAttribute("add", "老4的车");
        return "redirect:/index.jsp";
    }


    /**
     * 文件上传
     * @param request
     * @param commonsMultipartFile
     * @return
     * @throws IOException
     */
    //    @RequestMapping("/upload.do")
//    public String textUpload(HttpServletRequest request,@RequestParam("imgFile") MultipartFile multipartFile) throws IOException {
//        //使用request接受普通类型的参数
//        String filendName = request.getParameter("filendName");
//        //使用multipartFile接受文件类型的参数
//        //得到文件名称
//        String filename = multipartFile.getOriginalFilename();
//
//        //希望文件存储的地址
//        File filepath = new File("F:\\java下载\\"+filename);
//        //文件内容写入到指定位置
//        multipartFile.transferTo(filepath);
//
//
//        return "forward:/index.jsp";
//
//
//    }
    @RequestMapping("/upload.do")
    public String textUpload(HttpServletRequest request, @RequestParam("imgFile") CommonsMultipartFile commonsMultipartFile[]) throws IOException {
        //使用request接受普通类型的参数
        String filendName = request.getParameter("filendName");
        //使用multipartFile接受文件类型的参数


        for (CommonsMultipartFile multipartFile : commonsMultipartFile) {
            //得到文件名称
            String filename = multipartFile.getOriginalFilename();

            //希望文件存储的地址
            File filepath = new File("F:\\java下载\\" + filename);
            //文件内容写入到指定位置
            multipartFile.transferTo(filepath);
        }


        return "forward:/index.jsp";


    }


    /**
     * JSON
     * @param request
     * @return
     */

    @ResponseBody
    @RequestMapping("/showcar1.do")
    public List<Car> showcar1(HttpServletRequest request) {
        //仅仅需要返回数据   不需要页面
        List<Car> list = new ArrayList<>();
        list.add(new Car(12, "蓝布基尼", "mache", new Date()));
        list.add(new Car(12, "mazida", "马自达", new Date()));
        list.add(new Car(12, "GTR", "riben", new Date()));
        list.add(new Car(12, "迈巴赫", "benci", new Date()));
        list.add(new Car(12, "大换风", "什么东西", new Date()));
        list.add(new Car(12, "保时捷911", "ennene", new Date()));
        return list;
        //返回的是List<Car>对象，跨语言不能解析，所以使用哪个@ResponseBody注解转化成JSON
    }

    @ResponseBody
    @RequestMapping("/showcar2.do")
    //嵌套Json
    public Map<String, Object> showcar2(HttpServletRequest request) {

        Map<String, Object> map = new ConcurrentHashMap<>();
        map.put("code", 666);
        map.put("信息", "具体信息。。。。。。。。。。。");
        List<Car> list = new ArrayList<>();
        list.add(new Car(12, "蓝布基尼", "mache", new Date()));
        list.add(new Car(12, "mazida", "马自达", new Date()));
        list.add(new Car(12, "GTR", "riben", new Date()));
        list.add(new Car(12, "迈巴赫", "benci", new Date()));
        list.add(new Car(12, "大换风", "什么东西", new Date()));
        list.add(new Car(12, "保时捷911", "ennene", new Date()));

        map.put("data核心数据", list);//嵌套
        return map;
    }


    /*接受非json数据返回JSON*/
    @ResponseBody
    @RequestMapping("/getCar1.do")
    public Map<String, Object> getCar1(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        String name = request.getParameter("name");
        String desc = request.getParameter("desc");
        System.out.println(name);
        System.out.println(desc);
        map.put("name", name);
        map.put("desc", desc);

        return map;
    }


    /*接收json  返回json*/
  /*  @ResponseBody
    @RequestMapping("getCar2.do")//方式一：用Map接收6
    public Map<String, Object> getCar2(@RequestBody Map<String,Object> map) {
        HashMap<String, Object> res = new HashMap<>();
        String name = (String) res.get("name");
        String desc = (String) map.get("desc");//===============用参数集合获取
        System.out.println(name);
        System.out.println(desc);

        res.put("name",name);
        res.put("desc",desc);

        return map;
    }*/

    //方式一：用Map接收6
    @ResponseBody
    @RequestMapping("/getCar2.do")
    public Map<String, Object> getCar1(@RequestBody Map<String, Object> map) {
        Map<String, Object> res = new HashMap<>();
        String uname = (String) map.get("name");
        String udesc = (String) map.get("desc");
        System.out.println(udesc);
        System.out.println(uname);
        res.put("uname", uname + "777777777777777");
        res.put("udesc", udesc);
        return res;
    }

    //方式二：把数据封装在DTO中用对象接收
    @ResponseBody
    @RequestMapping("/getCar3.do")

    public Map getCar3(@RequestBody Car car) {
        Map<String, Object> map = new HashMap<>();

        String carName = car.getCarName();
        String carDesc = car.getCarDesc();
        map.put("carName", carName);
        map.put("carDesc", carDesc + "))))))))))))))))))))))");
        System.out.println(carDesc);
        System.out.println(carName);
        return map;

    }

    //特别：一半JSON一半非JSON
    //整体不是JSON类型========so 参考接收非Json=====可以用request接也可以用实体类接---请求方式必须是Post
 /*   @ResponseBody
    @RequestMapping("/getCar4")
    public Map<String, Object> getCar4(HttpServletRequest request) {//方式1：Request接收

        HashMap<String, Object> map = new HashMap<>();
        map.put("街道name",request.getParameter("carName"));
        map.put("街道Desc",request.getParameter("carDesc"));
        return map;
    }*/

    @ResponseBody
    @RequestMapping("/getCar4")
    public HashMap<Object, Object> getCar4(Car car){//方式2：Car实体类接收
        HashMap<Object, Object> hashMap = new HashMap<>();
        String  接收到的NAMe = (String )hashMap.put("接收到的NAMe", car.getCarName());
        String desc =(String ) hashMap.put("Desc", car.getCarDesc());
        System.out.println(接收到的NAMe+desc);
        return hashMap;
    }
}
