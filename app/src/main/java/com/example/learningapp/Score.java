package com.example.learningapp;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Score extends AppCompatActivity {
    DatabaseHelper db;
    TextView score_1, score_2, score_3, score_4, score_5, score_6,name1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        score_1 = findViewById(R.id.score_1);
        score_2 = findViewById(R.id.score_2);
        score_3 = findViewById(R.id.score_3);
        name1 = findViewById(R.id.name);
        db=new DatabaseHelper(this);
        Cursor cursor=  db.viewHighScore();
        StringBuilder stringBuilder=new StringBuilder();
        final int[] id= new int[400];
        final int[] Mixture= new int[400];
        final int[] id1 = new int [400];
       /* final int[] level2= new int[400];
        final int[] level3= new int[400];
        final int[] total= new int[400];
       */

        int i=0;
        int j=0;
        while(cursor.moveToNext()){
            //   stringBuilder.append(cursor.getString(2));

            Mixture[i] = cursor.getInt(1);
            /*level2[i] = cursor.getInt(2);
            level3[i] = cursor.getInt(3);

            total[i] = level1[i] + level2[i] + level3[i];
            */
            id1[i] = cursor.getInt(0);

            i++;


        }

/*
        int temp,temp2;

        for (int k =0; k < 400; k++) {
            for (int l = k+ 1; l < 400; l++ ) {
                if (total[k] < total[l])
                {
                    temp = total[k];
                    total[k] = total[l];
                    total[l] = temp;


                    temp2 = id1[k];
                    id1[k] = id1[l];
                    id1[l] = temp2;




                }

            }
        }*/

        Cursor cursr=  db.getUser();
        StringBuilder stringBuildr=new StringBuilder();

        int z=0;
        final int[] userID= new int[400];
        final String[] name= new String[400];
        final String[] nameSorted= new String[400];


        while(cursr.moveToNext()){

            userID[z] = cursr.getInt(0);
            name[z] = cursr.getString(1);
            z++;

        }
        for (int a= 0; a < 400; a++) {

            for (int b= 0; b < 400; b++) {
                if (id1[a] == userID[b]) {

                    nameSorted[a] = name[b];
                }

            }

        }


        score_1.setText(String.valueOf(Mixture[0]));
        name1.setText(String.valueOf(nameSorted[0]));
        /*
        score_two.setText(String.valueOf(total[1]));
        score_3.setText(String.valueOf(total[2]));
        score_4.setText(String.valueOf(total[3]));
        name_one.setText(String.valueOf(nameSorted[0]));
        name_two.setText(String.valueOf(nameSorted[1]));
        name_3.setText(String.valueOf(nameSorted[2]));
        name_4.setText(String.valueOf(nameSorted[3]));
*/
      /*
        name_two.setText(String.valueOf(nameSorted[1]));
        score_3.setText(String.valueOf(total[3][0]));
        name_3.setText(String.valueOf(nameSorted[2]));
        score_4.setText(String.valueOf(total[4][0]));
        name_4.setText(String.valueOf(nameSorted[3]));
        score_5.setText(String.valueOf(total[5][0]));
        name_5.setText(String.valueOf(nameSorted[4]));
*/



        //  Toast.makeText(getApplicationContext(),"updated " +total[1][0]+" "+ nameSorted[0]+" "+ total[2][0]+ " "+nameSorted[1] ,Toast.LENGTH_SHORT).show();



    }
    }
