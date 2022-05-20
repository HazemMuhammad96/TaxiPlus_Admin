package com.example.taxiplusadmin.ui.complains;

import com.example.taxiplusadmin.data.models.trip.TripInfo;

import java.io.Serializable;

public class Complaint implements Serializable {
    private String Complain;
    private String date;
    private String tripInfo;
    private String name;
    private String problem;
    public Complaint() {}

    public Complaint(String complain, String date, String name, String problem , String tripInfo) {
        Complain = complain;
        this.date = date;
        this.name = name;
        this.problem=problem;
        this.tripInfo=tripInfo;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getComplain() {
        return Complain;
    }

    public void setComplain(String complain) {
        Complain = complain;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTripInfo() {
        return tripInfo;
    }

    public void setTripInfo(String tripInfo) {
        this.tripInfo = tripInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
