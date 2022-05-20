package com.example.taxiplusadmin;

import android.os.Bundle;
import android.view.Menu;

import com.example.taxiplusadmin.data.models.car.Car;
import com.example.taxiplusadmin.data.models.car.CarDataSource;
import com.example.taxiplusadmin.data.models.user.Driver;
import com.example.taxiplusadmin.data.models.user.DriverDataSource;
import com.example.taxiplusadmin.ui.complains.ComplainsDataSource;
import com.example.taxiplusadmin.ui.complains.Complaint;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.taxiplusadmin.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_drivers, R.id.nav_cars, R.id.nav_drivers_requests, R.id.nav_complains)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
  // CarDataSource car = new CarDataSource();
        //ComplainsDataSource complain = new ComplainsDataSource();
        //complain.addComplain(new Complaint("Wael a" , "1/1/2000" , "Mohab" , "Wael b " , "re7la sa3eda"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}