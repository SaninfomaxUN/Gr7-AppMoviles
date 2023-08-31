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

        inicializarLinkRegistro();

        inicializarBtnIngresar();

    }

    private void inicializarLinkRegistro() {
        TextView registrate_link = findViewById(R.id.login_registrate_link);
        registrate_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Dirigir a la pantalla de registro.
                Intent intent = new Intent(Login.this, Registro.class);
                startActivity(intent);
            }
        });
    }

    private void inicializarBtnIngresar() {
        Button btn_ingresar = findViewById(R.id.login_btn_ingresar);
        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Dirigir a la pantalla de registro.
                /*Intent intent = new Intent(Login.this, *.class);
                startActivity(intent);*/
            }
        });
    }


}