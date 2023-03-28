package com.example.trabajopractico2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.trabajopractico2.models.Inmueble;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Inmueble> lista = new ArrayList<>() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListView();
    }

    public void generarListView(){
        ArrayAdapter<Inmueble> adapter = new ListaAdapter(this,R.layout.item,lista,getLayoutInflater());
        ListView lv = findViewById(R.id.miLista);
        lv.setAdapter(adapter);
    }

    public void cargarDatos(){
        lista.add(new Inmueble(R.drawable.case1,"Av. Siempre viva 123",80000));
        lista.add(new Inmueble(R.drawable.case2,"Potrerillo 34",50000));
        lista.add(new Inmueble(R.drawable.case3,"El Trapiche",90000));
    }
}