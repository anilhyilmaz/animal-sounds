package com.example.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import android.widget.Button;

import org.w3c.dom.Text;

public class Oyun_Ekrani extends AppCompatActivity {
    ViewFlipper viewF;
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    ImageView image5;
    ImageView image6;
    ImageView image7;
    ImageView image8;
    ImageView image9;
    ImageView image10;
    ImageView image11;
    ImageView image12;
    MediaPlayer media;
    Button ileri;
    Button geri;
    Button oynat;
    TextView isim;
    String hayvanlar[]={"arı","aslan","at","fil","horoz","inek","karga","kedi","kurt","ordek","penguen","tavuk","yılan","zürafa"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyun__ekrani);
            image1 = findViewById(R.id.ImageView1);
            image1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    media = MediaPlayer.create(Oyun_Ekrani.this, R.raw.ari);
                    media.start();
                }
            });
            image2 = findViewById(R.id.ImageView2);
            image2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    media = MediaPlayer.create(Oyun_Ekrani.this, R.raw.aslan);
                    media.start();
                }
            });
            image3 = findViewById(R.id.ImageView3);
            image3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    media = MediaPlayer.create(Oyun_Ekrani.this, R.raw.at);
                    media.start();
                }
            });
            image4 = findViewById(R.id.ImageView4);
            image4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    media = MediaPlayer.create(Oyun_Ekrani.this, R.raw.fil);
                    media.start();
                }
            });
            image5 = findViewById(R.id.ImageView5);
            image5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    media = MediaPlayer.create(Oyun_Ekrani.this, R.raw.inek);
                    media.start();
                }
            });
            image6 = findViewById(R.id.ImageView6);
            image6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    media = MediaPlayer.create(Oyun_Ekrani.this, R.raw.karga);
                    media.start();
                }
            });
            image7 = findViewById(R.id.ImageView7);
            image7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    media = MediaPlayer.create(Oyun_Ekrani.this, R.raw.kedi);
                    media.start();
                }
            });
            image8 = findViewById(R.id.ImageView8);
            image8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    media = MediaPlayer.create(Oyun_Ekrani.this, R.raw.kurt);
                    media.start();
                }
            });
            image9 = findViewById(R.id.ImageView9);
            image9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    media = MediaPlayer.create(Oyun_Ekrani.this, R.raw.ordek);
                    media.start();
                }
            });
            image10 = findViewById(R.id.ImageView10);
            image10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    media = MediaPlayer.create(Oyun_Ekrani.this, R.raw.penguen);
                    media.start();
                }
            });
            image11 = findViewById(R.id.ImageView11);
            image11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    media = MediaPlayer.create(Oyun_Ekrani.this, R.raw.tavuk);
                    media.start();
                }
            });
            image12 = findViewById(R.id.ImageView12);
            image12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    media = MediaPlayer.create(Oyun_Ekrani.this, R.raw.zurafa);
                    media.start();
                }
            });
            viewF = findViewById(R.id.ViewFlipper);
            ileri = findViewById(R.id.ileri);
            ileri.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (media.isPlaying() == true) {
                        media.stop();
                        viewF.showNext();
                    } else if(media.isPlaying()==false){
                        viewF.showNext();
                    }
                    else
                        viewF.showNext();
                }
            });
            geri = findViewById(R.id.geri);
            geri.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (media.isPlaying() == true) {
                        media.stop();
                        viewF.showPrevious();
                    } else {
                        viewF.showPrevious();
                    }
                }
            });
        //viewF.startFlipping();
        //viewF.setFlipInterval(3000);
        /*int muzik[] ={R.raw.ari,R.raw.aslan,R.raw.at,R.raw.fil,R.raw.inek,R.raw.karga,R.raw.kedi,R.raw.kurt,R.raw.ordek,R.raw.penguen,R.raw.tavuk,R.raw.zurafa};
        for(int i=0;i<12;i++){
            media = MediaPlayer.create(Oyun_Ekrani.this,muzik[i]);
            media.start();
        }*/
    }
}
