package com.junlong0716.basemvp
import android.content.Context

class BasePresenter<M : BaseModel, V : BaseView> : IPresenter {
    private var mModel: M? = null

    private var mView: V? = null

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
