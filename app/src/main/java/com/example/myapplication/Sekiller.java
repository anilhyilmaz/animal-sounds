package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Sekiller extends AppCompatActivity {

    Button ileri;
    Button geri;
    TextView isim;
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    ImageView image5;
    ImageView image6;
    ViewFlipper view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sekiller);
        image1 = findViewById(R.id.ImageView1);
        image2 = findViewById(R.id.ImageView2);
        image3 = findViewById(R.id.ImageView3);
        image4 = findViewById(R.id.ImageView4);
        image5 = findViewById(R.id.ImageView5);
        image6 = findViewById(R.id.ImageView6);
        view = findViewById(R.id.ViewFlipper1);
        ileri = findViewById(R.id.ileri2);
        ileri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.showNext();
            }
        });
        geri = findViewById(R.id.geri2);
        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.showPrevious();
            }
        });
    }
}
