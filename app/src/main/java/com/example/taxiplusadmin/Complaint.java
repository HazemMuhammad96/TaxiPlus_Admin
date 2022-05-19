package com.example.taxiplusadmin;

public class Complaint {
    private int ID;
    private String problem;
    private String date;
    private int tripID;
    private String name;
    public Complaint(int ID, String problem, String date, int tripID, String name) {
        this.ID = ID;
        this.problem = problem;
        this.date = date;
        this.tripID = tripID;
        this.name=name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        problem = problem;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        date = date;
    }

    public int getTripID() {
        return tripID;
    }

    public void setTripID(int tripID) {
        this.tripID = tripID;
    }


}
