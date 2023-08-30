package com.example.ecoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inicializarLinkRegistro();

        inicializarBtnIngresar();

        inicializarBtnFacebook();
        inicializarBtnGoogle();
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

    private void inicializarBtnFacebook() {
        ImageButton btn_facebook = findViewById(R.id.login_btn_fb);
        btn_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openFacebookPage(v);
            }
        });
    }


    private void inicializarBtnGoogle() {
        ImageButton btn_google = findViewById(R.id.login_btn_google);
        btn_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGooglePage(v);
            }
        });
    }
    // Método para abrir la página de Facebook
    public void openFacebookPage(View view) {
        // Define la URL de la página de Facebook
        String url = "https://es-la.facebook.com/";

        // Crea un intent para abrir el navegador con la URL
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    // Método para abrir el enlace
    public void openGooglePage(View view) {
        // Define la URL que deseas abrir en el navegador
        String url = "https://accounts.google.com/InteractiveLogin/identifier?hl=es&ifkv=AXo7B7WgrGIPWGXKlQtdTcKa3wE2xb9wKJZ5kgFdc-cqHSKmj0Qb1oDyy1HCM2NyHLQZJNFxac_rCg&flowName=GlifWebSignIn&flowEntry=ServiceLogin";

        // Crea un intent para abrir el navegador con la URL
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}