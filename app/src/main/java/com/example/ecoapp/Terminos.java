package com.example.ecoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Terminos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminos);

        regresar();
    }


    //Metodo para regresar

    public void regresar(){
        ImageButton btnRegresar = findViewById(R.id.terminos_btn_regresar);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Cerrar la actividad actual y regresar a la actividad anterior
                finish();
            }
        });
    }
}