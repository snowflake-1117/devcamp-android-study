package com.mobile.hyerim.sumapplication_hyerim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {
    private static final String TAG = "MainActivity";

    private EditText mNum1EditText, mNum2EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    public void initView(){
        mNum1EditText = (EditText) findViewById(R.id.main_num1_et);
        mNum2EditText = (EditText) findViewById(R.id.main_num2_et);
    }

    public void nextButtonClick(View view) {
        int num1 = Integer.parseInt(mNum1EditText.getText().toString());
        int num2 = Integer.parseInt(mNum2EditText.getText().toString());

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", num1 + num2);
        startActivity(intent);
    }
}
