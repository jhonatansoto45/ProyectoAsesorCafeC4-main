package com.example.proyectoasesorcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public static final String EXTRA_NAMES = "com.example.proyectoasesorcafes";
    public static final String EXTRA_DATA = "com.example.proyectoasesorcafe";

    TextView textViewTitle, textViewContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        String name = i.getStringExtra(EXTRA_NAMES);
        String data = i.getStringExtra(EXTRA_DATA);

        textViewTitle = (TextView) findViewById(R.id.textViewTitle);
        textViewContent = (TextView) findViewById(R.id.textViewContent);

        textViewTitle.setText(name);
        textViewContent.setText(data);

    }
}