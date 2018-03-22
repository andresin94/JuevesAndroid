package com.example.usuario.juevesandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.altaButton).setOnClickListener(this);
        findViewById(R.id.verDatosButton).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=null;

        switch(v.getId()) {
            case R.id.altaButton:
                intent=new Intent(this, Formulario.class);
                break;

            case R.id.verDatosButton:
                intent = new Intent (this, Mostrar.class);
                break;
        }
        startActivity(intent);
    }
}
