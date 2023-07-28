package com.example.ecoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Obtener el textview registrate_link y redirigir a la pantalla de registro.
        TextView registrate_link = findViewById(R.id.login_registrate_link);
        registrate_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActividadRegistro(v);
            }
        });



        //Obtenemos el boton de ingresar y le asignamos un listener para que al hacer click
        Button btn_ingresar = findViewById(R.id.login_btn_ingresar);
        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*abrirActividadRegistro(v);*/
            }
        });



    }

    //Metodo para dirigir a la pantalla de registro.
    public void abrirActividadRegistro(View view){
        Intent intent = new Intent(this, Registro.class);
        startActivity(intent);
    }
}