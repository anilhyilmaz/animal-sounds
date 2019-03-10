package com.example.myapplication;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SINAV extends AppCompatActivity {
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinav);
        imageView4 = findViewById(R.id.ImageView4);
        imageView4 = findViewById(R.id.ImageView5);
        imageView4 = findViewById(R.id.ImageView6);
        imageView4 = findViewById(R.id.ImageView7);
    }
}
