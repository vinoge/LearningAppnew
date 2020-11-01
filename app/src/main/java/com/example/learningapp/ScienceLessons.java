package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class ScienceLessons extends AppCompatActivity {
    LinearLayout l1;
    LinearLayout l2;
    LinearLayout l3;
    LinearLayout l4;
    LinearLayout l5;
    LinearLayout l6;
    LinearLayout l7;
    LinearLayout l8;
    LinearLayout l9;
    LinearLayout l10;
    LinearLayout l11;
    LinearLayout l12;
    LinearLayout l13;
    LinearLayout l14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_lessons);

        l1=(LinearLayout) findViewById(R.id.l1);
        l3=(LinearLayout) findViewById( R.id.l3 );
        l2=(LinearLayout) findViewById(R.id.l2);
        l4=(LinearLayout) findViewById( R.id.l4 );
        l5=(LinearLayout) findViewById( R.id.l5 );
        l6=(LinearLayout) findViewById( R.id.l6 );
        l7=(LinearLayout) findViewById(R.id.l7);
        l8=(LinearLayout) findViewById( R.id.l8 );
        l9=(LinearLayout) findViewById(R.id.l9);
        l10=(LinearLayout) findViewById( R.id.l10 );
        l11=(LinearLayout) findViewById( R.id.l11 );
        l12=(LinearLayout) findViewById( R.id.l12 );
        l13=(LinearLayout) findViewById( R.id.l13 );
        l14=(LinearLayout) findViewById( R.id.l14 );


        l1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceLessons.this,sci_tissues_chapters.class);
                startActivity(intent);
            }
        } );

        l2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceLessons.this,sci_photosyn_chapters.class);
                startActivity(intent);
            }
        } );


        l3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceLessons.this,sci_mixtures_chapters.class);
                startActivity(intent);
            }
        } );

        l4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceLessons.this,sci_waves_chapters.class);
                startActivity(intent);
            }
        } );

        l5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceLessons.this,sci_optics_chapters.class);
                startActivity(intent);
            }
        } );



        l6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceLessons.this,sci_humanbody_chapters.class);
                startActivity(intent);
            }
        } );

        l7.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceLessons.this,sci_acids_chapters.class);
                startActivity(intent);
            }
        } );

        l7.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceLessons.this,sci_acids_chapters.class);
                startActivity(intent);
            }
        } );

        l7.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceLessons.this,sci_acids_chapters.class);
                startActivity(intent);
            }
        } );

        l8.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceLessons.this,sci_heat_chapters.class);
                startActivity(intent);
            }
        } );

        l9.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceLessons.this,sci_power_chapters.class);
                startActivity(intent);
            }
        } );

        l10.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceLessons.this,sci_electronics_chapters.class);
                startActivity(intent);
            }
        } );

        l11.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceLessons.this,sci_electrochemistry_chapters.class);
                startActivity(intent);
            }
        } );

        l12.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceLessons.this,sci_electromagnetism_chapters.class);
                startActivity(intent);
            }
        } );

        l13.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceLessons.this,sci_hydrocarbons_chapters.class);
                startActivity(intent);
            }
        } );

        l14.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceLessons.this,sci_biosphere_chapters.class);
                startActivity(intent);
            }
        } );

    }
}