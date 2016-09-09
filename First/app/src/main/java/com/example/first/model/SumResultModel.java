package com.example.first.model;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by secret on 9/10/16.
 */
public class SumResultModel {
    private Activity activity;

    public SumResultModel(Activity activity) {
        this.activity = activity;
    }

    public int getSumResult() {
        Intent getIntent = activity.getIntent();
        int sum = getIntent.getIntExtra("sum", 0);
        return sum;
    }
}
