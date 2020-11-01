package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class sci_acids_acids extends AppCompatActivity {


    private List<word> questionList;
    private int questionCounter;
    private int questionCountTotal;
    private word currentQuestion;

    Button button_next;
    Button voc;
    TextView txt_lesson;
    int r=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sci_acids_acids);
        txt_lesson = (TextView) findViewById(R.id.acids);
        button_next = (Button) findViewById(R.id.button_next);
        voc=(Button)findViewById(R.id.button_vocabulary_next);
        DbHelper dbHelper = new DbHelper(this);
        questionList = dbHelper.getAllAcids();
        questionCountTotal = questionList.size();

        showNextQuestion();

        voc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1= new Intent(sci_acids_acids .this, sci_acids_voc_select_medium.class);
                startActivity(int1);
            }




        });
        button_next.setOnClickListener(new View.OnClickListener() {
            int i=1;

            @Override
            public void onClick(View v) {

                // imageButtonOne.setVisibility(View.VISIBLE);

                i++;
                r++;
                if (i==4) {
                    Intent intent=new Intent(sci_acids_acids.this,sci_acids_chapters.class);
                    startActivity(intent);
                }
                showNextQuestion();


            }


        });

    }


    public void showNextQuestion() {
        if (questionCounter < questionCountTotal) {
            currentQuestion = questionList.get(questionCounter);

            txt_lesson.setText(currentQuestion.getName());

            questionCounter++;

        }
    }
}


