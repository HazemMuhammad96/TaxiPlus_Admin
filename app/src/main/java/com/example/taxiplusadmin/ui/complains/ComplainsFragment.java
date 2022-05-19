package com.example.taxiplusadmin.ui.complains;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taxiplusadmin.R;

import java.util.ArrayList;


public class ComplainsFragment extends Fragment {
    public ComplainsFragment() {
        super(R.layout.fragment_complains);
    }

    ArrayList <String> name     = new ArrayList<>();
    ArrayList <String> Date     = new ArrayList<>();
    ArrayList <String> Complain = new ArrayList<>();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ini();
        ComplainsListAdapter complainAdapter = new ComplainsListAdapter(name , Date , Complain);
        RecyclerView complainRView = view.findViewById(R.id.ComplainRView);
        complainRView.setAdapter(complainAdapter);

        complainRView.setLayoutManager(new LinearLayoutManager(getContext()));



    }
    void ini ()
    {
        this.name.add("Boshkash");
        this.Date.add("555555555");
        this.Complain.add("Mohab 5awal");
    }
}