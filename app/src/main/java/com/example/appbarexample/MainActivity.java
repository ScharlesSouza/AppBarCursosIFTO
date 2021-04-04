package com.example.appbarexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.meu_toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("IFTO");
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
        switch (item.getItemId()){
            case R.id.agronegocio:
                intent = new Intent(getApplicationContext(),AgronegocioActivity.class);
                startActivity(intent);
               return true;
            case R.id.edFisica:
                intent = new Intent(getApplicationContext(),EdFisicaActivity.class);
                startActivity(intent);
                return true;
            case R.id.engenhariaCivil:
                intent = new Intent(getApplicationContext(),EngenhariaCivilActivity.class);
                startActivity(intent);
                return true;
            case R.id.Fisica:
                intent = new Intent(getApplicationContext(),FisicaActivity.class);
                startActivity(intent);
                return true;
            case R.id.letras:
                intent = new Intent(getApplicationContext(),LetrasActivity.class);
                startActivity(intent);
                return true;
            case R.id.sistemas:
                intent = new Intent(getApplicationContext(),SistemasActivity.class);
                startActivity(intent);
                return true;
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}