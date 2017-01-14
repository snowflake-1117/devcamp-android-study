package com.hyemin.assignment1;

import android.content.Intent;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class ResultActivity extends AppCompatActivity {

    private String result;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        initView();
        showResultNum();
    }

    public void initView(){
        Intent intent = getIntent();
        result = intent.getStringExtra(MainActivity.RESULT);
    }

    public void showResultNum(){
        resultTextView = (TextView) findViewById(R.id.result_txtview);
        resultTextView.setTextSize(30);
        resultTextView.setTextColor(resultColor());

        if(result==null) {
            resultTextView.setText("fail to calculate");
        }
        else {
            String answer = String.format(Locale.ENGLISH, "Result : %s", result);
            resultTextView.setText(answer);
        }
    }

    private int resultColor(){
        int resultColor;

        if(Build.VERSION.SDK_INT>=24){
            resultColor = ContextCompat.getColor(getApplicationContext(), R.color.Red);
        }
        else if(Build.VERSION.SDK_INT>=21){
            resultColor = ContextCompat.getColor(getApplicationContext(), R.color.Blue);
        }
        else{
            resultColor = ContextCompat.getColor(getApplicationContext(), R.color.Green);
        }

        return  resultColor;
    }
}
