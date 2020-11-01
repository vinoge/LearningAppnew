package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class sci_electromagnetism_chapters extends AppCompatActivity {
    LinearLayout l1;
    LinearLayout l2;
    LinearLayout l3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sci_electromagnetism_chapters);

        l1=(LinearLayout) findViewById(R.id.l1);

        l2=(LinearLayout) findViewById(R.id.l2);
        l3=(LinearLayout) findViewById(R.id.l3);




        l1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sci_electromagnetism_chapters.this,sci_electromagnetism_magnetism.class);
                startActivity(intent);
            }
        } );

        l2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sci_electromagnetism_chapters.this,sci_electromagnetism_magneticeffects.class);
                startActivity(intent);
            }
        } );

        l3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sci_electromagnetism_chapters.this,sci_electromagnetism_induction.class);
                startActivity(intent);
            }
        } );






    }
}