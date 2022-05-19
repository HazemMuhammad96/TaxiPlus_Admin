package com.example.taxiplusadmin.ui.drivers;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taxiplusadmin.R;

import java.util.ArrayList;

public class DriverFragment extends Fragment {
    public DriverFragment() {
        super(R.layout.fragment_drivers);
    }
    ArrayList<Driver>drivers=new ArrayList<>();
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        intializeArrayList();
        DriverListAdapter adapter=new DriverListAdapter(drivers);
        RecyclerView r1=view.findViewById(R.id.recyclerView);
        r1.setAdapter(adapter);
        r1.setLayoutManager(new LinearLayoutManager(getContext()));

    }

  void intializeArrayList(){
        drivers.add(new Driver("Ziad Tarek",25,"BMW"));
        drivers.add(new Driver("hma hazem",27,"mercedes"));
      drivers.add(new Driver("hma wael",23,"toyota"));


  }


}