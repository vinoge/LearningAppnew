package com.example.learningapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
    Button b1;
    Spinner b2;
    DatabaseHelper db;
    TextView textview;

    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db = new DatabaseHelper(this);
        e1 = (EditText) findViewById(R.id.editUsername);
        e2 = (EditText) findViewById(R.id.editPassword);
        b1 = (Button) findViewById(R.id.btnLogin);
        b2=(Spinner) findViewById(R.id.spinner);
        textview = (TextView) findViewById(R.id.register);


        ArrayAdapter<CharSequence> adapter =ArrayAdapter.createFromResource(this,R.array.usertype,R.layout.support_simple_spinner_dropdown_item);
        b2.setAdapter(adapter);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname=e1.getText().toString();
                String password=e2.getText().toString();
                boolean chklogin=db.userpassword(uname,password);
                String item=b2.getSelectedItem().toString();


                if(chklogin==true) {
                    Toast.makeText(getApplicationContext(), "Successfully Login", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(LoginActivity.this, SelectionActivity.class));
                }

                        else if(e1.getText().toString().equals("maths") && e2.getText().toString().equals("maths") && item.equals("mathsadmin") ){
                            Toast.makeText(getApplicationContext(), "Successfully Login", Toast.LENGTH_LONG).show();
                            startActivity(new Intent(LoginActivity.this, mathsadmin.class));
                        }
                        else if(e1.getText().toString().equals("science") && e2.getText().toString().equals("science") && item.equals("scienceadmin")){
                            Toast.makeText(getApplicationContext(), "Successfully Login", Toast.LENGTH_LONG).show();
                            startActivity(new Intent(LoginActivity.this, adminscience.class));
                        }

                else{
                    Toast.makeText(getApplicationContext(),"Something wrong",Toast.LENGTH_LONG).show();
                }
            }
        });

        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(i);
            }
        });

    }


    public void onClick (View view) {
        Intent registerIntent = new Intent(LoginActivity.this,RegisterActivity.class);
        startActivity(registerIntent);
    }

   /* public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            Intent intent =new Intent(LoginActivity.this,MainActivity.class);
            startActivity(intent);

        } else {
            Toast.makeText(this, "Press back again to finish", Toast.LENGTH_SHORT).show();
        }

        backPressedTime = System.currentTimeMillis();
    }*/


}
