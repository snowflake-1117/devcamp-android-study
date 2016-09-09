package com.acious.sumapplication;

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
        mResultTextView.setText(resultText);
    }
}
