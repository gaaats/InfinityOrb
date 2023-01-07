package com.sinyee.baby

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.sinyee.baby.databinding.FragmentBBBBBinding
import kotlinx.coroutines.delay
import kotlin.random.Random

class BBBBFragment : Fragment() {
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
        fragmentBBBBBinding = FragmentBBBBBinding.inflate(inflater, container, false)
        return binding.root
    }

    private var fragmentBBBBBinding: FragmentBBBBBinding? = null
    private val binding
        get() = fragmentBBBBBinding ?: throw RuntimeException("FragmentBBBBBinding = null")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            lifecycleScope.launchWhenCreated {
                val num = Random.nextInt(from = 10, until = 100)
                Toast.makeText(
                    requireContext(),
                    "You team is ${names.random()}.Earned $num points",
                    Toast.LENGTH_SHORT
                ).show()
                delay(2500)
                hkyhykhkykhy()
            }

        } catch (e: Exception) {
            efrfrgtgttg5()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        fragmentBBBBBinding = null
        super.onDestroy()
    }

    private fun efrfrgtgttg5() {
        Toast.makeText(
            requireContext(),
            "Error 656...",
            Toast.LENGTH_SHORT
        ).show()
        hkyhykhkykhy()
    }

    private fun hkyhykhkykhy() {
        requireActivity().onBackPressed()
    }
}