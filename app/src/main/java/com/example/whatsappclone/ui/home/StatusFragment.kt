package com.example.whatsappclone.ui.home

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsappclone.R
import com.example.whatsappclone.adapter.StatusAdapter
import com.example.whatsappclone.databinding.FragmentStatusBinding

/**
 * A simple [Fragment] subclass.
 * Use the [StatusFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StatusFragment : Fragment() {
    private lateinit var binding: FragmentStatusBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStatusBinding.inflate(layoutInflater)
        binding.statusList.adapter = StatusAdapter()
        binding.statusList.layoutManager = LinearLayoutManager(requireContext())
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.status_menu, menu)
    }

}