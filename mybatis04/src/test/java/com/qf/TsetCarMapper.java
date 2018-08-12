package com.qf;

import com.qf.dao.CarMapper;
import com.qf.dao.CarMapperDAO;
import com.qf.pojo.Car;
import org.junit.Test;

import java.util.*;

public class TsetCarMapper {

    @Test
    public void add1(){
        Car car = new Car();
        car.setCarname("五菱宏光");
        car.setCarprice(1000000D);
        //car.setCardate(new Date());
        car.setCardesc(55L);
        car.setInfo("秋名山第一座驾。。。。。。。。。。。。");

        CarMapper carMapper=new CarMapperDAO();
        int i = carMapper.add1(car);
        System.out.println(i);
    }
    @Test
    public void add2(){
        Car car = new Car();
        car.setCarname("科迈罗5");
        car.setCarprice(399999.98);
        //car.setCardate(new Date());
        car.setCardesc(889L);
        car.setInfo("。。。。。。。。。。。。变形金刚之大皇风");

        CarMapper carMapper=new CarMapperDAO();
        int i = carMapper.add2(car);
        System.out.println(i);
    }
    @Test
    public void del1(){

        CarMapper carMapper=new CarMapperDAO();
        int i = carMapper.deleteByPrimaryKey(7L);
        System.out.println(i);
    }

    @Test
    public void update(){
        Car car = new Car();
        car.setCarname("特斯拉V3");
        car.setCarprice(300D);
        //car.setCardate(new Date());
        //car.setCardesc(889L);
        car.setCarid(6L);
        car.setInfo("电动小马达");

        CarMapper carMapper=new CarMapperDAO();
        int updele = carMapper.updele(car);
        System.out.println(updele);

    }
    @Test
    public void update2(){
        Car car = new Car();
        car.setCarname("特斯拉V3");
        car.setCarprice(300D);
        //car.setCardate(new Date());
        //car.setCardesc(889L);
        car.setCarid(8L);
        car.setInfo("电动小马达");

        CarMapper carMapper=new CarMapperDAO();
        int updele = carMapper.updateByPrimaryKey(car);
        System.out.println(updele);
    }


    @Test
    public void tsetfindById(){
        CarMapper carMapper =new CarMapperDAO();
        Car car = carMapper.findByID(6L);
        System.out.println(car.getCarname()+"........."+car.getInfo()+"\t"+car.getCarprice());
    }

    @Test
    public void tsetfindAll(){
        CarMapper carMapper =new CarMapperDAO();
        List<Car> list = carMapper.findAll();
        for (Car car : list) {
            System.out.println(car.getCarname()+"........."+car.getInfo()+"\t"+car.getCarprice());

        }
    }

    @Test
    public void tsetfindByxxx() {
        Car car1 = new Car();
        car1.setCarname("特斯拉V3");
        CarMapper carMapper = new CarMapperDAO();
        List<Car> list = carMapper.findByxxx(car1);
        for (Car car : list) {
            System.out.println(car.getCarname() + "........." + car.getInfo() + "\t" + car.getCarprice());
        }
    }

    @Test
    public void tsetFindByPage(){
        Map<String,Integer> map = new HashMap();
        map.put("startIndex",1);
        map.put("pageSize",3);
        CarMapper carMapper=new CarMapperDAO();
        List<Car> cars = carMapper.findByPage(map);
        for (Car car : cars) {
            System.out.println(car.getCarname() + "........." + car.getInfo() + "\t" + car.getCarprice());
        }
    }
    @Test
    public void tsetFindByprices(){
        List<Double> list =new ArrayList<>();
        list.add(25.5);
        list.add(399999.98);
        list.add(300D);

        CarMapper carMapper=new CarMapperDAO();
        List<Car> cars = carMapper.findByprices(list);
        for (Car car : cars) {
            car.show();
        }
    }
    @Test
    public void tsetFindLikeCarname(){
        Map<String,String> map=new HashMap();
        String put = map.put("likeString", "%特%");
        CarMapper carMapper=new CarMapperDAO();
        List<Car> cars = carMapper.findLikeCarname(map);
        for (Car car : cars) {
            car.show();
        }
    }
}
