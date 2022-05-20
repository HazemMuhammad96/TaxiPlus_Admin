package com.example.taxiplusadmin.ui.complains;

import com.example.taxiplusadmin.data.models.car.Car;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class ComplainsDataSource {
    private static final String COLLECTION_NAME = "complain";
    private static final String TAG = "complains";
    public static FirebaseFirestore mDB = FirebaseFirestore.getInstance();
    public static CollectionReference mCollection = mDB.collection(COLLECTION_NAME);

    public void addComplain(Complaint complaint) {
        mCollection.add(complaint);

    }
}
