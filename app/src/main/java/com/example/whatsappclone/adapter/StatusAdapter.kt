package com.example.whatsappclone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsappclone.databinding.StatusItemBinding

class StatusAdapter : RecyclerView.Adapter<StatusAdapter.StatusViewHolder>() {
    class StatusViewHolder(binding: StatusItemBinding): RecyclerView.ViewHolder(binding.root){
        val img = binding.chatImg
        val name = binding.nameTv
        val date = binding.statusDateTv

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusViewHolder {
        val view = StatusItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StatusViewHolder(view)
    }

    override fun onBindViewHolder(holder: StatusViewHolder, position: Int) {
        holder.name.text = "Austine"
    }

    override fun getItemCount(): Int {
      return 10
    }
}