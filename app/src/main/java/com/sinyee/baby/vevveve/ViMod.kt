package com.sinyee.baby.vevveve

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AFInAppEventParameterName
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.sinyee.baby.apiii.CountryCodeJSgttg
import com.sinyee.baby.apiii.CountryRepogtgtgt
import com.sinyee.baby.apiii.DevRepogthyyuyh
import com.sinyee.baby.apiii.GeoDevgtgtgt
import com.sinyee.baby.cococnsnns.Util.APAPAPAPAPSgtgtgt
import io.branch.referral.util.BRANCH_STANDARD_EVENT
import io.branch.referral.util.BranchEvent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class ViMod(
    private val gthgthiugt: CountryRepogtgtgt,
    private val hyhyhyhy: DevRepogthyyuyh,
    private val shPgtgtgt: SharedPreferences,
    val applicationgttggt: Application
) : ViewModel() {


    private val gttgjigtgt = MutableLiveData<CountryCodeJSgttg>()
    val gntkgtnnjtg: LiveData<CountryCodeJSgttg>
        get() = gttgjigtgt

    private val gtgtjiogti = MutableLiveData<GeoDevgtgtgt>()
    val geoggtgt: LiveData<GeoDevgtgtgt>
        get() = gtgtjiogti

    private val gtgthyhyyhjuju = MutableLiveData<String>()
    val gttggthyhyhy: LiveData<String>
        get() = gtgthyhyyhjuju


    init {
        viewModelScope.launch(Dispatchers.IO) {
            ghyhynjhyjhyj()
        }
        viewModelScope.launch(Dispatchers.Main) {
            getDatagtgtgt()
        }
    }

    private val _mainIdgtgtgt = MutableLiveData<String?>()
    val mainIdgtgtgt: LiveData<String?>
        get() = _mainIdgtgtgt


    suspend fun getDatagtgtgt() {
        gttgjigtgt.postValue(gthgthiugt.getDat().body())
        getDevDatagtgtgt()
    }

    suspend fun getDevDatagtgtgt() {
        gtgtjiogti.postValue(hyhyhyhy.getDataDev().body())
    }

    fun conversgtgtgtgt(contgtgtgt: Context) {
        AppsFlyerLib.getInstance()
            .init(APAPAPAPAPSgtgtgt, gtjiohjohyojiy, applicationgttggt)
        AppsFlyerLib.getInstance().start(contgtgtgt)
    }

    fun hyjuikkiik(ghy55: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            ghy55
        ) { data: AppLinkData? ->
            data?.let {
                val deepDatagtgtgt = data.targetUri?.host.toString()
                shPgtgtgt.edit().putString("deepSt", deepDatagtgtgt).apply()
            }
        }
    }

    private val gtjiohjohyojiy = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val gtngtkngtl = data?.get("campaign").toString()
            gtgthyhyyhjuju.postValue(gtngtkngtl)

            when (data?.get(AFInAppEventParameterName.AF_CHANNEL).toString()) {
                "ACI_Search" -> {
                    BranchEvent(BRANCH_STANDARD_EVENT.ACHIEVE_LEVEL).setDescription("ACI_Search")
                        .logEvent(applicationgttggt.applicationContext)

                }
                "ACI_Youtube" -> {
                    BranchEvent(BRANCH_STANDARD_EVENT.SHARE).setDescription("ACI_Youtube")
                        .logEvent(applicationgttggt.applicationContext)

                }
                "ACI_Display" -> {
                    BranchEvent(BRANCH_STANDARD_EVENT.RATE).setDescription("ACI_Display")
                        .logEvent(applicationgttggt.applicationContext)

                }

                else -> {


                    BranchEvent(BRANCH_STANDARD_EVENT.VIEW_AD).setDescription("NoChannel")
                        .logEvent(applicationgttggt.applicationContext)
                    Log.d("Branch Check", "I'm here, branch bitch! No source though")
                }

            }

        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {
        }

        override fun onAttributionFailure(error: String?) {
        }
    }


    fun ghyhynjhyjhyj() {
        val hyujjuuj = AdvertisingIdClient(applicationgttggt)
        hyujjuuj.start()
        val hyhyhyhyefrrf = hyujjuuj.info.id.toString()
        _mainIdgtgtgt.postValue(hyhyhyhyefrrf)
    }

}