package com.example.giyami2.sumapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String result_sum;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this,SumActivity.class);
        int num1, num2;
        final int result;

        final EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);

        String first = editText1.getText().toString();
        String second = editText2.getText().toString();

        num1 = Integer.parseInt(first);
        num2 = Integer.parseInt(second);
        result = num1 + num2;

        result_sum = Integer.toString(result);

        intent.putExtra("EXTRA_MESSAGE",result_sum);
        startActivity(intent);

    }

}
