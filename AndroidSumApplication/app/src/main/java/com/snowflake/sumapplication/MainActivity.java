package com.snowflake.sumapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE ="com.snowflake.sumapplication.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view){
        int num1, num2;
        int sum;

        EditText editText1 = (EditText) findViewById(R.id.main_msg1_edittxt);
        EditText editText2 = (EditText) findViewById(R.id.main_msg2_edittxt);

        String firNumber = editText1.getText().toString();
        String secNumber = editText2.getText().toString();

        num1 = Integer.parseInt(firNumber);
        num2 = Integer.parseInt(secNumber);
        sum = num1+num2;

        String strSum = Integer.toString(sum);

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE, strSum);
        startActivity(intent);
    }
}
