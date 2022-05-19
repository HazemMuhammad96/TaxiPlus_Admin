package com.example.taxiplusadmin.ui.drivers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taxiplusadmin.R;

import java.util.ArrayList;

public class DriverListAdapter extends RecyclerView.Adapter<DriverListAdapter.DriverViewHolder> {
    ArrayList<String> drivers;
    public DriverListAdapter(ArrayList<String>drivers){
        this.drivers=drivers;
    }
    @NonNull
    @Override
    public DriverViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DriverViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.driver_list_item,parent,false)) ;
    }

    @Override
    public void onBindViewHolder(@NonNull DriverListAdapter.DriverViewHolder holder, int position) {
        holder.bindViews(drivers.get(position));
    }

    @Override
    public int getItemCount() {
        return drivers.size();
    }

    public class DriverViewHolder extends RecyclerView.ViewHolder {
        TextView DriverInfo;
        public DriverViewHolder(@NonNull View itemView) {
            super(itemView);
            DriverInfo=itemView.findViewById(R.id.driverName);
        }
        void bindViews(String currentObject){
            DriverInfo.setText(currentObject);
        }
    }
}
