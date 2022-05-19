package com.example.taxiplusadmin.ui.cars;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taxiplusadmin.R;

import java.util.ArrayList;

public class CarsFragment extends Fragment {

    ArrayList<String>cars=new ArrayList<>();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        intializeArrayList();
        CarListAdapter carAdapter=new CarListAdapter(cars);
        RecyclerView rCar=view.findViewById(R.id.carRecyclerView);
        rCar.setAdapter(carAdapter);
        rCar.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    public CarsFragment() {
        super(R.layout.fragment_cars);
    }


    void intializeArrayList(){
        cars.add("toyota");
        cars.add("heyundai");
        cars.add("hounda");
    }


}