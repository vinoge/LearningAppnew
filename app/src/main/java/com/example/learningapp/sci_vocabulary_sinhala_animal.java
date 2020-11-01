package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class sci_vocabulary_sinhala_animal extends AppCompatActivity {
    Button end;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sci_vocabulary_sinhala_animal);

        end = (Button) findViewById(R.id.btnend);

        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1= new Intent(sci_vocabulary_sinhala_animal.this, ScienceLessons.class);
                startActivity(int1);
            }




        });
    }
}