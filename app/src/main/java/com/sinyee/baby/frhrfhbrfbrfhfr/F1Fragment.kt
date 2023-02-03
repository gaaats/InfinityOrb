package com.sinyee.baby.frhrfhbrfbrfhfr

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.sinyee.baby.R
import com.sinyee.baby.databinding.FragmentF1Binding


class F1Fragment : Fragment() {
    private var fragmentF1Binding: FragmentF1Binding? = null
    private val binding
        get() = fragmentF1Binding ?: throw RuntimeException("FragmentF1Binding = null")


    private fun eeeeeeee() {
        Snackbar.make(
            binding.root,
            "Error, error, error",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentF1Binding = FragmentF1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.btnTop.setOnClickListener {
                findNavController().navigate(R.id.action_f1Fragment_to_f2Fragment)
            }



        } catch (e: Exception) {
            eeeeeeee()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        fragmentF1Binding = null
        super.onDestroy()
    }
}