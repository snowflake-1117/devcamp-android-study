package com.example.first.presenter;

import com.example.first.model.MainModel;

/**
 * Created by secret on 9/10/16.
 */
public class MainPresenter implements MainContract.UserAction {
    private MainContract.View mMainView;
    private MainModel mMainModel;

    public MainPresenter(MainContract.View view) {
        this.mMainView = view;
        this.mMainModel = new MainModel();
    }

    @Override
    public void onResultButtonClick(int val1, int val2) {
        mMainView.activityChange(mMainModel.getSumData(val1, val2));
    }
}
