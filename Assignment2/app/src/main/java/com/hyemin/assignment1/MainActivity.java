package com.hyemin.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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

        if(editText1.getText().toString().matches("")){
            Toast.makeText(this, "You did not enter first number", Toast.LENGTH_SHORT).show();
            return ;
        }
        else {
            num1 = Integer.parseInt(editText1.getText().toString());
        }

        if(editText2.getText().toString().matches("")){
            Toast.makeText(this, "You did not enter second number", Toast.LENGTH_SHORT).show();
            return ;
        }
        else {
            num2 = Integer.parseInt(editText2.getText().toString());
        }

        sum = Integer.toString(num1+num2);

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra(RESULT, sum);
        startActivity(intent);
    }
}
