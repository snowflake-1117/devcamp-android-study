package com.mobile.hyerim.sumapplication_hyerim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";

    private EditText mNum1EditText, mNum2EditText;
    private Button mNextButton;

    private int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        mNextButton.setOnClickListener(this);
    }

    public void init(){
        result = 0;
        mNum1EditText = (EditText) findViewById(R.id.et_num1);
        mNum2EditText = (EditText) findViewById(R.id.et_num2);
        mNextButton = (Button) findViewById(R.id.btn_next);
    }

    @Override
    public void onClick(View view) {
        result = Integer.parseInt(mNum1EditText.getText().toString()) + Integer.parseInt(mNum2EditText.getText().toString());
        Log.d(TAG, "result int : " + result);

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }
}
