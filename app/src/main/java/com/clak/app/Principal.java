package com.clak.app;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class Principal extends AppCompatActivity {
    private Switch sw;
    private Button btnLogin, btnContinuar;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        context = Principal.this;
        //=========[ELEMENTS]================
        //===================================
        sw           = (Switch) findViewById(R.id.switch2);
        btnLogin     = (Button) findViewById(R.id.btnLogin);
        btnContinuar = (Button) findViewById(R.id.btnContinuar);

        //=========[END ELEMENTS]============
        //===================================

        //=========[ACTIONS]=================
        //===================================
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sound);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mp.start();
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(context,Login.class);
                startActivity(intent);
            }
        });
        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(context,Filtros.class);
                startActivity(intent);
            }
        });

        //=========[END ACTIONS]=============
        //===================================
    }
}
