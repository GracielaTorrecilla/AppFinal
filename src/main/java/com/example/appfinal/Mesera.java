package com.example.appfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Mesera extends AppCompatActivity {
    Spinner spinner =  findViewById(R.id.spinner);
    String[] letra = {"A","B","C","D","E"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesera);
        spinner.setAdapter(new ArrayAdapter(this, android.R.layout.simple_spinner_item, letra));
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id)
            {
                Toast.makeText(adapterView.getContext(),
                        (String) adapterView.getItemAtPosition(pos), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {    }
        });
    }
}
