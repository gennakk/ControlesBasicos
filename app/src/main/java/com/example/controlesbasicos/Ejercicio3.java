package com.example.controlesbasicos;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Ejercicio3 extends AppCompatActivity {

    private Button btnEncender;
    private Button btnApagar;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        layout = findViewById(R.id.layout);

        btnEncender = findViewById(R.id.btnEncender);
        btnApagar =findViewById(R.id.btnApagar);

        btnEncender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(Color.RED);
            }
        });

        btnApagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(Color.BLUE);
            }
        });
    }
}
