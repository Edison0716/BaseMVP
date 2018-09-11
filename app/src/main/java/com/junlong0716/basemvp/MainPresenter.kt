package com.junlong0716.basemvp

import android.util.Log
import javax.inject.Inject

class MainPresenter @Inject constructor(): BasePresenter<MainActivity, MainModel>() {
    fun doRequestData(){
        Log.d("DO_REQUEST_DATA","DO_REQUEST_DATA")
    }
}