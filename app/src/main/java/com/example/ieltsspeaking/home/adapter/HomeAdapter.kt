package com.example.ieltsspeaking.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.databinding.ItemsRvHomeBinding
import com.example.ieltsspeaking.home.model.ModelHome

class HomeAdapter() : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {
//    lateinit var listener: (ModelHome) -> Unit

    private lateinit var mListener: onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener){
        mListener = listener
    }

    private val titleHome = arrayOf(
        "Full test",
        "Cue Cards",
        "Part 1 Topic",
        "Part 2 & 3 Topics",
        "Vocabulary",
        "Tips",
        "Video answer",
        "Band calculation",
        "Info",
        "About"
    )

    private val iconHome = arrayOf(
        R.drawable.ic_menu,
        R.drawable.ic_card,
        R.drawable.ic_part1,
        R.drawable.ic_part2_3,
        R.drawable.ic_vocabulary,
        R.drawable.ic_tips,
        R.drawable.ic_video_answer,
        R.drawable.ic_band_calc,
        R.drawable.ic_info,
        R.drawable.ic_about
    )

    private val backgroundHome = arrayOf(
        R.drawable.bg_full_test,
        R.drawable.bg_card,
        R.drawable.bg_part1,
        R.drawable.bg_part2_3,
        R.drawable.bg_vocabulary,
        R.drawable.bg_tips,
        R.drawable.bg_video_answer,
        R.drawable.bg_calc,
        R.drawable.bg_info,
        R.drawable.bg_about
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
      val itemView = ItemsRvHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewHolder(itemView, mListener)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.apply {
            binding.tvTitleItemsRV.text = titleHome[position]
            binding.icInsideOval.setImageResource(iconHome[position])
            binding.ivBackgroundOval.setImageResource(backgroundHome[position])

        }
    }

    override fun getItemCount() = 10

    inner class HomeViewHolder(val binding: ItemsRvHomeBinding, listener: onItemClickListener) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }

        fun bindView(modelHome: ModelHome, listener: (ModelHome) -> Unit) {
            itemView.setOnClickListener { listener(modelHome) }
        }
    }
}