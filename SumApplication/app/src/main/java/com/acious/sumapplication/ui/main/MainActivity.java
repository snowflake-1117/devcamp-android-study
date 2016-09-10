package com.acious.sumapplication.ui.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.acious.sumapplication.R;
import com.acious.sumapplication.ui.result.ResultActivity;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private EditText mNumEditText1;
    private EditText mNumEditText2;

    private MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainPresenter = new MainPresenter(this);

        initView();
    }

    public void initView() {
        mNumEditText1 = (EditText) findViewById(R.id.main_one_num_edittxt);
        mNumEditText2 = (EditText) findViewById(R.id.main_two_num_edittxt);
    }

    public void clickSumButton(View view) {
        mMainPresenter.sumNums(mNumEditText1.getText().toString(), mNumEditText2.getText().toString());
    }

    public void moveToResultActivity(int resultNum) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", resultNum);
        startActivity(intent);
    }
}
