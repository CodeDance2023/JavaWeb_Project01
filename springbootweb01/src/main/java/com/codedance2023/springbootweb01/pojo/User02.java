package com.codedance2023.springbootweb01.pojo;

public class User02 {
    String name;
    int age;
    String sex;
    String telephone;
    String car;
    double height;
    double weight;
    Address address;


    public User02() {
    }

    public User02(String name, int age, String sex, String telephone, String car, double height, double weight, Address address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.telephone = telephone;
        this.car = car;
        this.height = height;
        this.weight = weight;
        this.address = address;
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
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取
     * @return telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取
     * @return car
     */
    public String getCar() {
        return car;
    }

    /**
     * 设置
     * @param car
     */
    public void setCar(String car) {
        this.car = car;
    }

    /**
     * 获取
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 获取
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * 设置
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * 获取
     * @return address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString() {
        return "User02{name = " + name + ", age = " + age + ", sex = " + sex + ", telephone = " + telephone + ", car = " + car + ", height = " + height + ", weight = " + weight + ", address = " + address + "}";
    }
}
