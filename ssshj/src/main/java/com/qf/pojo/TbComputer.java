package com.qf.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Auther: Administrator
 * Thanks for Everything
 */
@Entity
@Table(name = "tb_computer")
public class TbComputer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "com_id")
    private long comId;
    @Column(name = "com_model")
    private String comModel;
    @Column(name = "com_gendate")
    private Timestamp comGendate;//时间类
    @Column(name = "com_price")
    private Double comPrice;
    @Column(name = "com_desc")
    private String comDesc;

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

    public Timestamp getComGendate() {
        return comGendate;
    }

    public void setComGendate(Timestamp comGendate) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbComputer that = (TbComputer) o;
        return comId == that.comId &&
                Objects.equals(comModel, that.comModel) &&
                Objects.equals(comGendate, that.comGendate) &&
                Objects.equals(comPrice, that.comPrice) &&
                Objects.equals(comDesc, that.comDesc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(comId, comModel, comGendate, comPrice, comDesc);
    }
}
