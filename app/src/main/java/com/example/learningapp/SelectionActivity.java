package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SelectionActivity extends AppCompatActivity {
    private long backPressedTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }
    public void maths (View view) {
        startActivity(new Intent(this, Maths.class));
    }
    public void science (View view) {
        startActivity(new Intent(this, Science.class));
    }

   public void alarm (View view) {
        startActivity(new Intent(this, Alarm.class));
    }
    public void game (View view) {
        startActivity(new Intent(this, Game.class));
    }
    public void score (View view) {
        startActivity(new Intent(this, Score.class));
    }

    public void settings (View view) {
        startActivity(new Intent(this, Settings.class));
    }

   /* public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            Intent intent =new Intent(SelectionActivity.this,LoginActivity.class);
            startActivity(intent);

        } else {
            Toast.makeText(this, "Press back again to finish", Toast.LENGTH_SHORT).show();
        }

        backPressedTime = System.currentTimeMillis();
    }*/
}

