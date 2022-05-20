package com.example.taxiplusadmin.ui.drivers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taxiplusadmin.R;
import com.example.taxiplusadmin.data.models.user.Driver;

import java.util.ArrayList;

public class DriverListAdapter extends RecyclerView.Adapter<DriverListAdapter.DriverViewHolder> {
    ArrayList<Driver> drivers;
    public DriverListAdapter(ArrayList<Driver>drivers){
        this.drivers=drivers;
    }
    @NonNull
    @Override
    public DriverViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DriverViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.driver_list_item,parent,false)) ;
    }

    @Override
    public void onBindViewHolder(@NonNull DriverListAdapter.DriverViewHolder holder, int position) {
        holder.driverName.setText(drivers.get(position).getName());
        holder.driverAge.setText(drivers.get(position).getPhone()+"");
        holder.carModel.setText(drivers.get(position).getCar());
    }

    @Override
    public int getItemCount() {
        return drivers.size();
    }

    public class DriverViewHolder extends RecyclerView.ViewHolder {
        TextView driverName,driverAge,carModel;
        public DriverViewHolder(@NonNull View itemView) {
            super(itemView);
            driverName=itemView.findViewById(R.id.driverName);
            driverAge=itemView.findViewById(R.id.phoneNumber);
            carModel=itemView.findViewById(R.id.carModel);
        }

    }
}
