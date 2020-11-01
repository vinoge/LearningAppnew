package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddLessons extends AppCompatActivity {

    EditText notesName;
    EditText type;

    DbHelper db;

    Button addNewNotes;

    String notesvalue;
    String typevalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_lessons);

        db=new DbHelper(this);
        notesName= (EditText) findViewById(R.id.notesName);
        type = findViewById(R.id.type);


        addNewNotes = findViewById(R.id.addNewNotes);

        addNewNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                notesvalue = notesName.getText().toString().trim();
                typevalue = type.getText().toString();

                if(notesvalue.equals("")||typevalue.equals("")){
                    Toast.makeText(getApplicationContext(),"Fields are Empty",Toast.LENGTH_LONG).show();
                }
                else{
                    Boolean insert = db.insert(notesvalue,typevalue);
                    if (insert == true) {
                        Toast.makeText(getApplicationContext(), "Notes Added", Toast.LENGTH_LONG).show();
                        Intent moveToNext = new Intent (AddLessons.this,AddLessons.class);
                        startActivity(moveToNext);
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Something wrong", Toast.LENGTH_LONG).show();
                        Intent moveToNext = new Intent (AddLessons.this,AddLessons.class);
                        startActivity(moveToNext);
                    }
                }

            }
        });

    }
}


