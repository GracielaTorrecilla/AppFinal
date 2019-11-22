package com.example.appfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private Button boton;
    private Button boton1;
    private Button boton2;
    private Button boton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureButton();


    }
    private void configureButton(){

        boton = findViewById(R.id.imageButton);
        boton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, Mesas.class));
            }

        });
        boton1 = findViewById(R.id.imageButton2);
        boton1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, CocinaActivity.class));
            }

        });
        boton2 = findViewById(R.id.imageButton3);
        boton2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, CajeraActivity.class));
            }

        });
        boton3 = findViewById(R.id.imageButton4);
        boton3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, AdminActivity.class));
            }

        });
    }
}
