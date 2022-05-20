package com.example.taxiplusadmin.data.models;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

public class CarDataSource {
    private static final String COLLECTION_NAME = "Car";
    private static final String TAG = "CarDataBase";
    FirebaseFirestore mDB = FirebaseFirestore.getInstance();
    CollectionReference mCollection = mDB.collection(COLLECTION_NAME);

    public ArrayList<Car> getCars() {
        mCollection.get().addOnSuccessListener(S1 -> {
            Log.d(TAG, "getCars: " + S1.toString());
        });

        return null;
    }


    public void addCar(Car car) {
        mCollection.add(car);

    }

    public Car getCarsById(String id) {

        DocumentReference docRef = mCollection.document(id);
        docRef.get().addOnSuccessListener(S1 -> {
            Log.d(TAG, "getCars: " + S1.toString());
        });
        return null;

    }


}