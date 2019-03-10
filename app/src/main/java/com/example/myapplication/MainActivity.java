package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button hayvan_sesleri;
    Button renkler;
    Button sekiller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hayvan_sesleri = findViewById(R.id.girisbutton);
        hayvan_sesleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Oyun_Ekrani.class);
                startActivity(intent);
            }
        });
        renkler = findViewById(R.id.renkler);
        renkler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,Renkler.class);
                startActivity(intent1);
            }
        });
        sekiller = findViewById(R.id.sekiller);
        sekiller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,Sekiller.class);
                startActivity(intent2);
            }
        });

    }
}
