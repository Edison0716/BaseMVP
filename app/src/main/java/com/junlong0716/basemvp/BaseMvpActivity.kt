package com.junlong0716.basemvp

import android.support.v7.app.AppCompatActivity

import javax.inject.Inject

abstract class BaseMvpActivity<P : BasePresenter<*, *>> : AppCompatActivity() {
    @Inject
    private var mPresenter: P? = null
    override fun onDestroy() {
        super.onDestroy()
        if (null != mPresenter) {
            mPresenter!!.onDestroy()
        }
        this.mPresenter = null
    }
}
