package com.syl.carmusic;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MyMediaPlayer extends AppCompatActivity {

    MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_media_player);
        Button musicplay = (Button) findViewById(R.id.musicplay);
        Button musicpause = (Button) findViewById(R.id.musicpause);



        // Adding the music file to our
        // newly created object music
        music = MediaPlayer.create(this, R.raw.sound);

        musicplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music.start();

            }
        });

        musicpause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music.pause();
            }

        });

    }


}