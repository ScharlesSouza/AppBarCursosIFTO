package com.example.appbarexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SistemasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistemas);
    }

    public void clique(View view) {

            Intent intentCafe = new Intent(getApplicationContext(), DisciplinasActivity.class);
           startActivity(intentCafe);

    }
}