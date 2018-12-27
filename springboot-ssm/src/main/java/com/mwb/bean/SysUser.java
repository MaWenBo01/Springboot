package com.mwb.bean;

import java.io.Serializable;

/**
 * Created by admin on 2018/12/27.
 */
public class SysUser implements Serializable{
     /**
      *
      *
      */
    private static final long serialVersionUID=1L;
    private Integer id;
    private String userName;
    private String password;

    public SysUser(Integer id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public SysUser() {
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
