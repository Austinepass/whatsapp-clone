package com.example.whatsappclone.utils

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.whatsappclone.ui.home.CallsFragment
import com.example.whatsappclone.ui.home.CameraFragment
import com.example.whatsappclone.ui.home.ChatFragment
import com.example.whatsappclone.ui.home.StatusFragment

class HomePagerAdapter (fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        // Return a NEW fragment instance in createFragment(int)
        return when (position) {
            0 -> CameraFragment()
            1 -> ChatFragment()
            2 -> StatusFragment()
            else -> CallsFragment()
        }
    }
}