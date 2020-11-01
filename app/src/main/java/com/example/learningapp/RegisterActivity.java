package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    EditText n1;
    EditText n2;
    EditText n3;
    EditText n4;
    Button b1;
    TextView b2;
    DatabaseHelper db;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        db = new DatabaseHelper(this);
        n1 = (EditText) findViewById(R.id.name);
        n2 = (EditText) findViewById(R.id.mail);
        n3 = (EditText) findViewById(R.id.uname);
        n4 = (EditText) findViewById(R.id.password);

        b1 = (Button) findViewById(R.id.save);
        b2 = (TextView) findViewById(R.id.register);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=n1.getText().toString();
                String s2=n2.getText().toString();
                String s3=n3.getText().toString();
                String s4=n4.getText().toString();

                if(s1.equals("")||s2.equals("")||s3.equals("")||s4.equals("")){
                    Toast.makeText(getApplicationContext(),"Fields are Empty",Toast.LENGTH_LONG).show();
                }
                else {
                    Boolean chkemail=db.chkemail(s2);
                    Boolean chkuname=db.chkuname(s3);
                    if(n2.getText().toString().trim().matches(emailPattern)) {
                        if (chkuname == true) {
                            Boolean insert = db.insert(s1, s2, s3, s4);
                            if (insert == true) {
                                Toast.makeText(getApplicationContext(), "Registered Success", Toast.LENGTH_LONG).show();
                                Intent moveToLogin = new Intent (RegisterActivity.this,LoginActivity.class);
                                startActivity(moveToLogin);
                            }
                        } else {
                            Toast.makeText(getApplicationContext(), "Username Already Exist", Toast.LENGTH_LONG).show();
                        }
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Invalid Email",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
