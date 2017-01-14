package com.hyemin.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.hyemin.assignment1.MESSAGE";
    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.main_msg1_edittxt);
        editText2 = (EditText) findViewById(R.id.main_msg2_edittxt);
    }

    public void addResult(View view){
        int num1, num2;
        int sum;

        String firstNum = editText1.getText().toString();
        String secondNum = editText2.getText().toString();

        num1 = Integer.parseInt(firstNum);
        num2 = Integer.parseInt(secondNum);
        sum = num1 + num2;

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra(EXTRA_MESSAGE, Integer.toString(sum));
        startActivity(intent);
    }
}
