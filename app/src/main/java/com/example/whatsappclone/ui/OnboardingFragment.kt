package com.example.whatsappclone.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.whatsappclone.adapter.PagerAdapter
import com.example.whatsappclone.R
import com.example.whatsappclone.databinding.FragmentOnboardingBinding
import com.example.whatsappclone.onboardArray

/**
 * A simple [Fragment] subclass.
 * Use the [OnboardingFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

class OnboardingFragment : Fragment() {
    private var binding: FragmentOnboardingBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnboardingBinding.inflate(inflater)

        //Set up viewpager, the adapter, and hook it up with a third party indicator
        val viewpager = binding!!.slider
        val mAdapter = PagerAdapter(onboardArray)
        viewpager.adapter = mAdapter
        binding!!.indicator.setViewPager(viewpager)
        // optional
        mAdapter.registerAdapterDataObserver(binding!!.indicator.adapterDataObserver)

        binding!!.nextBtn.setOnClickListener {
            findNavController().navigate(R.id.authFragment)
        }
        return binding!!.root
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}