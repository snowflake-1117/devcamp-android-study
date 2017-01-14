package com.hyemin.assignment_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final String KEY_VIDEO_URL = "VIDEO_URL";

    String videoURL;
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "call onCreate");
        super.onCreate(savedInstanceState);

        if(savedInstanceState!=null) {
            videoURL = savedInstanceState.getString(KEY_VIDEO_URL);
        }
        else{
            videoURL = "http://techslides.com/demos/sample-videos/small.mp4";
        }

        setContentView(R.layout.activity_main);
        initView();
    }

    @Override
    protected  void onStart(){
        Log.i(TAG, "call onStart");
        super.onStart();
    }

    @Override
    protected  void onResume(){
        Log.i(TAG, "call onResume");
        super.onResume();

        if(videoView.isPlaying()==false){
            videoView.start();
        }
    }

    @Override
    protected void onPause(){
        Log.i(TAG, "call onPause");
        super.onPause();

        videoView.stopPlayback();
    }

    @Override
    protected void onStop(){
        Log.i(TAG, "call onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        Log.i(TAG, "call onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart(){
        Log.i(TAG, "call onRestart");
        super.onRestart();
    }

    private void initView() {
        videoView = (VideoView) findViewById(R.id.main_videoview);
        videoView.setVideoPath(videoURL);

        final MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);

        videoView.start();
    }

    public void moveSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);

        Log.i(TAG, "call onSaveInstanceState");

        savedInstanceState.putString(KEY_VIDEO_URL, videoURL);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);

        Log.i(TAG, "call onRestoreInstanceState");

        videoURL = savedInstanceState.getString(KEY_VIDEO_URL);
    }
}