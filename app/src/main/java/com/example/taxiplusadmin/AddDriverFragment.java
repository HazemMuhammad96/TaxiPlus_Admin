package com.example.taxiplusadmin;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.example.taxiplusadmin.data.models.user.Driver;
import com.example.taxiplusadmin.data.models.user.DriverDataSource;


public class AddDriverFragment extends Fragment {

    public AddDriverFragment() {
        super(R.layout.add_driver);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        EditText nameInput=view.findViewById(R.id.driverNameInput);
        EditText phoneNumberInput=view.findViewById(R.id.phoneNumberInput);
        EditText emailInputInput=view.findViewById(R.id.emailInput);
        EditText carInput=view.findViewById(R.id.carInput);

        Button addButton=view.findViewById(R.id.addButton);

        addButton.setOnClickListener(view1 -> {
            String name;
            String phone;
            String email;
            String car;
            name=nameInput.getText().toString();
            phone=phoneNumberInput.getText().toString();
            email=emailInputInput.getText().toString();
            car=carInput.getText().toString();
            DriverDataSource driver=new DriverDataSource();
            driver.addDriver(new Driver(email,name,phone,car));
            Toast toast = Toast.makeText(getContext(),
                    "Succeeded",
                    Toast.LENGTH_SHORT);

            toast.show();
        });




    }
}


