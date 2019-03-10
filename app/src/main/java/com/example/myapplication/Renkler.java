package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Renkler extends AppCompatActivity {
    Button geri;
    Button ileri;
    ViewFlipper viewF;
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renkler);
        geri = findViewById(R.id.geri3);
        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewF.showPrevious();
            }
        });
        ileri = findViewById(R.id.ileri3);
        ileri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewF.showNext();
            }
        });
        viewF = findViewById(R.id.ViewFlipper3);
    }
}
