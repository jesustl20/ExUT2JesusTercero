package com.example.ex_ut2_jesstercero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActividadRelative extends AppCompatActivity {
    TextView texto1;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_relative);

        texto1=findViewById(R.id.titulo);
        resultado=findViewById(R.id.Resultado);
    }
    public void multiplicar2(View view){

        int num1=Integer.parseInt(resultado.getText().toString());
        String resultado1=String.valueOf(num1*2);
        resultado.setText(resultado1);
    }
    public void multiplicar1(View view){

        int num1=Integer.parseInt(resultado.getText().toString());
        String resultado1=String.valueOf(num1*1);
        resultado.setText(resultado1);
    }
    public void dividir2(View view){

        int num1=Integer.parseInt(resultado.getText().toString());
        String resultado1=String.valueOf(num1/2);
        resultado.setText(resultado1);
    }
    public void dividir1(View view){

        int num1=Integer.parseInt(resultado.getText().toString());
        String resultado1=String.valueOf(num1*1);
        resultado.setText(resultado1);
    }
    public void pulsar0(View view){

        resultado.setText("0");
    }
}