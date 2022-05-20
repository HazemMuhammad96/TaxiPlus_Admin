package com.example.taxiplusadmin.ui.cars;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taxiplusadmin.R;
import com.example.taxiplusadmin.data.models.car.Car;
import com.example.taxiplusadmin.data.models.car.CarDataSource;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;

public class CarsFragment extends Fragment {

    private static final String TAG = "CAR" ;
    ArrayList<Car>car=new ArrayList<>();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initialize(view);
        FloatingActionButton carAddButton=view.findViewById(R.id.addCar);
        carAddButton.setOnClickListener(view1 -> {
            NavHostFragment.findNavController(this).navigate(R.id.action_nav_cars_to_addCarFragment);
        });

    }

    public CarsFragment() {
        super(R.layout.fragment_cars);
    }

    void initialize(View view){
        CarDataSource.mCollection.get().addOnSuccessListener(S1 -> {
            for (QueryDocumentSnapshot document : S1) {
               car.add(document.toObject(Car.class));
                Log.d(TAG, document.toObject(Car.class).toString());
            }
            CarListAdapter carAdapter=new CarListAdapter(car);
            RecyclerView rCar=view.findViewById(R.id.addCarButton);
            rCar.setAdapter(carAdapter);
            rCar.setLayoutManager(new LinearLayoutManager(getContext()));
        });

    }



}