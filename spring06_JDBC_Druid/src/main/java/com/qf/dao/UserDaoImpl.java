package com.qf.dao;

import com.qf.pojo.UserInfo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl extends JdbcDaoSupport implements UserDao {

    //使用Jdbc模板类操作SQL语句
    @Override
    public void addUser(UserInfo pojo) {
        //得到JdbcTemplate模板类，操作SQL语句
        /*
        * 得到模板类的两种方式----------父类源码
        * 方式1：注入数据源，就能得到模板类的对象   .setDataSource();
        *
        * 方式2：源码中有set方法 直接设置JdbcTemplate模板类 setJdbcTemplate
        * */

        String sql="insert into userinfo (user_name,user_pass) values(?,?)";
        this.getJdbcTemplate().update(sql,pojo.getUserName(),pojo.getUserPass());

    }

    @Override
    public void del(Long id) {
        String sql="delete from userinfo where uid=?";
        getJdbcTemplate().update(sql,id);

    }

    @Override
    public void update(UserInfo pojo) {

        String sql = "update userinfo set user_name=?,user_pass=? where uid=?";
        getJdbcTemplate().update(sql,pojo.getUserName(),pojo.getUserPass(),pojo.getId());

    }

    @Override
    public UserInfo findById(Long id) {

        String s="select * from userinfo where uid=?";
        UserInfo userInfo= getJdbcTemplate().queryForObject(s, new RowMapper<UserInfo>() {
            @Override
           public UserInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
                UserInfo userInfo=new UserInfo();
                userInfo.setId(rs.getLong("uid"));
                userInfo.setUserName(rs.getString("user_name"));
                userInfo.setUserPass(rs.getString("user_pass"));
                return userInfo;
            }
        }, id);
        return userInfo;
    }

    @Override
    public List<UserInfo> findAll() {
        String s="select * from userinfo";
        List<UserInfo> userInfos = getJdbcTemplate().query(s, new RowMapper<UserInfo>() {

            @Override
            public UserInfo mapRow(ResultSet rs, int rowNum) throws SQLException {

                UserInfo userInfo=new UserInfo();
                userInfo.setId(rs.getLong("uid"));
                userInfo.setUserName(rs.getString("user_name"));
                userInfo.setUserPass(rs.getString("user_pass"));
                return userInfo;
            }
        });
        return userInfos;
    }
}
