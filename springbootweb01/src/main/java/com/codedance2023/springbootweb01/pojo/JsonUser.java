package com.codedance2023.springbootweb01.pojo;

public class JsonUser {
    String name;
    int age;
    String tele;


    public JsonUser() {
    }

    public JsonUser(String name, int age, String tele) {
        this.name = name;
        this.age = age;
        this.tele = tele;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return tele
     */
    public String getTele() {
        return tele;
    }

    /**
     * 设置
     * @param tele
     */
    public void setTele(String tele) {
        this.tele = tele;
    }

    public String toString() {
        return "JsonUser{name = " + name + ", age = " + age + ", tele = " + tele + "}";
    }
}

