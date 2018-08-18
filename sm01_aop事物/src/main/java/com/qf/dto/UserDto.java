package com.qf.dto;

public class UserDto {
    private Long id;
    private String usernamedto;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsernamedto() {
        return usernamedto;
    }

    public void setUsernamedto(String usernamedto) {
        this.usernamedto = usernamedto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
