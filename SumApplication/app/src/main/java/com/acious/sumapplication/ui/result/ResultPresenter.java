package com.acious.sumapplication.ui.result;

/**
 * Created by rokcc100 on 16. 9. 10.
 */
public class ResultPresenter implements ResultContract.UserActionListener {

    private ResultActivity mActivity;

    public ResultPresenter(ResultContract.View view) {
        this.mActivity = (ResultActivity) view;
    }

    @Override
    public void getResultNumFromMain() {
        int resultNum = mActivity.getIntent().getIntExtra("result", -1);
        mActivity.setResultNum(resultNum);
    }
}
