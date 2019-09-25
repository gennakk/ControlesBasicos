package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnej1 ;
    private Button btnej2 ;
    private Button btnej3 ;
    private Button btnej4 ;
    private Button btnej5 ;
    private Button btnej6 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnej1 = findViewById(R.id.buttonej1);


        btnej1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Ejercicio1.class);

                startActivity(intent);

            }
        });


        btnej2 = findViewById(R.id.buttonej2);


        btnej2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Ejercicio2.class);

                startActivity(intent);

            }
        });

        btnej3 = findViewById(R.id.buttonej3);


        btnej3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Ejercicio3.class);

                startActivity(intent);

            }
        });

        btnej4 = findViewById(R.id.buttonej4);


        btnej4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Ejercicio4.class);

                startActivity(intent);

            }
        });

        btnej5 = findViewById(R.id.buttonej5);


        btnej5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Ejercicio5.class);

                startActivity(intent);

            }
        });

        btnej6 = findViewById(R.id.buttonej6);


        btnej6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Ejercicio6.class);

                startActivity(intent);

            }
        });

    }


}
