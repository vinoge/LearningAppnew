package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class adminscience extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminscience);
    }
    public void sciencelessons (View view) {
        startActivity(new Intent(this, AddLessons.class));
    }
    public void sciencequiz (View view) {
        startActivity(new Intent(this, AddQuiz.class));
    }

    public void SceiencePastPapers (View view) {
        startActivity(new Intent(this,SciencePastPapers.class));
    }
}