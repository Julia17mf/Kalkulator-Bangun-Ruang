package com.example.kalkulatorbangunruang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Balok extends AppCompatActivity {
    private Button btnHasil;
    private TextView tvHasil;
    private EditText etPanjang, etLebar, etTinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        btnHasil    = findViewById(R.id.btn_hasil);
        tvHasil     = findViewById(R.id.tv_hasil);
        etPanjang   = findViewById(R.id.et_panjang);
        etLebar     = findViewById(R.id.et_lebar);
        etTinggi    = findViewById(R.id.et_tinggi);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sPanjang = etPanjang.getText().toString();
                    String sLebar = etLebar.getText().toString();
                    String sTinggi = etTinggi.getText().toString();

                    double panjang = Double.parseDouble(sPanjang);
                    double lebar = Double.parseDouble(sLebar);
                    double tinggi = Double.parseDouble(sTinggi);

                    double hasil = panjang * lebar * tinggi;

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}