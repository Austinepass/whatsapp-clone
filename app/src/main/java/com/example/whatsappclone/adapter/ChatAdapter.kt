package com.example.whatsappclone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsappclone.R
import com.example.whatsappclone.databinding.ChatItemBinding

class ChatAdapter() : RecyclerView.Adapter<ChatAdapter.ViewHolder>() {

    class ViewHolder(binding: ChatItemBinding) : RecyclerView.ViewHolder(binding.root){
        val chatImg = binding.chatImg
        val count = binding.msgCountTv
        val status = binding.msgStatusTv
        val msg = binding.msgTv
        val name = binding.nameTv
        val time = binding.timeTv
        //Need to create a ChatList data class later

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val itemView =
           ChatItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //holder.chatImg.setImageResource(R.drawable.group)
        holder.count.text = 3.toString()
    }

    override fun getItemCount(): Int {
        return 10
    }
}