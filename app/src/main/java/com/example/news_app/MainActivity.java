package com.example.news_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

   private  ImageView img_1,img_2,img_4,img_3,img_5,img_6,img_7,img_8;

   String d = "https://www.divyabhaskar.co.in/";
   String t = "https://timesofindia.indiatimes.com/";
   String a = "https://www.abplive.com/";
   String v = "https://www.tv9hindi.com/live-tv";
   String j= "https://www.aajtak.in/";
   String i = "https://www.indiatoday.in/";
   String n = "https://ddnews.gov.in/";
   String z = "https://zeenews.india.com/tags/live-tv.html";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding();

        img_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,news.class);
                intent.putExtra("divy",d);
                startActivity(intent);
            }
        });
        img_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,news.class);
                intent.putExtra("divy",t);
                startActivity(intent);

            }
        });

        img_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,news.class);
                intent.putExtra("divy",a);
                startActivity(intent);


            }
        });

        img_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,news.class);
                intent.putExtra("divy",v);
                startActivity(intent);


            }
        });
        img_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,news.class);
                intent.putExtra("divy",j);
                startActivity(intent);


            }
        });

        img_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,news.class);
                intent.putExtra("divy",i);
                startActivity(intent);


            }
        });

        img_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,news.class);
                intent.putExtra("divy",n);
                startActivity(intent);


            }
        });

        img_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,news.class);
                intent.putExtra("divy",n);
                startActivity(intent);


            }
        });


    }

    private void binding()
    {
        img_1 = (ImageView) findViewById(R.id.img_1);
        img_2 = (ImageView) findViewById(R.id.img_2);
        img_3 = (ImageView) findViewById(R.id.img_3);
        img_4 = (ImageView) findViewById(R.id.img_4);
        img_5 = (ImageView) findViewById(R.id.img_5);
        img_6 = (ImageView) findViewById(R.id.img_6);
        img_7 = (ImageView) findViewById(R.id.img_7);
        img_8 = (ImageView) findViewById(R.id.img_8);

    }
}