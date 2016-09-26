package com.example.joen.lab01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {

        EditText editText1 = (EditText) findViewById(R.id.main_edit_msg1);
        String message1 = editText1.getText().toString();
        EditText editText2 = (EditText) findViewById(R.id.main_edit_msg2);
        String message2 = editText2.getText().toString();

        int result = Integer.parseInt(message2) + Integer.parseInt(message1);
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE, Integer.toString(result));
        startActivity(intent);
    }
}