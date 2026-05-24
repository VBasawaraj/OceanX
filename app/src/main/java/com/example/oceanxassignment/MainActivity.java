package com.example.oceanxassignment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNav = findViewById(R.id.bottomNav);

        loadFragment(new OrdersFragment());

        bottomNav.setOnItemSelectedListener(item -> {

            if(item.getItemId() == R.id.home){
                loadFragment(new HomeFragment());
            }
            else if(item.getItemId() == R.id.orders){
                loadFragment(new OrdersFragment());
            }
            else if(item.getItemId() == R.id.payments){
                loadFragment(new PaymentsFragment());
            }
            else if(item.getItemId() == R.id.account){
                loadFragment(new AccountFragment());
            }

            return true;
        });
    }

    private void loadFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_container, fragment)
                .commit();
    }
}