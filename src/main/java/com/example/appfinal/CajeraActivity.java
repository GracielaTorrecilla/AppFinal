package com.example.appfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CajeraActivity extends AppCompatActivity {
    private Button boton5;
    private Button boton6;
    private Button boton7;
    private Button boton8;
    private Button boton9;
    private Button boton10;
    private Button boton11;
    private Button boton12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cajera);
        configureButton();
    }
    private void configureButton(){

        boton5 = findViewById(R.id.imageButton5);
        boton5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(CajeraActivity.this, CuentaActivity.class));
            }

        });
        boton6 = findViewById(R.id.imageButton6);
        boton6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(CajeraActivity.this, CuentaActivity.class));
            }

        });
        boton7 = findViewById(R.id.imageButton7);
        boton7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(CajeraActivity.this, CuentaActivity.class));
            }

        });
        boton8 = findViewById(R.id.imageButton8);
        boton8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(CajeraActivity.this, CuentaActivity.class));
            }

        });
        boton9 = findViewById(R.id.imageButton9);
        boton9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(CajeraActivity.this, CuentaActivity.class));
            }

        });
        boton10 = findViewById(R.id.imageButton10);
        boton10.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(CajeraActivity.this, CuentaActivity.class));
            }

        });
        boton11 = findViewById(R.id.imageButton11);
        boton11.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(CajeraActivity.this, CuentaActivity.class));
            }

        });
        boton12 = findViewById(R.id.imageButton12);
        boton12.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(CajeraActivity.this, CuentaActivity.class));
            }

        });
    }
}
