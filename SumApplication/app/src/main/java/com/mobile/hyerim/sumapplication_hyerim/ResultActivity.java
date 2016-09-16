package com.mobile.hyerim.sumapplication_hyerim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView mResultTextView;
    private int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        init();

        Intent intent = getIntent();
        result = intent.getIntExtra("result", -1);  //기본값 -1

        if(result == -1)
            mResultTextView.setText("Calculation fail.");
        else {
            mResultTextView.setText("Result : " + result);
        }
    }

    private void init() {
        mResultTextView = (TextView) findViewById(R.id.tv_result);
    }
}
