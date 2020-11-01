package com.example.learningapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ScienceQuiz extends AppCompatActivity {
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
    LinearLayout l15;
    private long backPressedTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_quiz);

        l1=(LinearLayout) findViewById(R.id.l1);
        l3=(LinearLayout) findViewById( R.id.l3 );
        l2=(LinearLayout) findViewById(R.id.l2);
        l4=(LinearLayout) findViewById( R.id.l4 );
        l5=(LinearLayout) findViewById( R.id.l5 );
        l6=(LinearLayout) findViewById( R.id.l6 );
        l7=(LinearLayout) findViewById(R.id.l7);
        l8=(LinearLayout) findViewById( R.id.l8 );
        l9=(LinearLayout) findViewById(R.id.l9);
       // l10=(LinearLayout) findViewById( R.id.l10 );
        l11=(LinearLayout) findViewById( R.id.l11 );
        l12=(LinearLayout) findViewById( R.id.l12 );
        l13=(LinearLayout) findViewById( R.id.l13 );
       // l14=(LinearLayout) findViewById( R.id.l14 );
        l15=(LinearLayout) findViewById( R.id.l15 );



        l1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceQuiz.this,Livingtissues.class);
                startActivity(intent);
            }
        } );

        l2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceQuiz.this,Photosynthesis.class);
                startActivity(intent);
            }
        } );


        l3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceQuiz.this,Mixture.class);
                startActivity(intent);
            }
        } );

        l4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceQuiz.this,Waves.class);
                startActivity(intent);
            }
        } );

        l5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceQuiz.this,Geometrical.class);
                startActivity(intent);
            }
        } );


        l6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceQuiz.this,HumanBody.class);
                startActivity(intent);
            }
        } );

        l7.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceQuiz.this,Acid.class);
                startActivity(intent);
            }
        } );

        l8.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceQuiz.this,Heat.class);
                startActivity(intent);
            }
        } );

        l9.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceQuiz.this,Power_and_Energy.class);
                startActivity(intent);
            }
        } );

       /* l10.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceQuiz.this,Electronics.class);
                startActivity(intent);
            }
        } );*/

        l11.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceQuiz.this,Electrochemistry.class);
                startActivity(intent);
            }
        } );

        l12.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceQuiz.this,Electromagnetism.class);
                startActivity(intent);
            }
        } );


        l13.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceQuiz.this,Hydrocarbons.class);
                startActivity(intent);
            }
        } );

       /* l14.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceQuiz.this,Biosphere.class);
                startActivity(intent);
            }
        } );*/

        l15.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScienceQuiz.this,MixedQuiz.class);
                startActivity(intent);
            }
        } );

    }
    /*public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            Intent intent =new Intent(ScienceQuiz.this,Science.class);
            startActivity(intent);

        } else {
            Toast.makeText(this, "Press back again to finish", Toast.LENGTH_SHORT).show();
        }

        backPressedTime = System.currentTimeMillis();
    }*/
}