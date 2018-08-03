package com.qf.dao;

import com.qf.pojo.Car;

import java.util.List;
import java.util.Map;

public interface CarMapper {
    int deleteByPrimaryKey(Long carid);

    int insert(Car record);

    int insertSelective(Car record);

    Car selectByPrimaryKey(Long carid);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);

    /*-----------------------------------------*/

    int add1(Car car);

    int add2(Car car);


    //int delbyById(Long id);

    int updele(Car car);

    Car findByID(Long id);

    List<Car> findAll();


    List<Car> findByxxx(Car car);

    List<Car> findByPage(Map map);

    List<Car> findByprices(List list);

    List<Car> findLikeCarname (Map map);
}