package com.sinyee.baby

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sinyee.baby.vevveve.ViMod
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class MaaiaiainFragment : Fragment() {
    private lateinit var jgtijgtjgtjiogt: Context

    val gtgtjitgjgji by activityViewModel<ViMod>(named("MainModel"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maaiaiain, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        jgtijgtjgtjiogt=context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        gtgtjitgjgji.hyjuikkiik(jgtijgtjgtjiogt)

        gtjtgjgtjgtjoji()

    }

    private fun gtjtgjgtjgtjoji() {
        findNavController().navigate(R.id.action_maaiaiainFragment_to_connnnuuuuyFragment)
    }
}