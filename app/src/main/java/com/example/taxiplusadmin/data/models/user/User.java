package com.example.taxiplusadmin.data.models.user;

import com.example.taxiplusadmin.data.models.trip.TripInfo;
import com.google.firebase.firestore.Exclude;
import java.util.List;


public class User {
    @Exclude
    protected String id;
    @Exclude
    protected String name;
    @Exclude
    protected String email;
    @Exclude
    protected String phone;
    @Exclude
    protected String profileImageUri;
    protected float rating;
    protected List<TripInfo> previousTrips;
    protected String type;


    public User() {
    }

    public User(String type) {
        this.type = type;
    }

    public User(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }


    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public List<TripInfo> getPreviousTrips() {
        return previousTrips;
    }

    public void setPreviousTrips(List<TripInfo> previousTrips) {
        this.previousTrips = previousTrips;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfileImageUri() {
        return profileImageUri;
    }

    public void setProfileImageUri(String profileImageUri) {
        this.profileImageUri = profileImageUri;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
