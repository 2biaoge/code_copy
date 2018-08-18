package com.qf.dto;

import java.util.Date;

public class DTO {
    private int dtoid;
    private String dtoname;
    private String dtoinfo;
    private Date date;

    public DTO() {
    }

    public DTO(int dtoid, String dtoname, String dtoinfo, Date date) {
        this.dtoid = dtoid;
        this.dtoname = dtoname;
        this.dtoinfo = dtoinfo;
        this.date = date;
    }

    public DTO(String dtoname, String dtoinfo) {
        this.dtoname = dtoname;
        this.dtoinfo = dtoinfo;
    }

    public int getDtoid() {
        return dtoid;
    }

    public void setDtoid(int dtoid) {
        this.dtoid = dtoid;
    }

    public String getDtoname() {
        return dtoname;
    }

    public void setDtoname(String dtoname) {
        this.dtoname = dtoname;
    }

    public String getDtoinfo() {
        return dtoinfo;
    }

    public void setDtoinfo(String dtoinfo) {
        this.dtoinfo = dtoinfo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
