package com.example.taxiplusadmin.data.models.user;

public class Driver extends User {

    String car;

    public Driver() {

    }

    public Driver(String email, String name, String phone, String car) {
        super(email, name, phone);
        this.car = car;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
}