package com.example.ecoapp.Inicioanim;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import android.widget.ImageView;
import android.widget.TextView;

import com.example.ecoapp.Login;
import com.example.ecoapp.R;

public class Anim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anim);

        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.anim_arriba);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.anim_abajo);

        ImageView anim_logo_app = findViewById(R.id.aniInicio);
        TextView anim_login_slogan = findViewById(R.id.login_slogan);
        TextView anim_titulo = findViewById(R.id.logo_inicio);

        anim_logo_app.setAnimation(animation1);
        anim_login_slogan.setAnimation(animation2);
        anim_titulo.setAnimation(animation1);
/* rotacion anim
        RotateAnimation rotateAnimation = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF,
                 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(5000);
        rotateAnimation.setRepeatCount(Animation.INFINITE);

        ConstraintLayout constraintLayout = findViewById(R.id.inicio_Rotacion);
        constraintLayout.startAnimation(rotateAnimation);*/
        new Handler().postDelayed(() -> {
            Intent login = new Intent(Anim.this, Login.class);
            startActivity(login);
        }, 2000);


    }
}