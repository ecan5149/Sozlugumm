package com.example.enes.sozlugum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;


public class MainActivity extends AppCompatActivity  {

    Button arapcasozluk;
    Button ingsozluk;
    Button ayarlar;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.add_word,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent= new Intent(getApplicationContext(),KelimeOlustur.class);
        startActivity(intent);

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arapcasozluk = findViewById(R.id.button);
        ingsozluk = findViewById(R.id.button2);
        ayarlar = findViewById(R.id.button3);




    }

    public void ingSozlugeGit(View view)
    {

        Intent intent = new Intent(getApplicationContext(),IngSozluk.class);
        startActivity(intent);

    }


}
