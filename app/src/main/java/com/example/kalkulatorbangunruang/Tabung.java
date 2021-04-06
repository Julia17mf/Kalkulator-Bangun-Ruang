package com.example.kalkulatorbangunruang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Tabung extends AppCompatActivity {
    private Button btnHasil;
    private TextView tvHasil;
    private EditText etJari, etTinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        btnHasil    = findViewById(R.id.btn_hasil);
        tvHasil     = findViewById(R.id.tv_hasil);
        etJari      = findViewById(R.id.et_jari);
        etTinggi    = findViewById(R.id.et_tinggi);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sJari = etJari.getText().toString();
                    String sTinggi  = etTinggi.getText().toString();

                    double jari   = Double.parseDouble(sJari);
                    double tinggi = Double.parseDouble(sTinggi);

                    double hasil = 2*22*jari*jari*tinggi/7.0;

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}