package com.junlong0716.basemvp;

import android.os.Bundle;

import javax.inject.Inject;

public abstract class BasePresenter<A extends BaseActivity, M extends BaseModel> {
    protected A mActivity;
    @Inject
    protected M mModel;

    public void setActivity(A activity) {
        this.mActivity = activity;
    }

    @Inject
    public void setPresenter() {
        this.mModel.setPresenter(this);
    }

    public void onCreate(Bundle savedInstanceState) {

    }
}
