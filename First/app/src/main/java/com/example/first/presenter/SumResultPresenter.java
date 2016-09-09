package com.example.first.presenter;

import android.app.Activity;

import com.example.first.model.SumResultModel;

/**
 * Created by secret on 9/10/16.
 */
public class SumResultPresenter implements SumResultContract.UserAction {
    private SumResultContract.View view;
    private SumResultModel model;

    public SumResultPresenter(SumResultContract.View view, Activity activity) {
        this.view = view;
        this.model = new SumResultModel(activity);
    }

    @Override
    public void sumResult() {
        view.setText("Result : " + model.getSumResult());
    }
}
