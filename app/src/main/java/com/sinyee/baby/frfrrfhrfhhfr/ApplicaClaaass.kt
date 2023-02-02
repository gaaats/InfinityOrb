package com.sinyee.baby.frfrrfhrfhhfr

import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.gtyhujjuikikikikki
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.instIdggttg
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.gthyhyhyhyhyhy
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.gthhyhyhyhyhyhy
import com.sinyee.baby.moooodlella.appModulegtgtgtgt
import com.sinyee.baby.moooodlella.frjgtgthgthigt
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class ApplicaClaaass : Application() {


    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(gtyhujjuikikikikki)

        val gtgthigtihgthhgt = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val hyhyjujukiik5 = getSharedPreferences("PREFS_NAME", 0)

        val gttghyhyhy = MyTracker.getTrackerParams()
        val trackerConfiggthyhy = MyTracker.getTrackerConfig()
        val gthyhyhy = MyTracker.getInstanceId(this)
        trackerConfiggthyhy.isTrackingLaunchEnabled = true
        val IDINgtgt = UUID.randomUUID().toString()

        if (hyhyjujukiik5.getBoolean("my_first_time", true)) {
            gttghyhyhy.setCustomUserId(IDINgtgt)
            gtgthigtihgthhgt.edit().putString(gthhyhyhyhyhyhy, IDINgtgt).apply()
            gtgthigtihgthhgt.edit().putString(instIdggttg, gthyhyhy).apply()
            hyhyjujukiik5.edit().putBoolean("my_first_time", false).apply()
        } else {
            val gtgtgtIN = gtgthigtihgthhgt.getString(gthhyhyhyhyhyhy, IDINgtgt)
            gttghyhyhy.setCustomUserId(gtgtgtIN)
        }
        MyTracker.initTracker(gthyhyhyhyhyhy, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@ApplicaClaaass)
            modules(
                listOf(
                    frjgtgthgthigt, appModulegtgtgtgt
                )
            )
        }
    }
}