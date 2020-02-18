package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class active2 extends AppCompatActivity {
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active2);
        Button mp3=(Button)findViewById(R.id.mp3play);
        mp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 player= MediaPlayer.create(getApplicationContext(),R.raw.Nkusinza);
                player.start();
            }
        });
    }
}
