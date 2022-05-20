package com.example.taxiplusadmin.ui.complains;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.taxiplusadmin.R;

public class ComplainView extends Fragment {
    public ComplainView() {
        super(R.layout.view_complain);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Complaint complain = (Complaint) getArguments().getSerializable("complain");
        if(complain!=null)
        {   TextView customer_TXT , complain_TXT ,date_TXT, tripInfo_TXT;
            customer_TXT = view.findViewById(R.id.customer);
            complain_TXT=view.findViewById(R.id.complain);
            date_TXT=view.findViewById(R.id.date);
            tripInfo_TXT=view.findViewById(R.id.trip);
            customer_TXT.setText(complain.getName());
            complain_TXT.setText(complain.getComplain());
            date_TXT.setText(complain.getDate());
            tripInfo_TXT.setText(complain.getTripInfo());
        }
    }
}
