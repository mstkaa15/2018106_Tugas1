package com.example.a2018106_tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class segitiga extends AppCompatActivity {
            EditText input_alas;
    EditText input_tinggi;
            TextView output_hasil;
            Button hasil;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_segitiga);
                input_tinggi = findViewById(R.id.input_tinggi);
                input_alas = findViewById(R.id.input_alas);
                hasil = findViewById(R.id.btn_hasil);
                output_hasil = findViewById(R.id.output_hasil);
                hasil.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        if(input_alas.length()==0 || input_tinggi.length()==0){
                            Toast.makeText(getApplication(),"Alas dan Tinggi tidak boleh kosong",Toast.LENGTH_LONG).show();
                        } else {
                            double alas = Double.parseDouble(input_alas.getText().toString());
                            double tinggi = Double.parseDouble(input_tinggi.getText().toString());
                            double hasil = LuasSegitiga(alas,tinggi);
                            String output = String.valueOf(hasil);
                            output_hasil.setText(output);
                        }
                    }
                });
            }
            public double LuasSegitiga(double input_alas, double input_tinggi){
                return input_alas*input_tinggi/2;
            }
        }
