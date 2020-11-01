package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HeatResults extends AppCompatActivity {
    TextView txtHighScore;
    TextView txtYourScore;
    Button btStartQuiz;
    Button btMainMenu;
    private int highScore;
    public static final String SHARED_PREFERRENCEH = "shread_prefrence";
    public static final String SHARED_PREFERRENCE_HIGH_SCOREH = "shared_prefrence_high_score";
    private long backPressedTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heat_results);
        btMainMenu = findViewById(R.id.bt_mainmenu);
        btStartQuiz = findViewById(R.id.bt_playagain);
        txtHighScore = findViewById(R.id.text_High_Score);
        txtYourScore = findViewById(R.id.text_YourScore);

        btMainMenu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HeatResults.this, ScienceQuiz.class);
                startActivity(intent);
            }
        });

        btStartQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HeatResults.this, Heat.class);
                startActivity(intent);
            }
        });
        loadHighScore();
        Intent intent = getIntent();
        int score = intent.getIntExtra("UserScore", 0);
        txtYourScore.setText("Your Score:" + String.valueOf(score));

        if (score > highScore) {

            updateHighScore(score);
        }

    }

    private void loadHighScore() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFERRENCEH,MODE_PRIVATE);
        highScore=sharedPreferences.getInt(SHARED_PREFERRENCE_HIGH_SCOREH,0);
        txtHighScore.setText("High Score:"+String.valueOf(highScore));
    }

    private void updateHighScore(int newHighScore) {
        highScore=newHighScore;
        txtHighScore.setText("High Score:"+String.valueOf(highScore));
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFERRENCEH,MODE_PRIVATE);
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putInt(SHARED_PREFERRENCE_HIGH_SCOREH,highScore);
        editor.apply();
    }

    private void finishQuiz() {
        Intent resultIntent = new Intent();
        //resultIntent.putExtra(EXTRA_SCORE, score);
        // setResult(RESULT_OK, resultIntent);
        finish();
    }

    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            //Intent intent =new Intent(ResultsActivity.this,ScienceQuiz.class);
            //startActivity(intent);
            finish();

        } else {
            Toast.makeText(this, "Press back again to finish", Toast.LENGTH_SHORT).show();
        }

        backPressedTime = System.currentTimeMillis();
    }

}
