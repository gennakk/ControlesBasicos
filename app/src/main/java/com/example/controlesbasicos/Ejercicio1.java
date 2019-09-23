package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio1 extends AppCompatActivity {
    private EditText ednum1;
    private EditText ednum2;

    private Button boton;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        ednum1 = findViewById(R.id.editText);
        ednum2 = findViewById(R.id.editText2);

        boton = findViewById(R.id.btnSum);

        textView = findViewById(R.id.textView3);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double numero1 = Double.parseDouble(ednum1.getText().toString());
                Double numero2 = Double.parseDouble(ednum2.getText().toString());

                Double suma = numero1+numero2;

                textView.setText(textView.getText().toString()+" "+suma.toString());

            }
        });
    }
}
