package com.sinyee.baby.frhrfhbrfbrfhfr

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
import com.sinyee.baby.frhiuuggfrfgugfrgyrf.GamerActivity
import com.sinyee.baby.R
import com.sinyee.baby.vevveve.frhrfuihfrihhrfhihfr.VebVActivity
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.PAAPAPAPAgtgt
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.gngtjgtngtgtnktg
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.appsggttg
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.hjohyjhyjjohyj
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.gtigtgtjigt
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.geoCogtgt
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.instIdggttg
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.gtgtjgtjojgtjigtjjgti
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.hyjuikkiikikkiki
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.gthhyhyhyhyhyhy
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.hyhykhyohykhykhyk
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.gtngtingtgtgtgth
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.gthyhyhy55j55
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.ggtigtiuhgth
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.gttggtgthy
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.gtgttgjhyjjihy
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.gtgthyhyhyhy
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.urlMaingttgtg
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
        val gthyhyyh = gtghgthuhgt.getString(geoCogtgt, null)
        val appCampgttggt = gtghgthuhgt.getString("appCamp", null)
        val deepStgtgt = gtghgthuhgt.getString("deepSt", null)

        val ghuigigtt = Intent(activity, VebVActivity::class.java)
        val gthyyjuuj = Intent(activity, GamerActivity::class.java)

        val hhujujujuj = gtghgthuhgt.getString(gtigtgtjigt, null)
        val hyhyjuujuj = gtghgthuhgt.getString(appsggttg, null)
        val rfgrirfhirf = gtghgthuhgt.getString(urlMaingttgtg, null)
        val frfrgufrgfrgfr = gtghgthuhgt.getString("mainId", null)
        val ngkbjgtthugth = PAAPAPAPAgtgt
        val gtgtihgtihgthigt = Build.VERSION.RELEASE
        val gfriihigthigt = gtghgthuhgt.getString(gthhyhyhyhyhyhy, null)
        val gtngjkthgthugti: String? = gtghgthuhgt.getString(instIdggttg, null)



        val gthigtihigthugti = AppsFlyerLib.getInstance().getAppsFlyerUID(gtjgthiigtigthugt)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        gtghgthuhgt.edit().putString(hjohyjhyjjohyj, gthigtihigthugti).apply()

        Log.d("lolo", "count ${gthyhyyh}")
        Log.d("lolo", "countryDev ${hhujujujuj}")
        Log.d("lolo", "apps ${hyhyjuujuj}")

        val vfbggtuigthgthu = "$rfgrirfhirf$gttggtgthy$appCampgttggt&$gtngtingtgtgtgth$gthigtihigthugti&$gngtjgtngtgtnktg$frfrgufrgfrgfr&$ggtigtiuhgth$ngkbjgtthugth&$gthyhyhy55j55$gtgtihgtihgthigt&$gtgttgjhyjjihy$hyhykhyohykhykhyk"
        val ghgtihgthhgt = "$rfgrirfhirf$gtngtingtgtgtgth$gfriihigthigt&$gngtjgtngtgtnktg$gtngjkthgthugti&$ggtigtiuhgth$ngkbjgtthugth&$gthyhyhy55j55$gtgtihgtihgthigt&$gtgttgjhyjjihy$hyhykhyohykhykhyk"
        val vfbfgrfyfryyfrfr = "$rfgrirfhirf$gttggtgthy$deepStgtgt&$gtngtingtgtgtgth$gthigtihigthugti&$gngtjgtngtgtnktg$frfrgufrgfrgfr&$ggtigtiuhgth$ngkbjgtthugth&$gthyhyhy55j55$gtgtihgtihgthigt&$gtgttgjhyjjihy$gtgthyhyhyhy"
        val vnggtgthgthgthugt = "$rfgrirfhirf$gttggtgthy$deepStgtgt&$gtngtingtgtgtgth$gfriihigthigt&$gngtjgtngtgtnktg$gtngjkthgthugti&$ggtigtiuhgth$ngkbjgtthugth&$gthyhyhy55j55$gtgtihgtihgthigt&$gtgttgjhyjjihy$gtgthyhyhyhy"

        when(hyhyjuujuj) {
            "1" ->
                if(appCampgttggt!!.contains(gtgtjgtjojgtjigtjjgti)) {
                    gtghgthuhgt.edit().putString(hyjuikkiikikkiki, vfbggtuigthgthu).apply()
                    gtghgthuhgt.edit().putString("WebInt", "campaign").apply()
                    startActivity(ghuigigtt)
                    activity?.finish()
                } else if (deepStgtgt!=null||hhujujujuj!!.contains(gthyhyyh.toString())) {
                    gtghgthuhgt.edit().putString(hyjuikkiikikkiki, vfbfgrfyfryyfrfr).apply()
                    gtghgthuhgt.edit().putString("WebInt", "deepLink").apply()
                    startActivity(ghuigigtt)
                    activity?.finish()
                } else {
                    startActivity(gthyyjuuj)
                    activity?.finish()
                }
            "0" ->
                if(deepStgtgt!=null) {
                    gtghgthuhgt.edit().putString(hyjuikkiikikkiki, vnggtgthgthgthugt).apply()
                    gtghgthuhgt.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(ghuigigtt)
                    activity?.finish()
                } else if (hhujujujuj!!.contains(gthyhyyh.toString())) {
                    gtghgthuhgt.edit().putString(hyjuikkiikikkiki, ghgtihgthhgt).apply()
                    gtghgthuhgt.edit().putString("WebInt", "geo").apply()
                    startActivity(ghuigigtt)
                    activity?.finish()
                } else {
                    startActivity(gthyyjuuj)
                    activity?.finish()
                }
        }
    }

    private lateinit var gtjgthiigtigthugt: Context
    val gtghgthuhgt: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        gtjgthiigtigthugt = context
    }

}