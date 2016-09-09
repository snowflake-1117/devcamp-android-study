package com.example.first.presenter;

/**
 * Created by secret on 9/10/16.
 */
public interface SumResultContract {
    interface View {
        void setText(String text);
    }

    interface UserAction {
        void sumResult();
    }
}
