package com.acious.sumapplication.ui.result;

/**
 * Created by rokcc100 on 16. 9. 10.
 */
public interface ResultContract {
    interface View {
        void initView();

        void setResultNum(int resultNum);
    }

    interface UserActionListener {
        void getResultNumFromMain();
    }
}
