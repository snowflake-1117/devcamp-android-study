package com.acious.sumapplication;

import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class ResultActivity extends AppCompatActivity {

    private int mResultNum;
    private TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        mResultNum = getIntent().getIntExtra("result", -1);

        initView();
        setResultNum();
    }

    public void initView() {
        mResultTextView = (TextView) findViewById(R.id.result_sum_txt);
    }

    public void setResultNum() {
        String resultText = String.format(Locale.KOREA, "Result: %d", mResultNum);
        changeColorbyAPI();
        mResultTextView.setText(resultText);
    }

    private void changeColorbyAPI() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            mResultTextView.setTextColor(ContextCompat.getColor(this, android.R.color.holo_red_light));
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mResultTextView.setTextColor(ContextCompat.getColor(this, android.R.color.holo_blue_bright));
        } else {
            mResultTextView.setTextColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
        }
    }
}
