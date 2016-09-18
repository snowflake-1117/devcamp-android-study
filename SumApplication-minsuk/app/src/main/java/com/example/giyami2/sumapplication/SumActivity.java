package com.example.giyami2.sumapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * 2개의 EditText에서 값을 받아와 결과 값을 Main으로
 * 전송해주는 Activity
 */
public class SumActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");

        TextView textView = (TextView) findViewById(R.id.resultView);
        textView.setTextSize(40);
        textView.setText(message);

    }

}
