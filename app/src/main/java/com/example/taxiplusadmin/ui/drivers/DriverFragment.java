package com.example.taxiplusadmin.ui.drivers;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taxiplusadmin.R;
import com.example.taxiplusadmin.data.models.car.Car;
import com.example.taxiplusadmin.data.models.car.CarDataSource;
import com.example.taxiplusadmin.data.models.user.Driver;
import com.example.taxiplusadmin.data.models.user.DriverDataSource;
import com.example.taxiplusadmin.ui.cars.CarListAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;

public class DriverFragment extends Fragment {
    private static final String TAG = "DRIVER";

    public DriverFragment() {
        super(R.layout.fragment_drivers);
    }
    ArrayList<Driver>drivers;
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initializeArrayList(view);
        FloatingActionButton driverAddButton=view.findViewById(R.id.driverAddButton);
        driverAddButton.setOnClickListener(view1 -> {
            NavHostFragment.findNavController(this).navigate(R.id.action_nav_drivers_to_addDriver);
        });


    }

  void initializeArrayList(@NonNull View view){
      DriverDataSource.mCollection.get().addOnSuccessListener(S1 -> {
          drivers=new ArrayList<>();
          for (QueryDocumentSnapshot document : S1) {
              drivers.add(document.toObject(Driver.class));
              Log.d(TAG, document.toObject(Driver.class).toString());
          }
          DriverListAdapter adapter=new DriverListAdapter(drivers);
          RecyclerView r1=view.findViewById(R.id.recyclerView);
          r1.setAdapter(adapter);
          r1.setLayoutManager(new LinearLayoutManager(getContext()));
      });
  }



}