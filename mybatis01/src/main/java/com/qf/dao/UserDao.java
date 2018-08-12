package com.qf.dao;

import com.qf.pojo.User;
import com.qf.utils.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDao {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        userDao.findAll(1L);

      //userDao.add2();
       //userDao.del2(13L);
      userDao.update2();



        userDao.selectAll();


    }

    public void findAll(Long id) {

//加载核心配置文件

        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            //创建SqlSessionFactory
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            //得到sqlsession
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //执行操作
            //定位SQL语句位置-----命名空间+statementID
            String s = "com.qf.selectUser";
            User user = sqlSession.selectOne(s,id);


            //测试
            String x = user.toString();
            System.out.println(x);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void selectAll(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        List<User> list = sqlSession.selectList("com.qf.selectAll");
        for (User user : list) {
            System.out.println(user.toString());
        }
        sqlSession.close();
    }

    public void add1(){
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        Map<String, Object> map = new HashMap<>();
        map.put("username","李老八");
        map.put("password","1234567890");
        int i = sqlSession.insert("com.qf.add1", map);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(i);
    }

    public void add2(){
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        User user=new User("皮炎平","9999999999");
        int i = sqlSession.insert("com.qf.add1", user);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(i);
    }

    public void del1(Long id){
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        int delete = sqlSession.delete("com.qf.del1", id);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(delete);

    }
    public void del2(Long id){
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        int delete = sqlSession.delete("com.qf.del1", id);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(delete);

    }

    public void update1(){
        SqlSession sqlSession=MybatisUtil.getSqlSession();
         User user=new User(10L,"DDDD","DDDD");
        int i = sqlSession.update("com.qf.update1", user);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(i);

    }
    public void update2(){
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        Map<String, Object> map = new HashMap<>();
        map.put("id",15L);

        map.put("password","0987654");
        int i = sqlSession.update("com.qf.update2", map);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(i);

    }
}
