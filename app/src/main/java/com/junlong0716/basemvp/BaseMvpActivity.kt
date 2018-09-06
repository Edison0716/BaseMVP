package com.junlong0716.basemvp

import android.support.v7.app.AppCompatActivity

import javax.inject.Inject

/**
 * @author SmartSean Created on 2018/1/25 16:24.
 */

abstract class BaseMvpActivity<P : BasePresenter<*, *>> : AppCompatActivity() {
    @Inject
    protected var mPresenter: P? = null
    override fun onDestroy() {
        super.onDestroy()
        if (null != mPresenter) {
            mPresenter!!.onDestroy()
        }
        this.mPresenter = null
    }
}
