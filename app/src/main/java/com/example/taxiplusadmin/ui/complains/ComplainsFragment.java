package com.example.taxiplusadmin.ui.complains;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taxiplusadmin.R;
import com.example.taxiplusadmin.data.models.car.Car;
import com.example.taxiplusadmin.data.models.car.CarDataSource;
import com.example.taxiplusadmin.ui.cars.CarListAdapter;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;


public class ComplainsFragment extends Fragment {
    private static final String TAG = "Complains";
    ComplainsListAdapter Adapter;
    ArrayList<Complaint> complainsList = new ArrayList<>();
    public ComplainsFragment() {
        //Required Empty constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_complains,container,false);

        initialize(view);
        return view;
    }

    void initialize(View view) {

        ComplainsDataSource.mCollection.get().addOnSuccessListener(S1 -> {
            complainsList = new ArrayList<>();
            for (QueryDocumentSnapshot document : S1) {
                complainsList.add(document.toObject(Complaint.class));
                Log.d(TAG, document.toObject(Car.class).toString());
            }
            Adapter=new ComplainsListAdapter(complainsList);
            RecyclerView recyclerView = view.findViewById(R.id.ComplainRView);
            recyclerView.setAdapter(Adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        });
    }

    }