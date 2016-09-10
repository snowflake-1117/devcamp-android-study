package com.example.first.presenter;

import com.example.first.model.SumResultModel;
import com.example.first.view.SumResult;

/**
 * Created by secret on 9/10/16.
 */
public class SumResultPresenter implements SumResultContract.UserAction {
    private SumResultContract.View mSumResultView;
    private SumResult mSumResultActivity;
    private SumResultModel mSumResultModel;

    public SumResultPresenter(SumResultContract.View view) {
        this.mSumResultView = view;
        this.mSumResultActivity = (SumResult) view;
        this.mSumResultModel = new SumResultModel();
    }

    @Override
    public void sumResult() {
        mSumResultView.setText("Result : " + mSumResultActivity.getIntent().getIntExtra("sum", 0));
    }
}
