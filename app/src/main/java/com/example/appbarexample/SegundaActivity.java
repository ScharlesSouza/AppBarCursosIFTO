package com.example.appbarexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView tvDisp;
    String dado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);



        Intent intent = getIntent();
        if(intent != null){
            dado = intent.getStringExtra("disp");
            tvDisp = findViewById(R.id.textViewDisp);
            tvDisp.setText("Disciplina:  "+dado);
        }

    }//onCreate



}//class