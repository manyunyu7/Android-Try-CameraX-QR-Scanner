package com.feylabs.qrcodecamerax

import android.app.Application
import timber.log.Timber

open class Application : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}