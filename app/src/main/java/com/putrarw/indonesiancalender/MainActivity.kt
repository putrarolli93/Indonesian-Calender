package com.putrarw.indonesiancalender

import android.os.Bundle
import com.putrarw.indonesiancalender.activity.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calendarView.firstDayOfWeek = 2
    }
}
