package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.transform.Templates;

public class Ejercicio4 extends AppCompatActivity {

    private EditText edDNI,edLetra;
    private Button btnValidar;
    private TextView tvValidar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);

        edDNI = findViewById(R.id.edDNI);
        edLetra = findViewById(R.id.edLetra);

        tvValidar = findViewById(R.id.tvValidar);

        btnValidar = findViewById(R.id.btnValidar);

        btnValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String dni = edDNI.getText().toString()+edLetra.getText().toString();

                ValidadorDNI validador = new ValidadorDNI(dni);

                if(validador.validar())
                    tvValidar.setText("DNI válido");
                else
                    tvValidar.setText("DNI no es válido");

            }
        });


    }


}
