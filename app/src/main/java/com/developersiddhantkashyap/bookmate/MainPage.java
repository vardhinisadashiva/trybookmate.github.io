package com.developersiddhantkashyap.bookmate;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

public class MainPage extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

       // Toolbar toolbar = findViewById(R.id.toolBar);
      //  setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer);
        navigationView =findViewById(R.id.nav_view);
       // toggle =new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);

        drawerLayout.addDrawerListener(toggle);
      //  toggle.setDrawerIndicatorEnabled(true);
      //  toggle.syncState();



    }
}