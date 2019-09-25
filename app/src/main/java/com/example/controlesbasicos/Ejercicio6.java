package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class Ejercicio6 extends AppCompatActivity {

    private Switch swcam1,swluz1;

    private ToggleButton btncam2,btnluz2;

    private ImageView ivcam1,ivluz1,ivcam2,ivluz2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio6);

        swcam1 = findViewById(R.id.swcam1);
        swluz1 = findViewById(R.id.swluz1);

        btncam2 = findViewById(R.id.btncam2);
        btnluz2 = findViewById(R.id.btnluz2);

        ivcam1 = findViewById(R.id.ivcam1);
        ivluz1 = findViewById(R.id.ivluz1);
        ivcam2 = findViewById(R.id.ivcam2);
        ivluz2 = findViewById(R.id.ivluz2);

        swcam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (swcam1.isChecked()){
                    ivcam1.setVisibility(View.VISIBLE);
                }else{
                    ivcam1.setVisibility(View.INVISIBLE);
                }

            }
        });

        swluz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (swluz1.isChecked()){
                    ivluz1.setImageResource(R.drawable.bnbencendida);
                }else{
                    ivluz1.setImageResource(R.drawable.bnbapagada);
                }

            }
        });

        btncam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btncam2.isChecked()){
                    ivcam2.setVisibility(View.VISIBLE);
                }else{
                    ivcam2.setVisibility(View.INVISIBLE);
                }

            }
        });

        btnluz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btnluz2.isChecked()){
                    ivluz2.setImageResource(R.drawable.bnbencendida);
                }else{
                    ivluz2.setImageResource(R.drawable.bnbapagada);
                }

            }
        });


    }
}
