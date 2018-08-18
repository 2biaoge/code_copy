package com.qf.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Car {
    private int carId;
    private String carName;
    private String carDesc;

    @JsonFormat(pattern = "yyyy-MM-dd-HH-mm-ss-SSS")
    private Date carBirth;//默认是Long型

    public Car(int carId, String carName, String carDesc, Date carBirth) {
        this.carId = carId;
        this.carName = carName;
        this.carDesc = carDesc;
        this.carBirth = carBirth;
    }

    public Car(int carId, String carName, String carDesc) {
        this.carId = carId;
        this.carName = carName;
        this.carDesc = carDesc;
    }

    public Car() {
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarDesc() {
        return carDesc;
    }

    public void setCarDesc(String carDesc) {
        this.carDesc = carDesc;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Date getCarBirth() {
        return carBirth;
    }

    public void setCarBirth(Date carBirth) {
        this.carBirth = carBirth;
    }
}
