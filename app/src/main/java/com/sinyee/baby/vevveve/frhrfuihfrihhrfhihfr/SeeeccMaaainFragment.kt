package com.sinyee.baby.vevveve.frhrfuihfrihhrfhihfr

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sinyee.baby.R
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.gtigtgtjigt
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.urlMaingttgtg
import com.sinyee.baby.vevveve.JIOFjrhfrhhfrhfrhrfu
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named

class SeeeccMaaainFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_seeecc_maaain, container, false)
    }

    val viewMainModelgttg by activityViewModel<JIOFjrhfrhhfrhfrhrfu>(named("MainModel"))
    lateinit var countryDevgtgtgt: String
    lateinit var wvgtggt: String
    lateinit var appsgtgttg: String
    private lateinit var mContextgtgt: Context

    val ghyhyhy: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContextgtgt = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewMainModelgttg.mainIdgtgtgt.observe(viewLifecycleOwner) {
            if (it != null) {
                val maingthyhy = it.toString()
                ghyhyhy.edit().putString("mainId", maingthyhy).apply()
            }
        }

        viewMainModelgttg.geoggtgt.observe(viewLifecycleOwner) {
            if (it != null) {
                countryDevgtgtgt = it.geoD
                appsgtgttg = it.appsCheckerD
                wvgtggt = it.viewD

                ghyhyhy.edit().putString(gtigtgtjigt, countryDevgtgtgt).apply()
                ghyhyhy.edit().putString(Jifhrfihrfhhfrhrf.appsggttg, appsgtgttg).apply()
                ghyhyhy.edit().putString(urlMaingttgtg, wvgtggt).apply()

                gtgthtgtigt()
            }
        }
    }

    private fun gtgthtgtigt() {
        findNavController().navigate(R.id.action_seeeccMaaainFragment_to_preeeeFiifififiFragment)
    }
}