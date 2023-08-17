package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nro1, nro2;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nro1 = (EditText) findViewById(R.id.editTextNro1);
        nro2 = (EditText) findViewById(R.id.editTextNro2);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarTelaResultado();

            }
        });
    }

    public void mostrarTelaResultado(){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("nro1", nro1.getText().toString());
        intent.putExtra("nro2", nro2.getText().toString());
        startActivity(intent);

    }
}