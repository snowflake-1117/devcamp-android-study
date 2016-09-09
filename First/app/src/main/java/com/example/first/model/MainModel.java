package com.example.first.model;

import android.app.Application;
import android.content.Intent;

import com.example.first.view.SumResult;

/**
 * Created by secret on 9/10/16.
 */
public class MainModel {
    public void startActivity(Application application, int val1, int val2) {
        Intent sumResult = new Intent(application.getApplicationContext(), SumResult.class);
        sumResult.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        sumResult.putExtra("sum", val1 + val2);
        application.startActivity(sumResult);
    }
}
