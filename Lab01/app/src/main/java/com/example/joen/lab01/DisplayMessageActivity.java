package com.example.joen.lab01;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText("Result : "+message);

        if (Build.VERSION.SDK_INT >= 24)
            textView.setTextColor(Color.RED);
        else if (Build.VERSION.SDK_INT < 24 && Build.VERSION.SDK_INT >= 21)
            textView.setTextColor(Color.BLUE);
        else
            textView.setTextColor(Color.GREEN);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);
    }



}
