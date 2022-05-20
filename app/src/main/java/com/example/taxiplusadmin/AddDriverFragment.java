package com.example.taxiplusadmin;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import com.example.taxiplusadmin.data.models.car.Car;
import com.example.taxiplusadmin.data.models.car.CarDataSource;
import com.example.taxiplusadmin.data.models.user.Driver;
import com.example.taxiplusadmin.data.models.user.DriverDataSource;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;


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
        Spinner carInput=view.findViewById(R.id.carInput);
        CheckBox CheckCar = view.findViewById(R.id.CheckCar);
        EditText DriverCar=view.findViewById(R.id.DriverCar);






        ArrayList <String> CarString = new ArrayList<>();
        Button addButton=view.findViewById(R.id.addButton);


        CarDataSource.mCollection.get().addOnSuccessListener(S1 -> {

            for (QueryDocumentSnapshot document : S1) {
                //carInput..add(document.toObject(Car.class));
                CarString.add(document.toObject(Car.class).getCarBrand());
            }
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getContext(),
                    android.R.layout.simple_spinner_item, CarString);

            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            carInput.setAdapter(arrayAdapter);


            carInput.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    String tutorialsName = parent.getItemAtPosition(position).toString();

                    Toast.makeText(parent.getContext(), "Selected: " + tutorialsName, Toast.LENGTH_LONG).show();
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });

        });

        carInput.setEnabled(false);
        CheckCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!CheckCar.isChecked())
                {
                    carInput.setEnabled(false);
                    DriverCar.setEnabled(true);
                }else
                {
                    carInput.setEnabled(true);
                    DriverCar.setEnabled(false);
                }
            }
        });




        addButton.setOnClickListener(view1 -> {


            String name;
            String phone;
            String email;
            String car;
            name=nameInput.getText().toString();
            phone=phoneNumberInput.getText().toString();
            email=emailInputInput.getText().toString();

            if(!CheckCar.isChecked())
            {
                car=DriverCar.getText().toString();
            }
            else
            {
                car=carInput.getSelectedItem().toString();
            }
            DriverDataSource driver=new DriverDataSource();
            driver.addDriver(new Driver(email,name,phone,car));
            Toast toast = Toast.makeText(getContext(),
                    "Succeeded",
                    Toast.LENGTH_SHORT);

            toast.show();

            nameInput.setText("");
            phoneNumberInput.setText("");
            emailInputInput.setText("");
            DriverCar.setText("");

        });




    }

}


