package com.example.taxiplusadmin.data.models.user;

import com.example.taxiplusadmin.data.models.car.Car;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class DriverDataSource {
    private static final String COLLECTION_NAME = "Drivers";
    private static final String TAG = "DriverDataBase";
    public static FirebaseFirestore mDB = FirebaseFirestore.getInstance();
    public static CollectionReference mCollection = mDB.collection(COLLECTION_NAME);

    public void addDriver(Driver driver) {
        mCollection.add(driver);
    }
}
