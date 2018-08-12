package com.qf.pojo;

public class UserInfo {
    private Long id;
    private String userName;
    private String userPass;

    public UserInfo() {
    }

    public UserInfo(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }


    public String userShow() {
        return "UserInfo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                '}';
    }
}
