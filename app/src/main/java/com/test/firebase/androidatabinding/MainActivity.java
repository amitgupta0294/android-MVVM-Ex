package com.test.firebase.androidatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.test.firebase.androidatabinding.databinding.ActivityMainBinding;
import com.test.firebase.androidatabinding.model.Profile;
import com.test.firebase.androidatabinding.view.MainActivityAdapter;
import com.test.firebase.androidatabinding.viewmodel.MainActivityViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MainActivityViewModel mainActivityViewModel;
    ActivityMainBinding activityMainBinding;
    MainActivityAdapter mainActivityAdapter;

    ArrayList<Profile> profiles;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mainActivityViewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);
        mainActivityViewModel.init();

        recyclerView = findViewById(R.id.recycler_profiles);

        mainActivityViewModel.getData().observe(this, new Observer<ArrayList<Profile>>() {
            @Override
            public void onChanged(ArrayList<Profile> profiles) {
                setUpRecyclerView(profiles);
            }
        });
    }

    private void setUpRecyclerView(ArrayList<Profile> profile) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        mainActivityAdapter = new MainActivityAdapter(this, profile);
        recyclerView.setAdapter(mainActivityAdapter);
    }
}
