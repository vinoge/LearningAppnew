package com.example.learningapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import static java.lang.Thread.sleep;

public class Splash extends AppCompatActivity {
    private final static int EXIT_CODE=100;
   TextView txtSplashTex;
   ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        txtSplashTex = findViewById(R.id.textView3);
        imageView = findViewById(R.id.imageView);

        /*Animation animation = AnimationUtils.loadAnimation(this.R.anim.trasnsition);
        imageView.setAnimation(animation);
        txtSplashTex.setAnimation(animation);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                public void run () {
                    try {
                        sleep(millis:3000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        GotoPlayActivity();
                    }
                }
            }


        });
        thread.start();
    }
        private void GotoPlayActivity() {
            startActivityForResult(new Intent(Splash.this,MainActivity.class),EXIT_CODE);
        }
     protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode,data);
        if(requestCode ==EXIT_CODE){
            if(resultCode == RESULT_OK){
                if (data.getBooleanExtra(name:"EXIT", defaultValue:true)){
                    finish();
                }
            }
        }*/
     }


    }
