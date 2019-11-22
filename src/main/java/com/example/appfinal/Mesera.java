package com.example.appfinal;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;



public class Mesera extends AppCompatActivity {

    private ListView listview;
    private ArrayList<String> names;

    private ListView listview1;
    private ArrayList<String> names1;

    private ListView listview2;
    private ArrayList<String> names2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesera);

        listview =  findViewById(R.id.platos);

        names = new ArrayList<String>();
        names.add("Carne asada");
        names.add("Cerdo a la plancha");
        names.add("Pechuga a la plancha");
        names.add("Bandeja con pollo");
        names.add("Sobrebarriga al gusto");
        names.add("Pechuga gratinada");
        names.add("Costillas BBQ");
        names.add("Chuleta valluna");
        names.add("Churrasco");
        names.add("Mojarra frita");
        names.add("Pollo cordon Bleu");
        names.add("Bagre al gusto");

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        listview.setAdapter(adapter3);

        listview1 =  findViewById(R.id.bebidas);

        names1 = new ArrayList<String>();
        names1.add("Limonada");
        names1.add("Hit lulo");
        names1.add("Hit mora");
        names1.add("Hit mango");
        names1.add("Hit tropical");
        names1.add("Pepsi");
        names1.add("Manzana postobon");
        names1.add("Naranja postobon");
        names1.add("Colombiana");
        names1.add("Seven up");
        names1.add("Mountain dew");
        names1.add("coca cola");

        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names1);
        listview1.setAdapter(adapter4);

        listview2 =  findViewById(R.id.porciones);

        names2 = new ArrayList<String>();
        names2.add("Huevo");
        names2.add("Arroz");
        names2.add("Platano");
        names2.add("Aguacate");
        names2.add("Papa francesa");

        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names2);
        listview2.setAdapter(adapter5);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(Mesera.this, "Has pulsado: "+ names.get(position), Toast.LENGTH_LONG).show();
            }
        });

        listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(Mesera.this, "Has pulsado: "+ names1.get(position), Toast.LENGTH_LONG).show();
            }
        });

        listview2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(Mesera.this, "Has pulsado: "+ names2.get(position), Toast.LENGTH_LONG).show();
            }
        });


    }

}

