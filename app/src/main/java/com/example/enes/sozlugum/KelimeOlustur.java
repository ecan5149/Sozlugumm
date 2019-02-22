package com.example.enes.sozlugum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.Serializable;

public class KelimeOlustur extends AppCompatActivity  {
    IngKelimeler kelime;

    EditText anlami;
    EditText kelimeninAdi;
    EditText genelkullanim;
    EditText iliskiliKelimeler;
    EditText ornekCumle;

    String anlamitext;
    String kelimeninadiText;
    String genelkullanimText;
    String iliskiliKelimelerText;
    String ornekCumleText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

           super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_kelime_olustur);
           anlami = findViewById(R.id.editText);
           kelimeninAdi = findViewById(R.id.editText1);
           genelkullanim = findViewById(R.id.editText2);
           iliskiliKelimeler = findViewById(R.id.editText3);
           ornekCumle = findViewById(R.id.editText4);

           anlamitext = anlami.getText().toString();
           kelimeninadiText = kelimeninAdi.getText().toString();
           genelkullanimText= genelkullanim.getText().toString();
           iliskiliKelimelerText = iliskiliKelimeler.getText().toString();
           ornekCumleText = ornekCumle.getText().toString();
           kelime = new IngKelimeler(anlamitext,kelimeninadiText,genelkullanimText,iliskiliKelimelerText,ornekCumleText);






    }
    public void ekle(View view)
    {
           Intent intent = new Intent(getApplicationContext(),IngSozluk.class);

           intent.putExtra("gonderilenKelime",kelime);

           startActivity(intent);
    }

}

