package com.junlong0716.basemvp

import android.os.Bundle

class MainActivity : BaseActivity<MainPresenter>() {
    override fun bindingDagger2(savedInstanceState: Bundle?) {
        DaggerMainComponent.create().inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mPresenter.doRequestData()
    }
}
