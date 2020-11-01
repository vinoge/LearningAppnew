package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class sci_biosphere_chapters extends AppCompatActivity {
    LinearLayout l1;
    LinearLayout l2;
    LinearLayout l3;
    LinearLayout l4;
    LinearLayout l5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sci_biosphere_chapters);

        l1=(LinearLayout) findViewById(R.id.l1);
        l3=(LinearLayout) findViewById( R.id.l3 );
        l2=(LinearLayout) findViewById(R.id.l2);
        l4=(LinearLayout) findViewById(R.id.l4);
        l5=(LinearLayout) findViewById(R.id.l5);



        l1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sci_biosphere_chapters.this,sci_biosphere_levels.class);
                startActivity(intent);
            }
        } );

        l2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sci_biosphere_chapters.this,sci_biosphere_ecosystems.class);
                startActivity(intent);
            }
        } );


        l3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sci_biosphere_chapters.this,sci_biosphere_pollution.class);
                startActivity(intent);
            }
        } );

        l4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sci_biosphere_chapters.this,sci_biosphere_lifestyle.class);
                startActivity(intent);
            }
        } );

        l5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sci_biosphere_chapters.this,sci_biosphere_development.class);
                startActivity(intent);
            }
        } );


    }
}