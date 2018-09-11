package com.junlong0716.basemvp

import dagger.Component

@Component
interface MainComponent{
    fun inject(mainActivity: MainActivity)
}