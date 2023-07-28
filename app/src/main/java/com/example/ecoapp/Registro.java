package com.example.ecoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        cargarCiudadesSpinner();

        inicializarTerminos();

        inicializarBtnGuardar();
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


    private void inicializarBtnGuardar() {
        //Obtener el boton de guardar y le asignamos un listener para que al hacer click nos dirija a la pantalla de login.
        Button btn_guardar = findViewById(R.id.registro_btn_guardar);
        btn_guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cerrar la actividad actual y regresar a la actividad anterior
                finish();
            }
        });
    }


    //Metodo para obtener el texto de los terminos y redirigir
    public void inicializarTerminos(){
        TextView terminos = findViewById(R.id.registro_terminos);
        terminos.setMovementMethod(LinkMovementMethod.getInstance());

        // Obtener el texto del CheckBox
        String text = getResources().getString(R.string.registro_terminos);

        // Crear un SpannableString para modificar el CheckBox
        SpannableString spannableString = new SpannableString(text);

        // Definir el enlace y su comportamiento al hacer clic
        ClickableSpan link1ClickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                // Acciones a realizar cuando se hace clic en el enlace 1
                Intent intent = new Intent(Registro.this, Terminos.class);
                startActivity(intent);
            }
        };
        spannableString.setSpan(link1ClickableSpan, text.indexOf("Términos y Condiciones"), text.indexOf("Términos y Condiciones") + "Términos y Condiciones".length(), 0);
        // Aplicar el SpannableString al TextView
        terminos.setText(spannableString);

    }


}