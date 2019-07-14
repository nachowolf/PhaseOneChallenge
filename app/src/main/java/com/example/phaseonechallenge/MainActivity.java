package com.example.phaseonechallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("ALC Phase 1");
    }

    public void myProfileButton(View v){
        Intent myIntent = new Intent(getBaseContext(), myProfile.class);
        startActivity(myIntent);
    }

    public void andelaSite(View v){
        Intent myIntent = new Intent(getBaseContext(), andelaWeb.class);
        startActivity(myIntent);
    }
}
