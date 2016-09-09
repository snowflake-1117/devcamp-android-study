package com.example.first.presenter;

import android.app.Application;

/**
 * Created by secret on 9/10/16.
 */
public interface MainContract {
    interface View {

    }

    interface UserAction {
        void onResultButtonClick(Application application, int val1, int val2);
    }
}
