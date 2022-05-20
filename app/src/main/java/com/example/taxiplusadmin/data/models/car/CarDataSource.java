package com.example.taxiplusadmin.data.models.car;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.taxiplusadmin.data.models.car.Car;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class CarDataSource {
    private static final String COLLECTION_NAME = "car";
    private static final String TAG = "CarDataBase";
    public static FirebaseFirestore mDB = FirebaseFirestore.getInstance();
    public static CollectionReference mCollection = mDB.collection(COLLECTION_NAME);

    public void addCar(Car car) {
        mCollection.add(car);

    }


}
