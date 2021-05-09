package com.example.whatsappclone.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.whatsappclone.R
import com.example.whatsappclone.databinding.FragmentHomeBinding
import com.example.whatsappclone.homeArray
import com.example.whatsappclone.utils.HomePagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    private var binding: FragmentHomeBinding? = null
    private lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater)
        viewPager = binding!!.pager
        viewPager.adapter = HomePagerAdapter(this)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tabLayout = binding!!.tabLayout
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = homeArray[position]
            if (position == 0) {
                tab.setIcon(R.drawable.camera)
            }
        }.attach()

    }

}