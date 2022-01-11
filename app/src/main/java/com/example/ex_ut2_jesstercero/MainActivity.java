package com.example.ex_ut2_jesstercero;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.activity_main,menu);
        return true;


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Intent i =new Intent(this,ActividadRelative.class);
                startActivity(i);
                break;
            case R.id.item2:
                Toast.makeText(this, "Aplicación almacén de coches", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Intent i2=new Intent(this,BaseDeDatos.class);
                startActivity(i2);
                break;

        }


        return super.onOptionsItemSelected(item);

    }
    public void actividadRelativa(View view){
        Intent i=new Intent(this,ActividadRelative.class);
        startActivity(i);
    }
    public void actividadBase(View view){
        Intent i =new Intent(this,BaseDeDatos.class);
        startActivity(i);
    }
    public void mensajeToast(View view){
        Toast.makeText(this, "Aplicación almacén de coches", Toast.LENGTH_SHORT).show();
    }
}