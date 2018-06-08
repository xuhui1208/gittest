package com.baizhi.entity;

public class Person {
    private String username;
    private String password;
    private Integer salary;

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

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Person(String username, String password, Integer salary) {

        this.username = username;
        this.password = password;
        this.salary = salary;
    }
}
