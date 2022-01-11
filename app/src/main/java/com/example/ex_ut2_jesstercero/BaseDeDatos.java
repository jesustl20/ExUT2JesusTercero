package com.example.ex_ut2_jesstercero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class BaseDeDatos extends AppCompatActivity {
    EditText modelo,brand,cv;
    SQLiteDatabase db;
    HelperBBDD helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_de_datos);
        modelo=findViewById(R.id.editTextTextModelo);
        brand=findViewById(R.id.editTextTextMarca);
        cv=findViewById(R.id.editTextTextCv);
        helper=new HelperBBDD(this);
    }
    public void insertarRegistro(View view) {

        if ((modelo.getText().toString().isEmpty())||(brand.getText().toString().isEmpty())
                ||(cv.getText().toString().isEmpty())){
            Toast.makeText(this,"No se han rellenado todos los campos",Toast.LENGTH_SHORT).show();
            return;
        }else{
            db=helper.getWritableDatabase();
            ContentValues values=new ContentValues();
            values.put("modelo",modelo.getText().toString());
            values.put("marca",brand.getText().toString());
            values.put("cv",cv.getText().toString());
            db.insert("tbCoches",null,values);

            Toast.makeText(this, "Registro Insertado", Toast.LENGTH_SHORT).show();

            modelo.setText("");
            brand.setText("");
            cv.setText("");
            db.close();
        }
}
    }