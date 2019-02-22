package com.example.enes.sozlugum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class IngSozluk extends AppCompatActivity  {

     ListView kelimeleriGosteren;
    static ArrayList<Object> kelimeler;
     ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ing_sozluk);
        kelimeleriGosteren = findViewById(R.id.listview);
        kelimeler = new ArrayList<Object>();

        Intent intent = getIntent();

        IngSozluk.kelimeler.add(intent.getSerializableExtra("gonderilenKelime"));

        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,kelimeler);


        kelimeleriGosteren.setAdapter(adapter);




    }
}
