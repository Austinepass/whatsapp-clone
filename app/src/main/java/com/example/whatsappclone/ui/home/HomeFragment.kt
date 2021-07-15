package com.example.whatsappclone.ui.home

import android.os.Bundle
import android.view.*
import android.widget.Toolbar
import androidx.fragment.app.Fragment
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

        val tabLayout = binding!!.tabLayout
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = homeArray[position]
            when (position) {
                0 -> tab.setIcon(R.drawable.camera)
                1 -> {
                    binding!!.homeTb.inflateMenu(R.menu.chat_menu)
                }
                2 -> {
                    binding!!.homeTb.inflateMenu(R.menu.status_menu)
                }
                3 -> {
                    binding!!.homeTb.inflateMenu(R.menu.call_menu)
                }
            }
        }.attach()

        return binding!!.root
    }


}