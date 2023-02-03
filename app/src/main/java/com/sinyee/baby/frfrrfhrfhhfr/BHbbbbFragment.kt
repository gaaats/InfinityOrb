package com.sinyee.baby.frfrrfhrfhhfr

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.DecelerateInterpolator
import android.view.animation.RotateAnimation
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.sinyee.baby.databinding.FragmentBHbbbbBinding
import kotlin.random.Random


class BHbbbbFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentBHbbbbBinding = FragmentBHbbbbBinding.inflate(inflater, container, false)
        return binding.root
    }


    private val gbghyhyhyhyhy = arrayOf(700, 1000, 100, 200, 500, 155, 80, 999, 777)
    private val hyhyjukikik = gbghyhyhyhyhy.clone()
    private val juukiikloolikikikki = 360 / gbghyhyhyhyhy.size
    private var hyjuujujhyhyhy = false
    private var ggg = false

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        try {

            dfeghjk()
            binding.btnSmall.setOnClickListener {
                if (!hyjuujujhyhyhy) {
                    frghj()
                    hyjuujujhyhyhy = true
                }
            }

            binding.btnBig.setOnClickListener {
                if (!ggg) {
                    frghj222()
                    ggg = true
                }
            }

        } catch (e: Exception) {
            fgthyhy555()
        }

        super.onViewCreated(view, savedInstanceState)
    }


    private var fragmentBHbbbbBinding: FragmentBHbbbbBinding? = null
    private val binding get() = fragmentBHbbbbBinding ?: throw RuntimeException("FragmentBHbbbbBinding = null")


    private fun frghj() {
        val winnerNumber = Random.nextInt(gbghyhyhyhyhy.size - 1)

        val needAddRotate = (360 - winnerNumber * juukiikloolikikikki).toFloat()
        val rotateAnimation = RotateAnimation(
            0f,
            (360f * gbghyhyhyhyhy.size) + needAddRotate,
            RotateAnimation.RELATIVE_TO_SELF,
            0.5f,
            RotateAnimation.RELATIVE_TO_SELF,
            0.5f
        )
        rotateAnimation.apply {
            duration = 1000
            fillAfter = true
            interpolator = DecelerateInterpolator()
            setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(p0: Animation?) {
                }

                override fun onAnimationEnd(p0: Animation?) {
                    val edfrgthjk = gbghyhyhyhyhy[winnerNumber]
                    Toast.makeText(
                        requireContext(),
                        "You winn $edfrgthjk$ points",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                    hyjuujujhyhyhy = false
                }

                override fun onAnimationRepeat(p0: Animation?) {
                }
            })
            binding.imgElfrgtgtgtgt.startAnimation(rotateAnimation)
        }
    }

    private fun frghj222() {
        val winnerNumber = Random.nextInt(gbghyhyhyhyhy.size - 1)

        val needAddRotate = (360 - winnerNumber * juukiikloolikikikki).toFloat()
        val rotateAnimation = RotateAnimation(
            0f,
            (360f * gbghyhyhyhyhy.size) + needAddRotate,
            RotateAnimation.RELATIVE_TO_SELF,
            0.5f,
            RotateAnimation.RELATIVE_TO_SELF,
            0.5f
        )
        rotateAnimation.apply {
            duration = 1000
            fillAfter = true
            interpolator = DecelerateInterpolator()
            setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(p0: Animation?) {
                }

                override fun onAnimationEnd(p0: Animation?) {
                    val edfrgthjk = gbghyhyhyhyhy[winnerNumber]
                    Toast.makeText(
                        requireContext(),
                        "You winn $edfrgthjk$ points",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                    ggg = false
                }

                override fun onAnimationRepeat(p0: Animation?) {
                }
            })
            binding.imgEl1.startAnimation(rotateAnimation)
        }
    }

    override fun onDestroy() {
        fragmentBHbbbbBinding = null
        super.onDestroy()
    }

    private fun dfeghjk() {
        for (i in gbghyhyhyhyhy.indices) {
            hyhyjukikik[i] = (i + 1) * juukiikloolikikikki
        }
    }




    private fun fgthyhy555() {
        frjrfrfjrjijrfjirfjrfjr()
        uhrfurhrfurhuhrhurf()
    }

    private fun uhrfurhrfurhuhrhurf() {
        requireActivity().onBackPressed()
    }

    private fun frjrfrfjrjijrfjirfjrfjr() {
        Snackbar.make(
            binding.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
    }
}