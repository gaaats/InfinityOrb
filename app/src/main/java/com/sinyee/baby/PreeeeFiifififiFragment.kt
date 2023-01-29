package com.sinyee.baby

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sinyee.baby.cococnsnns.Util.appsggttg
import com.sinyee.baby.vevveve.ViMod
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class PreeeeFiifififiFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_preeee_fiifififi, container, false)
    }

    val viewMainModelgttggt by activityViewModel<ViMod>(named("MainModel"))
    val sharePgtgtgt: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var gttggtamp: String
    private lateinit var mContextgttggt: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContextgttggt = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val checkFlyfggt = sharePgtgtgt.getString(appsggttg, null)
        val appsCampgtgt = sharePgtgtgt.getString("appCamp", null)

        if (checkFlyfggt=="1" &&appsCampgtgt == null) {
            viewMainModelgttggt.conversgtgtgtgt(mContextgttggt)
            viewMainModelgttggt.gttggthyhyhy.observe(viewLifecycleOwner) {
                if (it != null) {
                    gttggtamp = it.toString()
                    sharePgtgtgt.edit().putString("appCamp", gttggtamp).apply()
                    gjtojgtojgto()
                }
            }
        } else {
            gjtojgtojgto()
        }
    }

    private fun gjtojgtojgto() {
        findNavController().navigate(R.id.action_preeeeFiifififiFragment_to_fillllyllyylylFragment)
    }

}