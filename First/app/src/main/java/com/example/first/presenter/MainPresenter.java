package com.example.first.presenter;

import android.app.Application;

import com.example.first.model.MainModel;

/**
 * Created by secret on 9/10/16.
 */
public class MainPresenter implements MainContract.UserAction {
    private MainContract.View view;
    private MainModel model;

    public MainPresenter(MainContract.View view) {
        this.view = view;
        this.model = new MainModel();
    }

    @Override
    public void onResultButtonClick(Application application, int val1, int val2) {
        model.startActivity(application, val1, val2);
    }
}
