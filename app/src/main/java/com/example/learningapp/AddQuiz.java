package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddQuiz extends AppCompatActivity {
    EditText questionName;
    EditText option1;
    EditText option2;
    EditText option3;
    EditText option4;
    EditText type;
    EditText correctAnswer;
    QuizDbHelper db;

    Button addNewQuestion;

    String questionvalue;
    String option1value;
    String option2value;
    String option3value;
    String option4value;
    Integer correctvalue;
    String typevalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_quiz);
        db=new QuizDbHelper(this);
        questionName = (EditText) findViewById(R.id.questionName);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        correctAnswer = findViewById(R.id.correctAnswer);
        type = findViewById(R.id.type);


        addNewQuestion = findViewById(R.id.addNewQuestion);

        addNewQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                questionvalue = questionName.getText().toString().trim();
                option1value = option1.getText().toString();
                option2value = option2.getText().toString();
                option3value = option3.getText().toString();
                option4value = option4.getText().toString();
                correctvalue = Integer.parseInt(correctAnswer.getText().toString());
                typevalue = type.getText().toString();

                if(questionvalue.equals("")||typevalue.equals("")){
                    Toast.makeText(getApplicationContext(),"Fields are Empty",Toast.LENGTH_LONG).show();
                }
                else{
                    Boolean insert = db.insert(questionvalue,option1value,option2value,option3value,option4value,correctvalue,typevalue);
                    if (insert == true) {
                        Toast.makeText(getApplicationContext(), "Quiz Added", Toast.LENGTH_LONG).show();
                        Intent moveToNext = new Intent (AddQuiz.this,AddQuiz.class);
                        startActivity(moveToNext);
                    }
                 else {
                    Toast.makeText(getApplicationContext(), "Something wrong", Toast.LENGTH_LONG).show();
                        Intent moveToNext = new Intent (AddQuiz.this,AddQuiz.class);
                        startActivity(moveToNext);
                }
                }

            }
        });

    }
    }
