package com.sinyee.baby

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.sinyee.baby.databinding.FragmentAAAABinding


class AAAAFragment : Fragment() {
    private val names = listOf(
        "Raa",
        "Cleo",
        "Gleo",
        "Aresa",
        "Aphina",
        "Eva",
        "Olivia",
        "Emma",
        "Charlotte",
        "Amelia",
        "Ava",
        "Sophia",
        "Isabella",
        "Mia",
        "Evelyn",
        "Harper",
        "Raya",
        "Wrenley",
        "Angelique",
        "Vida",
        "Emberlynn",
        "Flora",
        "Murphy",
        "Arleth",
        "Ocean",
        "Oakleigh",
        "Freyja",
        "Mylah",
        "Taytum",
        "Elia",
        "Jaylani",
        "Zayla",
        "Navy",
        "Della",
        "Clover",
        "Nyra",
        "Olivia",
        "Emma",
        "Charlotte",
        "Amelia",
        "Ava",
        "Sophia",
        "Isabella",
        "Mia",
        "Evelyn",
        "Harper",
        "Luna",
        "Camila",
        "Gianna",
        "Elizabeth",
        "Eleanor",
        "Ella",
        "Abigail",
        "Sofia",
        "Avery",
        "Scarlett",
        "Emily",
        "Aria",
        "Penelope",
        "Chloe",
        "Layla"
    ).shuffled()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentAAAABinding = FragmentAAAABinding.inflate(inflater, container, false)
        return staaartBinding.root
    }

    private var fragmentAAAABinding: FragmentAAAABinding? = null
    private val staaartBinding get() = fragmentAAAABinding ?: throw RuntimeException("FragmentAAAABinding = null")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            staaartBinding.tvTeam1.text = names.random()
            staaartBinding.tvTeam2.text = names.random()

            staaartBinding.imgEl1.setOnClickListener {
                gtkgtkgtktg()
            }
            staaartBinding.imgEl2.setOnClickListener {
                gtkgtkgtktg()
            }

        } catch (e: Exception){
            efrfrgtgttg5()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun gtkgtkgtktg() {
        findNavController().navigate(R.id.action_AAAAFragment_to_BBBBFragment)
    }

    override fun onDestroy() {
        fragmentAAAABinding = null
        super.onDestroy()
    }

    private fun efrfrgtgttg5() {
        Toast.makeText(
            requireContext(),
            "Error 888...",
            Toast.LENGTH_SHORT
        ).show()
        hkyhykhkykhy()
    }

    private fun hkyhykhkykhy() {
        requireActivity().onBackPressed()
    }
}