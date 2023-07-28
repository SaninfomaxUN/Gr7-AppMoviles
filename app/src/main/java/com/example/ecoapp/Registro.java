package com.example.ecoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.Arrays;
import java.util.List;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        cargarCiudadesSpinner();

        //Obtener el boton de guardar y le asignamos un listener para que al hacer click nos dirija a la pantalla de login.
        Button btn_guardar = findViewById(R.id.registro_btn_guardar);
        btn_guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActividadLogin(v);
            }
        });
    }


    //Metodo para dirigir a la pantalla de Login.
    public void abrirActividadLogin(View view){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    //Metodo para cargar las ciudades en el spinner.
    public void cargarCiudadesSpinner(){
        List<String> ciudadesColombia = Arrays.asList("Selecciona tu Ciudad",
                "Bogotá", "Medellín", "Cali", "Barranquilla", "Cartagena", "Bucaramanga", "Santa Marta", "Cúcuta", "Pasto",
                "Pereira", "Manizales", "Ibagué", "Neiva", "Popayán", "Valledupar", "Villavicencio", "Sincelejo", "Armenia", "Tunja", "Quibdó"
        );

        Spinner spinner_ciudad = findViewById(R.id.registro_spinner_ciudad);

        // Crear el ArrayAdapter
        ArrayAdapter<String> adaptadorCiudades = new ArrayAdapter<>(
                this,
                R.layout.spinner_list,
                ciudadesColombia);

        // Especificar el diseño para mostrar las opciones al desplegar el spinner
        adaptadorCiudades.setDropDownViewResource(R.layout.spinner_list);

        // Asignar el adaptador al spinner
        spinner_ciudad.setAdapter(adaptadorCiudades);


    }


}