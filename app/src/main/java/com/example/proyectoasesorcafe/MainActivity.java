package com.example.proyectoasesorcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NAMES = "com.example.proyectoasesorcafes";
    public static final String EXTRA_DATA = "com.example.proyectoasesorcafe";

    Spinner spinner;
    String[] tipos = {"Arábica (Coffea Arábica)",
            "Robusta (Coffea Canephora)",
            "Libérica (Coffea Libérica)",
            "Excelsa (Coffea Excelsa)"};
    Content contenido = new Content();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,
                tipos);

        spinner.setAdapter(adapter);
    }

    public void onClickCafes(View view) {

        String seleccion = spinner.getSelectedItem().toString();

        if (seleccion.equals("Arábica (Coffea Arábica)")) {
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            i.putExtra(EXTRA_NAMES, tipos[0]);
            i.putExtra(EXTRA_DATA, contenido.tiposCafes(0));
            startActivity(i);
        } else if (seleccion.equals("Robusta (Coffea Canephora)")) {
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            i.putExtra(EXTRA_NAMES, tipos[1]);
            i.putExtra(EXTRA_DATA, contenido.tiposCafes(1));
            startActivity(i);
        } else if (seleccion.equals("Libérica (Coffea Libérica)")) {
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            i.putExtra(EXTRA_NAMES, tipos[2]);
            i.putExtra(EXTRA_DATA, contenido.tiposCafes(2));
            startActivity(i);
        } else if (seleccion.equals("Excelsa (Coffea Excelsa)")) {
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            i.putExtra(EXTRA_NAMES, tipos[3]);
            i.putExtra(EXTRA_DATA, contenido.tiposCafes(3));
            startActivity(i);
        }

    }
}