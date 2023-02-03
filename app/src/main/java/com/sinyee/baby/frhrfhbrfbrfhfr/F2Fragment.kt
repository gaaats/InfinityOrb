package com.sinyee.baby.frhrfhbrfbrfhfr

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.sinyee.baby.R
import com.sinyee.baby.databinding.FragmentF2Binding


class F2Fragment : Fragment() {
    private var fragmentF2Binding: FragmentF2Binding? = null
    private val binding
        get() = fragmentF2Binding ?: throw RuntimeException("FragmentF2Binding = null")


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
        fragmentF2Binding = FragmentF2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.dovn.setOnClickListener {
                findNavController().navigate(R.id.action_f2Fragment_to_BHbbbbFragment)
            }
            binding.right.setOnClickListener {
                findNavController().navigate(R.id.action_f2Fragment_to_AAAAFragment)
            }
            binding.top.setOnClickListener {
                findNavController().navigate(R.id.action_f2Fragment_to_AAAAFragment)
            }
            binding.left.setOnClickListener {
                requireActivity().onBackPressed()
            }



        } catch (e: Exception) {
            eeeeeeee()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        fragmentF2Binding = null
        super.onDestroy()
    }
}