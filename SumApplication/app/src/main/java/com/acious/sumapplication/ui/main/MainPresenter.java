package com.acious.sumapplication.ui.main;

/**
 * Created by rokcc100 on 16. 9. 10.
 */
public class MainPresenter implements MainContract.UserActionListener {

    private MainActivity mActivity;

    public MainPresenter(MainContract.View view) {
        this.mActivity = (MainActivity) view;
    }

    @Override
    public void sumNums(String num1, String num2) {
        int firstNum = Integer.parseInt(num1);
        int secondNum = Integer.parseInt(num2);

        mActivity.moveToResultActivity(firstNum + secondNum);
    }
}
