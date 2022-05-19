package com.example.taxiplusadmin.ui.drivers;

public class Driver {
    int  id;
    int age;
    String phoneNumber;
    String name;
    String car;


    public Driver(String name, int age,  String car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
