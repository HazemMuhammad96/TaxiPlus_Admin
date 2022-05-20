package com.example.taxiplusadmin.ui.cars;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taxiplusadmin.R;
import com.example.taxiplusadmin.data.models.Car;
import com.example.taxiplusadmin.data.models.CarDataSource;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;

public class CarsFragment extends Fragment {

    ArrayList<Car>car=new ArrayList<>();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initialize();
        CarListAdapter carAdapter=new CarListAdapter(car);
        RecyclerView rCar=view.findViewById(R.id.carRecyclerView);
        rCar.setAdapter(carAdapter);
        rCar.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    public CarsFragment() {
        super(R.layout.fragment_cars);
    }

    void initialize(){
        CarDataSource.mCollection.get().addOnSuccessListener(S1 -> {
            for (QueryDocumentSnapshot document : S1) {
               car.add(document.toObject(Car.class));
            }
        });

    }



}