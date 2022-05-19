package com.example.taxiplusadmin.ui.complains;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taxiplusadmin.Complaint;
import com.example.taxiplusadmin.R;

import java.util.ArrayList;


public class ComplainsFragment extends Fragment {
    ComplainsListAdapter Adapter;
    ArrayList<Complaint> complainsList = new ArrayList<>();
    public ComplainsFragment() {
        //Required Empty constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_complains,container,false);
        initialize();
        Adapter=new ComplainsListAdapter(complainsList);
        RecyclerView recyclerView = view.findViewById(R.id.ComplainRView);
        recyclerView.setAdapter(Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        return view;
    }

    void initialize() {
        complainsList.add(new Complaint(30 , "Wael 5awl" , "1/1/2000" , 10 , "Mohab"));
        complainsList.add(new Complaint(20 , "Wael 5awl" , "1/1/2000" , 10 , "Mohab"));
        complainsList.add(new Complaint(10 , "Wael 5awl" , "1/1/2000" , 10 , "Mohab"));
//        this.name.add("Boshkash");
//        this.Date.add("4532123");
//        this.Complain.add("Wael aboh zabet");
    }
}