package com.example.first.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.first.R;
import com.example.first.presenter.MainContract;
import com.example.first.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    private EditText valEdit1;
    private EditText valEdit2;
    private MainContract.UserAction presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);

        valEdit1 = (EditText) findViewById(R.id.val1);
        valEdit2 = (EditText) findViewById(R.id.val2);

        findViewById(R.id.submit_button).setOnClickListener(plusResult);
    }

    Button.OnClickListener plusResult = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.submit_button:
                    int val1 = Integer.parseInt(valEdit1.getText().toString());
                    int val2 = Integer.parseInt(valEdit2.getText().toString());

                    presenter.onResultButtonClick(getApplication(), val1, val2);
                    break;
                default:
                    break;
            }
        }
    };
}
