package com.junlong0716.basemvp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {
    @Inject
    protected P mPresenter;
    private Activity mActivity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) throws RuntimeException {
        super.onCreate(savedInstanceState);
        bindingDagger2(savedInstanceState);
        if (this.mPresenter == null) {
            throw new RuntimeException("没有设置Presenter或者没有重写onCreate()方法");
        } else {
            mActivity = this;
            this.mPresenter.setActivity(this);
            this.mPresenter.onCreate(savedInstanceState);
        }
    }
    protected abstract void bindingDagger2(Bundle savedInstanceState);
}
