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
        car.add(new Car("heyundai","1234"));
        car.add(new Car("BMW","25353"));
        car.add(new Car("Mercedes","2123"));


    }



}