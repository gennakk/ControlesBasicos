package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Ejercicio5 extends AppCompatActivity implements View.OnClickListener {

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


        btnBing.setOnClickListener(this);

    }

    public void cambiarImagenYahoo(View v){
        imageView.setImageResource(R.drawable.yahoo);
    }

    @Override
    public void onClick(View v) {
        imageView.setImageResource(R.drawable.bing);
    }
}
