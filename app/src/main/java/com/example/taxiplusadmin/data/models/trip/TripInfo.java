package com.example.taxiplusadmin.data.models.trip;


import com.google.android.gms.maps.model.LatLng;

import java.util.Date;

public class TripInfo {

    private String customerID;
    private String driverID;
    private LatLng pickupPoint;
    private LatLng Destination;
    private double carFare;
    private Date pickupDate;

    public TripInfo() {
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public LatLng getPickupPoint() {
        return pickupPoint;
    }

    public void setPickupPoint(LatLng pickupPoint) {
        this.pickupPoint = pickupPoint;
    }

    public LatLng getDestination() {
        return Destination;
    }

    public void setDestination(LatLng destination) {
        Destination = destination;
    }

    public double getCarFare() {
        return carFare;
    }

    public void setCarFare(double carFare) {
        this.carFare = carFare;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }
}

