package com.baizhi.entity;

import javax.sql.rowset.serial.SerialArray;
import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
    private String username;
    private String password;
    private String salary;
    public Integer getAge() {
        return age;
    }
    private Integer age;
    private Date newDate;
    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getNewDate() {
        return newDate;
    }

    public void setNewDate(Date newDate) {
        this.newDate = newDate;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salary='" + salary + '\'' +
                '}';
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Student(String username, String password, String salary) {

        this.username = username;
        this.password = password;
        this.salary = salary;
    }
}
