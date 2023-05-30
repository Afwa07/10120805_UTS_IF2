package com.example.TugasUTS10120805;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.tugasuts.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    private BottomNavigationView bottomNavigationView;
    private ProfileFragment profileFragment = new ProfileFragment();
    private NotesFragment notesFragment = new NotesFragment();
    private InfoFragment infoFragment = new InfoFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView= findViewById(R.id.bottomview);
        bottomNavigationView.setOnItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.profile);
        bottomNavigationView.setSelectedItemId(R.id.info);
        bottomNavigationView.setSelectedItemId(R.id.notes);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, profileFragment).commit();
            return true;
            case R.id.notes:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, notesFragment).commit();
            return true;
            case R.id.info:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, infoFragment).commit();
                return true;
        }
        return false;
    }

}