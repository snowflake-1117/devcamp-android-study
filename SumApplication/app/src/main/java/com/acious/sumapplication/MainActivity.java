package com.acious.sumapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mNumEditText1;
    private EditText mNumEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    public void initView() {
        mNumEditText1 = (EditText) findViewById(R.id.main_one_num_edittxt);
        mNumEditText2 = (EditText) findViewById(R.id.main_two_num_edittxt);
    }

    public void moveToResultActivity(View view) {
        int firstNum = Integer.parseInt(mNumEditText1.getText().toString());
        int secondNum = Integer.parseInt(mNumEditText2.getText().toString());

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", firstNum + secondNum);
        startActivity(intent);
    }
}
