package com.junlong0716.basemvp;

public abstract class BaseModel<P extends BasePresenter> {
    protected P mPresenter;

    public void setPresenter(P presenter) {
        mPresenter = presenter;
    }
}
