package com.qf.dao;

import com.qf.pojo.TbComputer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Auther: Administrator
 * Thanks for Everything
 */
public interface ComputerDAO extends JpaRepository<TbComputer,Long> {
    //持久层已经开发完成.
    //crud+分页功能已经具备。
    @Query("from TbComputer where comModel like %:comModel%")
    public List<TbComputer> findByComModel(@Param("comModel") String comModel);

    @Modifying
    @Query("update TbComputer set comModel=?1 where comId=?2")
    public void udpdateCom(String comModel,long comId);
    //参数必须对应?顺序
    //必须加事务,事务使用注解,可以加在服务层
}
