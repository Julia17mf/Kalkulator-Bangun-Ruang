package com.example.kalkulatorbangunruang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    private Button btnBalok, btnBola, btnTabung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        btnBalok    = findViewById(R.id.btn_balok);
        btnBola     = findViewById(R.id.btn_bola);
        btnTabung   = findViewById(R.id.btn_tabung);

        btnBalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBalok();
            }
        });

        btnBola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBola();
            }
        });

        btnTabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTabung();
            }
        });
    }

    public void openBalok() {
        Intent intentBalok   = new Intent(this, Balok.class);
        startActivity(intentBalok);
    }

    public void openBola() {
        Intent intentBola    = new Intent(this, Bola.class);
        startActivity(intentBola);
    }

    public void openTabung() {
        Intent intentTabung  = new Intent(this, Tabung.class);
        startActivity(intentTabung);
    }
}