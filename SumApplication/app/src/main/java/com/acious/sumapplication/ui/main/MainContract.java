package com.acious.sumapplication.ui.main;

/**
 * Created by rokcc100 on 16. 9. 10.
 */
public interface MainContract {
    interface View {
        void initView();

        void clickSumButton(android.view.View view);

        void moveToResultActivity(int resultNum);
    }

    interface UserActionListener {
        void sumNums(String num1, String num2);
    }
}
