package com.example.learningapp;

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class SecountActivity extends AppCompatActivity {

    TextView secInfo;
    Button btnStop;

    Ringtone ringTone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secount);
        secInfo = (TextView)findViewById(R.id.secinfo);
        btnStop = (Button)findViewById(R.id.stop);

        String stringUri = getIntent().getStringExtra("SEC_RINGTONE_URI");
        Uri uri = Uri.parse(stringUri);
        secInfo.setText("uri: " + uri + "\n");

        ringTone = RingtoneManager
                .getRingtone(getApplicationContext(), uri);

        secInfo.append(ringTone.getTitle(SecountActivity.this));

        ringTone.play();

        btnStop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(ringTone != null){
                    ringTone.stop();
                    ringTone = null;
                }
            }
        });

    }

}
