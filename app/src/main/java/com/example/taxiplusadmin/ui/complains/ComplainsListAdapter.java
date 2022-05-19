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

    ArrayList<Complaint> complaints;
    public ComplainsListAdapter(ArrayList<Complaint> complaints)
    {
        this.complaints=complaints;
    }
    @NonNull
    @Override
    public ComplainListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.complain_list_item, parent,false);
      return new ComplainListHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ComplainListHolder holder, int position) {
        holder.complain_TXT.setText(complaints.get(position).getProblem());
        holder.date_TXT.setText(complaints.get(position).getDate());
        //holder.complain_TXT.setText(complaints.get(position).getID());
        holder.name_TXT.setText(complaints.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return complaints.size();
    }

    public class ComplainListHolder extends RecyclerView.ViewHolder {

        TextView name_TXT,date_TXT,complain_TXT;


        public ComplainListHolder(@NonNull View itemView) {
            super(itemView);
            name_TXT = itemView.findViewById(R.id.issued_Name);
            date_TXT = itemView.findViewById(R.id.date_TXT);
            complain_TXT = itemView.findViewById(R.id.complain_TXT);
        }




    }
}
