package com.example.whatsappclone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsappclone.Onboard
import com.example.whatsappclone.databinding.SliderLayoutBinding

/**
 * An adapter class for the viewPager items
 * @param itemsCount number of items to be displayed
 */

class PagerAdapter(private val sliderObject : Array<Onboard>) : RecyclerView.Adapter<PagerAdapter.ViewHolder>() {


    class ViewHolder(binding: SliderLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        val image = binding.sliderImage
        val bigText = binding.sliderBigTv
        val smallText = binding.sliderSmallTv
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            SliderLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(sliderObject[position].image)
        holder.smallText.text = sliderObject[position].small
        holder.bigText.text = sliderObject[position].big
    }

    override fun getItemCount() = sliderObject.size
}
