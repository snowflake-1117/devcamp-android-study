package com.example.first.view;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import com.example.first.R;
import com.example.first.presenter.SumResultContract;
import com.example.first.presenter.SumResultPresenter;

/**
 * Created by secret on 9/10/16.
 */
public class SumResult extends Activity implements SumResultContract.View {
    private TextView mSumResult;
    private SumResultContract.UserAction mSumResultPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sum_result_layout);

        mSumResultPresenter = new SumResultPresenter(this);

        initView();

        mSumResultPresenter.sumResult();
    }

    @Override
    public void initView() {
        mSumResult = (TextView) findViewById(R.id.sum_result);
    }

    @Override
    public void setText(String text) {
        mSumResult.setText(text);

        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.N)
            mSumResult.setTextColor(Color.RED);
        else if (Build.VERSION.SDK_INT == Build.VERSION_CODES.LOLLIPOP)
            mSumResult.setTextColor(Color.BLUE);
        else if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP)
            mSumResult.setTextColor(Color.GREEN);
    }
}
