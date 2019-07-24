package com.putrarw.indonesiancalender.activity

import android.content.Context
import android.support.v7.app.AppCompatActivity
import com.putrarw.indonesiancalender.helper.LocaleHelper
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper

/**
 * Created by putrarolli on 2019-07-24.
 */
open class BaseActivity: AppCompatActivity() {

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(LocaleHelper.onAttach(newBase, "id")))

    }
}