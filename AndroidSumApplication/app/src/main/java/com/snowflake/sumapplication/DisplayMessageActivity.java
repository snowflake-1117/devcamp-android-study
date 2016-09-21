package com.snowflake.sumapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        showResultNum();
    }

    public void showResultNum() {
        TextView result = (TextView) findViewById(R.id.display_message_result);
        result.setTextSize(40);
        result.setTextColor(getColor(this, R.id.display_message_result));
        result.setText("Result: " + message);
    }

    public static final int getColor(Context context, int id){
        final int version = Build.VERSION.SDK_INT;

        if(version >= 24) {
           return ContextCompat.getColor(context, R.color.colerAboveV24);
        }
        else if(version < 24 && version >= 21) {
           return ContextCompat.getColor(context, R.color.colerAboveV21);
        }
        else {
           return ContextCompat.getColor(context, R.color.colerUnderV21);
        }
    }
}
