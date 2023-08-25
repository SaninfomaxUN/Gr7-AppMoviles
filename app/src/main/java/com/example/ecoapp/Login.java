package com.example.ecoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Agregar animaciones
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.anim_arriba);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.anim_abajo);

        ImageView anim_logo_app = findViewById(R.id.login_logo_app);
        Button animbtn_ingresar = findViewById(R.id.login_btn_ingresar);
        TextView anim_titulo = findViewById(R.id.login_titulo);
        TextView anim_slogan = findViewById(R.id.login_slogan);
        TextView anim_registrate_link = findViewById(R.id.login_registrate_link);
        TextView anim_otros_medios = findViewById(R.id.login_otros_medios);
        LinearLayout linearLayout = findViewById(R.id.barner_f_g);

        anim_logo_app.setAnimation(animation2);
        animbtn_ingresar.setAnimation(animation2);
        anim_titulo.setAnimation(animation2);
        anim_slogan.setAnimation(animation1);
        anim_registrate_link.setAnimation(animation1);
        anim_otros_medios.setAnimation(animation1);
        linearLayout.setAnimation(animation2);

        inicializarLinkRegistro();

        inicializarBtnIngresar();

        button = findViewById(R.id.login_btn_ingresar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Login.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, android.R.anim.fade_out);
            }
        });

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