package com.example.taxiplusadmin.ui.cars;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.taxiplusadmin.R;
import com.example.taxiplusadmin.data.models.car.Car;
import com.example.taxiplusadmin.data.models.car.CarDataSource;

public class AddCarFragment extends Fragment {
    public AddCarFragment(){
        super(R.layout.add_car);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        EditText carBrandInput =view.findViewById(R.id.nameInput);
        EditText licenceNumberInput =view.findViewById(R.id.licenceNumberInput);
        EditText carColorInput =view.findViewById(R.id.colorInput);
        Button addCarButton=view.findViewById(R.id.addCarInput);
        addCarButton.setOnClickListener(view1 -> {
            String carBrand=carBrandInput.getText().toString();
            String licenseNumber=licenceNumberInput.getText().toString();
            String carColor=carColorInput.getText().toString();
            CarDataSource car = new CarDataSource();
            car.addCar(new Car(carBrand,licenseNumber,carColor));
            Toast toast = Toast.makeText(getContext(),
                    "succeed",
                    Toast.LENGTH_SHORT);

            toast.show();
//
        });
    }
}
