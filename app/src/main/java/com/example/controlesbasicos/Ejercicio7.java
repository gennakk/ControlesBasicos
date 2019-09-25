package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Ejercicio7 extends AppCompatActivity {

    private ToggleButton tbtncam1,tbtncam2;

    private TextView tvluz1,tvluz2,tvtemp;

    private Button btnluz1,btnluz2;

    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio7);



        tbtncam1 = findViewById(R.id.tbtncam1);
        tbtncam2 = findViewById(R.id.tbtncam2);

        tvluz1 = findViewById(R.id.tvluz1);
        tvluz2 = findViewById(R.id.tvluz2);
        tvtemp = findViewById(R.id.tvtemp);

        btnluz1 = findViewById(R.id.btnluz1);
        btnluz2 = findViewById(R.id.btnluz2);

        seekBar = findViewById(R.id.seekBar);

        tbtncam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tbtncam1.isChecked()){
                    tbtncam1.setTextOff(getResources().getString(R.string.ej7cam1off));
                }else{
                    tbtncam1.setTextOn(getResources().getString(R.string.ej7cam1on));
                }
            }
        });

        tbtncam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tbtncam2.isChecked()){
                    tbtncam2.setTextOff(getResources().getString(R.string.ej7cam2off));
                }else{
                    tbtncam2.setTextOn(getResources().getString(R.string.ej7cam2on));
                }
            }
        });


        btnluz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(tvluz1.getText().equals(getResources().getString(R.string.ej7luz1offtxt))){

                    tvluz1.setText(getResources().getString(R.string.ej7luz1ontxt));

                    btnluz1.setText(getResources().getString(R.string.ej7btnapa));

                }else{

                    tvluz1.setText(getResources().getString(R.string.ej7luz1offtxt));

                    btnluz1.setText(getResources().getString(R.string.ej7btnenc));
                }
            }
        });

        btnluz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(tvluz2.getText().equals(getResources().getString(R.string.ej7luz2offtxt))){

                    tvluz2.setText(getResources().getString(R.string.ej7luz2ontxt));

                    btnluz2.setText(getResources().getString(R.string.ej7btnapa));

                }else{

                    tvluz2.setText(getResources().getString(R.string.ej7luz2offtxt));

                    btnluz2.setText(getResources().getString(R.string.ej7btnenc));
                }
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvtemp.setText(getResources().getString(R.string.ej7temp)+": "+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
