package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Ejercicio5 extends AppCompatActivity {

    private Button btnGoogle,btnYahoo,btnBing;

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio5);


        btnGoogle = findViewById(R.id.btnGoogle);
        btnYahoo = findViewById(R.id.btnYahoo);
        btnBing = findViewById(R.id.btnBing);

        imageView = findViewById(R.id.imageView);

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.google);
            }
        });

        btnYahoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.yahoo);
            }
        });

        btnBing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.bing);
            }
        });

    }
}
