package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView resultado;
    Float fltNro1, fltNro2, fltResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultado = (TextView) findViewById(R.id.textViewResult);

        Intent intent = getIntent();
        fltNro1 = Float.parseFloat(intent.getStringExtra("nro1"));
        fltNro2 = Float.parseFloat(intent.getStringExtra("nro2"));
        fltResult = fltNro1 + fltNro2;

        resultado.setText("SOMA = " + fltResult.toString());


    }
}