package com.choudhary.yogeshc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class start_pg extends AppCompatActivity {

    private VideoView mVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mVideoView = (VideoView) findViewById(R.id.bgVideoView);

        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.vid);

        mVideoView.setVideoURI(uri);
        mVideoView.start();

        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);


        mVideoView = (VideoView) findViewById(R.id.bgVideoView);

        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.vid);

        mVideoView.setVideoURI(uri);
        mVideoView.start();

        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });

    }

    public void startB(View view) {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
}
