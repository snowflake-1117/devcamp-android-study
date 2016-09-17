package com.example.first.presenter;

/**
 * Created by secret on 9/10/16.
 */
public interface MainContract {
    interface View {
        void initView();
        void activityChange(int sum);
    }

    interface UserAction {
        void onResultButtonClick(int val1, int val2);
    }
}
