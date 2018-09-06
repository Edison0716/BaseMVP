package com.junlong0716.basemvp

import android.content.Context

/**
 * @author SmartSean Created on 2018/1/25 16:18.
 */

class BasePresenter<M : BaseModel, V : BaseView> : IPresenter {
    protected var mModel: M? = null

    protected var mView: V? = null

    val viewContext: Context?
        get() = null

    constructor(model: M, view: V) {
        mModel = model
        mView = view
    }

    constructor(view: V) {
        mView = view
    }

    override fun onDestroy() {
        if (mModel != null) {
            mModel!!.onDestroy()
        }
        this.mModel = null
        this.mView = null
    }
}
