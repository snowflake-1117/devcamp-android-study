package com.example.first.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.first.R;
import com.example.first.presenter.MainContract;
import com.example.first.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    private EditText mValEdit1;
    private EditText mValEdit2;
    private MainContract.UserAction mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainPresenter = new MainPresenter(this);

        initView();
    }

    Button.OnClickListener plusResult = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.submit_button:
                    int val1 = Integer.parseInt(mValEdit1.getText().toString());
                    int val2 = Integer.parseInt(mValEdit2.getText().toString());

                    mMainPresenter.onResultButtonClick(val1, val2);
                    break;
                default:
                    break;
            }
        }
    };

    @Override
    public void initView() {
        mValEdit1 = (EditText) findViewById(R.id.val1_edit_text);
        mValEdit2 = (EditText) findViewById(R.id.val2_edit_text);

        findViewById(R.id.submit_button).setOnClickListener(plusResult);
    }

    @Override
    public void activityChange(int sum) {
        Intent sumResult = new Intent(getApplicationContext(), SumResult.class);
        sumResult.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        sumResult.putExtra("sum", sum);
        startActivity(sumResult);
    }
}
