package com.qf.pojo;

import java.util.Date;

public class Car {
    private Long carid;

    private String carname;

    private Double carprice;

    private Date cardate;

    private Long cardesc;

    private String info;

    public Long getCarid() {
        return carid;
    }

    public void setCarid(Long carid) {
        this.carid = carid;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public Double getCarprice() {
        return carprice;
    }

    public void setCarprice(Double carprice) {
        this.carprice = carprice;
    }

    public Date getCardate() {
        return cardate;
    }

    public void setCardate(Date cardate) {
        this.cardate = cardate;
    }

    public Long getCardesc() {
        return cardesc;
    }

    public void setCardesc(Long cardesc) {
        this.cardesc = cardesc;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void show(){
        System.out.println(this.getCarname() + "........." + this.getInfo() + "\t" + this.getCarprice());

    }
}