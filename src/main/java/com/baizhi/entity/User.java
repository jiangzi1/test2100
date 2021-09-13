package com.baizhi.entity;

import java.util.Date;

public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private Date bir;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", bir=" + bir +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    public User(Integer id, String username, String password, Integer age, Date bir) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.bir = bir;
    }

    public User() {
    }
}
