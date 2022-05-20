package com.example.taxiplusadmin.data.models;

public class Car {
    String carBrand;
    String licenseNumber;
    String color;
    String carID;

    public Car() {}

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public Car(String carBrand, String licenseNumber) {
        this.carBrand = carBrand;
        this.licenseNumber = licenseNumber;
    }

    public Car(String carBrand, String licenseNumber, String color) {
        this.carBrand = carBrand;
        this.licenseNumber = licenseNumber;
        this.color = color;
    }


    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
