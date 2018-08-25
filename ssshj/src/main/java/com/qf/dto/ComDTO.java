package com.qf.dto;

/**
 * @Auther: Administrator
 * Thanks for Everything
 */
public class ComDTO {
    private long comId;
    private String comModel;
    private String comGendate;//时间类
    private Double comPrice;
    private String comDesc;

    public ComDTO() {
    }

    public ComDTO(String comModel, String comGendate, Double comPrice, String comDesc) {
        this.comModel = comModel;
        this.comGendate = comGendate;
        this.comPrice = comPrice;
        this.comDesc = comDesc;
    }

    public long getComId() {
        return comId;
    }

    public void setComId(long comId) {
        this.comId = comId;
    }

    public String getComModel() {
        return comModel;
    }

    public void setComModel(String comModel) {
        this.comModel = comModel;
    }

    public String getComGendate() {
        return comGendate;
    }

    public void setComGendate(String comGendate) {
        this.comGendate = comGendate;
    }

    public Double getComPrice() {
        return comPrice;
    }

    public void setComPrice(Double comPrice) {
        this.comPrice = comPrice;
    }

    public String getComDesc() {
        return comDesc;
    }

    public void setComDesc(String comDesc) {
        this.comDesc = comDesc;
    }
}
