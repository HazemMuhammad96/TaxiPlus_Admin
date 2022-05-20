package com.example.taxiplusadmin.ui.cars;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taxiplusadmin.R;
import com.example.taxiplusadmin.data.models.car.Car;

import java.util.ArrayList;

public class CarListAdapter extends RecyclerView.Adapter<CarListAdapter.CarViewHolder> {
    ArrayList<Car>cars;
    public CarListAdapter(ArrayList<Car> cars){
        this.cars=cars;
    }
    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CarListAdapter.CarViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.car_list_item,parent,false)) ;
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        holder.carBrand.setText( cars.get(position).getCarBrand());
        holder.licenseNumber.setText( cars.get(position).getLicenseNumber());
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    public class CarViewHolder extends RecyclerView.ViewHolder {
        TextView carBrand,licenseNumber;
        public CarViewHolder(@NonNull View itemView) {
            super(itemView);
            carBrand=itemView.findViewById(R.id.carName);
            licenseNumber=itemView.findViewById(R.id.licenseNumber);
        }

    }
}
