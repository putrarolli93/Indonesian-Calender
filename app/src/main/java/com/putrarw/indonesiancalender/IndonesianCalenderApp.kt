package com.putrarw.indonesiancalender

import android.support.multidex.MultiDex
import android.support.multidex.MultiDexApplication

/**
 * Created by putrarolli on 2019-07-24.
 */
class IndonesianCalenderApp: MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        MultiDex.install(this)
    }

}