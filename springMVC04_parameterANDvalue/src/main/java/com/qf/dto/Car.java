package com.qf.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Car {
    private String carname;
    private Integer carnum;
    private Integer[] cid;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date carbirth;

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    private double price;

    private CarType carType;

    public Car(String carname, double price,Date carbirth) {
        this.carname = carname;
        this.carbirth = carbirth;
        this.price = price;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCarbirth() {
        return carbirth;
    }

    public void setCarbirth(Date carbirth) {
        this.carbirth = carbirth;
    }

    public Car() {
    }

    public Car(String carname, Integer carnum, Integer[] cid) {
        this.carname = carname;
        this.carnum = carnum;
        this.cid = cid;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public Integer getCarnum() {
        return carnum;
    }

    public void setCarnum(Integer carnum) {
        this.carnum = carnum;
    }

    public Integer[] getCid() {
        return cid;
    }

    public void setCid(Integer[] cid) {
        this.cid = cid;
    }
}
