package com.diyorbek.bottomnavigationh1.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.diyorbek.bottomnavigationh1.databinding.ItemLayoutBinding
import com.diyorbek.bottomnavigationh1.model.Exercise

class RvAdapter : RecyclerView.Adapter<RvAdapter.ExViewHolder>() {
    lateinit var exList: List<Exercise>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExViewHolder {
        return ExViewHolder(
            ItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ExViewHolder, position: Int) {
        holder.bind(exList[position])
    }

    override fun getItemCount(): Int {
        return exList.size
    }

    inner class ExViewHolder(private val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(exercise: Exercise) {
            binding.exName.text = exercise.exName
            binding.exImage.setImageResource(exercise.exImg)
            binding.backGroundColor.setCardBackgroundColor(exercise.backColor)
        }
    }
}