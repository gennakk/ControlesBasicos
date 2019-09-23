package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio2 extends AppCompatActivity {

    private Button btnSum,btnRes,btnMult,btnDiv;

    private EditText ednum1;
    private EditText ednum2;

    private Button boton;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        ednum1 = findViewById(R.id.editText);
        ednum2 = findViewById(R.id.editText2);

        textView = findViewById(R.id.textView3);

        btnSum = findViewById(R.id.btnSum);
        btnRes = findViewById(R.id.btnRes);
        btnMult = findViewById(R.id.btnMult);
        btnDiv = findViewById(R.id.btnDiv);


        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double[] numeros = obtenerNumeros();

                Double suma = numeros[0]+numeros[1];

                textView.setText("Resultado "+suma.toString());

            }
        });

        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double[] numeros = obtenerNumeros();

                Double suma = numeros[0]-numeros[1];

                textView.setText("Resultado "+suma.toString());

            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double[] numeros = obtenerNumeros();

                Double suma = numeros[0]*numeros[1];

                textView.setText("Resultado "+suma.toString());

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double[] numeros = obtenerNumeros();
                try {
                    Double suma = numeros[0] / numeros[1];

                    textView.setText("Resultado "+suma.toString());
                }catch (ArithmeticException e){
                    textView.setText("Resultado  División entre 0");
                }



            }
        });

    }


    private Double[] obtenerNumeros(){

        double numero1 = Double.parseDouble(ednum1.getText().toString());
        double numero2 = Double.parseDouble(ednum2.getText().toString());

        Double [] array = {numero1,numero2};
        return array ;
    }
}
