package com.acious.sumapplication.ui.result;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.acious.sumapplication.R;

import java.util.Locale;

public class ResultActivity extends AppCompatActivity implements ResultContract.View {

    private TextView mResultTextView;

    private ResultPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mPresenter = new ResultPresenter(this);

        initView();
        mPresenter.getResultNumFromMain();
    }

    public void initView() {
        mResultTextView = (TextView) findViewById(R.id.result_sum_txt);
    }

    public void setResultNum(int resultNum) {
        String resultText = String.format(Locale.KOREA, "Result: %d", resultNum);
        mResultTextView.setText(resultText);
    }
}
