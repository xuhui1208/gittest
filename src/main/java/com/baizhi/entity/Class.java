package com.baizhi.entity;

public class Class {
    private String name;
    private String num;

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", num='" + num + '\'' +
                '}';
    }

    public Class(String name, String num) {
        this.name = name;
        this.num = num;
    }
}
