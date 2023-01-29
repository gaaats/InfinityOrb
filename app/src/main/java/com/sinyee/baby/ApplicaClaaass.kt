package com.sinyee.baby

import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.sinyee.baby.cococnsnns.Util.ONESIGNAL_APP_IDgttggt
import com.sinyee.baby.cococnsnns.Util.instIdggttg
import com.sinyee.baby.cococnsnns.Util.mtKeygtgt
import com.sinyee.baby.cococnsnns.Util.myIdggtgt
import com.sinyee.baby.moooodlella.appModulegtgtgtgt
import com.sinyee.baby.moooodlella.frjgtgthgthigt
import io.branch.referral.Branch
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class ApplicaClaaass : Application() {


    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_IDgttggt)
        Branch.enableTestMode()
        Branch.getAutoInstance(this)

        val shPgttggt = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val settingsgtgtgt = getSharedPreferences("PREFS_NAME", 0)

        val gttghyhyhy = MyTracker.getTrackerParams()
        val trackerConfiggthyhy = MyTracker.getTrackerConfig()
        val gthyhyhy = MyTracker.getInstanceId(this)
        trackerConfiggthyhy.isTrackingLaunchEnabled = true
        val IDINgtgt = UUID.randomUUID().toString()

        if (settingsgtgtgt.getBoolean("my_first_time", true)) {
            gttghyhyhy.setCustomUserId(IDINgtgt)
            shPgttggt.edit().putString(myIdggtgt, IDINgtgt).apply()
            shPgttggt.edit().putString(instIdggttg, gthyhyhy).apply()
            settingsgtgtgt.edit().putBoolean("my_first_time", false).apply()
        } else {
            val gtgtgtIN = shPgttggt.getString(myIdggtgt, IDINgtgt)
            gttghyhyhy.setCustomUserId(gtgtgtIN)
        }
        MyTracker.initTracker(mtKeygtgt, this)

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