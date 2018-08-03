package com.qf.text;

import com.qf.service.StudentService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdviceTest {
    @Test
    public void tsetSeuduntService(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取谁-----代理类的对象
        //谁接收-----目标类接口接收代理对象（代理工厂ProxyFactory返回代理对象用目标类接收）
        StudentService studentService = (StudentService) context.getBean("studentServiceProxy");

       /* studentService.xuexi();*/

        studentService.getStudent();

//        System.out.println(student);//调用方法立即执行..织的入通知---------此处打印是调用通知之后的内容。。。
    }
}
