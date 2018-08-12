package com.qf.dao;

import com.qf.pojo.Car;
import com.qf.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class CarMapperDAO implements CarMapper {
    @Override
    public int deleteByPrimaryKey(Long carid) {
        SqlSession sqlSesssion = MybatisUtil.getSqlSesssion();
        int delete = sqlSesssion.delete("com.qf.dao.CarMapper.deleteByPrimaryKey", carid);
        sqlSesssion.commit();
        sqlSesssion.close();
        return delete;

    }

    @Override
    public int insert(Car record) {
        return 0;
    }

    @Override
    public int insertSelective(Car record) {
        return 0;
    }

    @Override
    public Car selectByPrimaryKey(Long carid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Car record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Car record) {
        SqlSession sqlSesssion = MybatisUtil.getSqlSesssion();
        int update = sqlSesssion.update("com.qf.dao.CarMapper.updateByPrimaryKey", record);
        sqlSesssion.commit();
        sqlSesssion.close();
        return update;
    }



    /*----------------------------------------------------------*/
    @Override
    public int add1(Car car) {
        SqlSession sqlSesssion = MybatisUtil.getSqlSesssion();
        int i = sqlSesssion.insert("com.qf.dao.CarMapper.add1", car);
        sqlSesssion.commit();
        sqlSesssion.close();
        return i;
    }

    @Override
    public int add2(Car car) {
        SqlSession sqlSesssion = MybatisUtil.getSqlSesssion();
        CarMapper mapper = sqlSesssion.getMapper(CarMapper.class);
        int i = mapper.add2(car);
        sqlSesssion.commit();
        sqlSesssion.close();
        return i;
    }



   /* @Override
    public int delbyById(Long id) {
        SqlSession sqlSesssion = MybatisUtil.getSqlSesssion();
        int delete = sqlSesssion.delete("com.qf.dao.CarMapper.deleteByPrimaryKey", id);
        sqlSesssion.commit();
        sqlSesssion.close();
        return delete;
    }*/

    @Override
    public int updele(Car car) {
        SqlSession sqlSesssion = MybatisUtil.getSqlSesssion();
        CarMapper mapper = sqlSesssion.getMapper(CarMapper.class);
        int i = mapper.updele(car);
        sqlSesssion.commit();
        sqlSesssion.close();
        return i;
    }

    @Override
    public Car findByID(Long id) {
        SqlSession sqlSesssion = MybatisUtil.getSqlSesssion();
        CarMapper mapper = sqlSesssion.getMapper(CarMapper.class);
        Car car = mapper.findByID(id);
        sqlSesssion.close();
        return car;
    }

    @Override
    public List<Car> findAll() {

        SqlSession sqlSesssion = MybatisUtil.getSqlSesssion();
        List<Car> cars = sqlSesssion.selectList("com.qf.dao.CarMapper.findAll");
        sqlSesssion.close();
        return cars;
    }

    @Override
    public List<Car> findByxxx(Car car) {
        SqlSession sqlSesssion = MybatisUtil.getSqlSesssion();

        CarMapper mapper = sqlSesssion.getMapper(CarMapper.class);
        List<Car> carList = mapper.findByxxx(car);
        sqlSesssion.commit();
        sqlSesssion.close();
        return carList;
    }

    @Override
    public List<Car> findByPage(Map map) {
        SqlSession sqlSesssion = MybatisUtil.getSqlSesssion();
        CarMapper mapper = sqlSesssion.getMapper(CarMapper.class);
        List<Car> list = mapper.findByPage(map);
        sqlSesssion.commit();
        sqlSesssion.close();
        return list;
    }

    @Override
    public List<Car> findByprices(List list) {
        SqlSession sqlSesssion = MybatisUtil.getSqlSesssion();
        CarMapper mapper = sqlSesssion.getMapper(CarMapper.class);
        List<Car> cars = mapper.findByprices(list);
        sqlSesssion.commit();
        sqlSesssion.close();
        return cars;

    }

    @Override
    public List<Car> findLikeCarname(Map map) {
        SqlSession sqlSession=MybatisUtil.getSqlSesssion();
        List<Car> cars = sqlSession.selectList("com.qf.dao.CarMapper.findLikeCarname", map);
        sqlSession.commit();
        sqlSession.close();
        return cars;
    }
}
