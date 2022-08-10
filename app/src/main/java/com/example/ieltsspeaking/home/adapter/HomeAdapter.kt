package com.example.ieltsspeaking.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ieltsspeaking.databinding.ItemsRvHomeBinding
import com.example.ieltsspeaking.home.model.ModelHome

class HomeAdapter(private val modelHome: List<ModelHome>) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    private lateinit var homeListener: OnItemClickListener

    interface OnItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: OnItemClickListener){
        homeListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
      val itemView = ItemsRvHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewHolder(itemView, homeListener)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bindView(modelHome[position])
    }

    override fun getItemCount() = modelHome.size

    inner class HomeViewHolder(private val binding: ItemsRvHomeBinding, listener: OnItemClickListener) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindView(modelHome: ModelHome){
            binding.tvTitleItemsRV.text = modelHome.title
            binding.icInsideOval.setImageResource(modelHome.icon)
            binding.ivBackgroundOval.setImageResource(modelHome.backgroundColor)
        }

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }
}