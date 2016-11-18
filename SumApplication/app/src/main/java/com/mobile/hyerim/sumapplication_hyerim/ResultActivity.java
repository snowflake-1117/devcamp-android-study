package com.mobile.hyerim.sumapplication_hyerim;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView mResultTextView;
    private int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        initView();
        setColorVersion();

        Intent intent = getIntent();
        result = intent.getIntExtra("result", -1);  //기본값 -1

        if(result == -1)
            mResultTextView.setText("Calculation fail.");
        else {
            mResultTextView.setText("Result : " + result);
        }
    }

    private void setColorVersion() {
        final int version = Build.VERSION.SDK_INT;
        int textColor;

        if( version >= Build.VERSION_CODES.N){
            textColor = ContextCompat.getColor(getApplicationContext(), R.color.Red);
        }else if ( version >= Build.VERSION_CODES.LOLLIPOP) {
           textColor = ContextCompat.getColor(getApplicationContext(), R.color.Blue);
        }else{
            textColor = ContextCompat.getColor(getApplicationContext(),  R.color.Green);
        }

        mResultTextView.setTextColor(textColor);
    }

    private void initView() {
        mResultTextView = (TextView) findViewById(R.id.result_tv);
    }
}
