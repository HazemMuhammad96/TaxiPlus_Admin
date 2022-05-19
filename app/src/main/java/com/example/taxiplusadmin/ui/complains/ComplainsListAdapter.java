package com.example.taxiplusadmin.ui.complains;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taxiplusadmin.R;

import java.util.ArrayList;

public class ComplainsListAdapter extends RecyclerView.Adapter<ComplainsListAdapter.ComplainListHolder> {

    ArrayList<String> Name,Date,Complain;
    ComplainsListAdapter(ArrayList<String> NameList,ArrayList<String>dateList,ArrayList<String>complainList)
    {
        this.Name = NameList;
        this.Date =  dateList;
        this.Complain = complainList;

    }
    @NonNull
    @Override
    public ComplainListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        return new ComplainsListAdapter.ComplainListHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.complain_list_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ComplainListHolder holder, int position) {
        holder.bindNameViews(this.Name.get(position));
        holder.bindDateViews(this.Date.get(position));
        holder.bindComplainViews(this.Complain.get(position));
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ComplainListHolder extends RecyclerView.ViewHolder {

        TextView name_TXT,date_TXT,complain_TXT;


        public ComplainListHolder(@NonNull View itemView) {
            super(itemView);
            name_TXT = itemView.findViewById(R.id.issued_Name);
            date_TXT = itemView.findViewById(R.id.date_TXT);
            complain_TXT = itemView.findViewById(R.id.complain_TXT);
        }

        void bindNameViews(String currentObject){
            name_TXT.setText(currentObject);
        }
        void bindDateViews(String currentObject){
            date_TXT.setText(currentObject);
        }
        void bindComplainViews(String currentObject){
            complain_TXT.setText(currentObject);
        }


    }
}
