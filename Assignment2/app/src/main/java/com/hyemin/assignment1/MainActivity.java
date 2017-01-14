package com.hyemin.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String RESULT = "result";
    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    public void initView(){
        editText1 = (EditText) findViewById(R.id.main_msg1_edittxt);
        editText2 = (EditText) findViewById(R.id.main_msg2_edittxt);
    }

    public void addResult(View view){
        int num1, num2;
        String sum;

        num1 = Integer.parseInt(editText1.getText().toString());
        num2 = Integer.parseInt(editText2.getText().toString());

        sum = Integer.toString(num1+num2);

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra(RESULT, sum);
        startActivity(intent);
    }
}
