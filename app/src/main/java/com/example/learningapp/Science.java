package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Science extends AppCompatActivity {
    private long backPressedTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);
    }
    public void sciencelessons (View view) {
        startActivity(new Intent(this, ScienceLessons.class));
    }
    public void sciencequiz (View view) {
        startActivity(new Intent(this, ScienceQuiz.class));
    }

    public void sceiencepastpapers (View view) {
        startActivity(new Intent(this, ViewSciencePastPapers.class));
    }

   /* public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            Intent intent =new Intent(Science.this,SelectionActivity.class);
            startActivity(intent);

        } else {
            Toast.makeText(this, "Press back again to finish", Toast.LENGTH_SHORT).show();
        }

        backPressedTime = System.currentTimeMillis();
    }*/
}