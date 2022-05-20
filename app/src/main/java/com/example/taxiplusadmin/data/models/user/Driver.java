package com.example.taxiplusadmin.data.models.user;

public class Driver extends User {
    private String carID;

    public Driver() {
        super();
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }
}
