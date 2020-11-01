package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Maths extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);
    }
    public void mathslessons (View view) {
        startActivity(new Intent(this, MathsLesssons.class));
    }
    public void mQuiz (View view) {
        startActivity(new Intent(this, MathsQuiz.class));
    }

    public void mathspastpapers (View view) {
        startActivity(new Intent(this, MathsPastPapers.class));
    }
}