package com.example.androidbase.mvp;

import android.graphics.Color;
import android.os.Bundle;

import com.example.androidbase.ActivityTask;
import com.example.androidbase.BaseActivity;

public abstract class MvpActivity<P extends BasePresenter> extends BaseActivity {
    protected P mvpPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mvpPresenter = createPresenter();
        super.onCreate(savedInstanceState);
    }

    protected abstract P createPresenter();

    @Override
    protected void onDestroy() {
        ActivityTask.getInstanse().removeActivity(this);
        if (mvpPresenter != null) {
            mvpPresenter.detachView();
        }
        super.onDestroy();
    }
}
