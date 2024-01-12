package com.example.tom

import android.app.Application

class MyApplication : Application()
{
    companion object
    {
        lateinit var prefs: PreferenceUtil
    }

    override fun onCreate()
    {
        super.onCreate()
        prefs = PreferenceUtil(applicationContext)
    }
}