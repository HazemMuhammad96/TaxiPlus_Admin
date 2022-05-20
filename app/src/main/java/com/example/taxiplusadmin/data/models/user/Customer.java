package com.example.taxiplusadmin.data.models.user;

import java.util.ArrayList;
import java.util.List;


public class Customer extends User {
    List<String> savedPlaces;

    public List<String> getSavedPlaces() {
        return savedPlaces;
    }

    public void setSavedPlaces(List<String> savedPlaces) {
        this.savedPlaces = savedPlaces;
    }

    public Customer() {
        super();
    }
}
