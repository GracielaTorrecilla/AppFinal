package com.example.appfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CuentaActivity extends AppCompatActivity {

    private Button boton0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta);
        configureButton();
    }

    private void configureButton(){

        boton0 = findViewById(R.id.button2);
        boton0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CuentaActivity.this, ConfirmarActivity.class));
            }
        });
    }
}
