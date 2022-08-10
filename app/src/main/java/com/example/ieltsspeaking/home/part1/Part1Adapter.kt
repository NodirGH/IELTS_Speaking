package com.example.ieltsspeaking.home.part1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ieltsspeaking.databinding.FragmentPart1TopicBinding
import com.example.ieltsspeaking.databinding.ItemsRvPart1Binding
import com.example.ieltsspeaking.home.part1.model.ModelPart1

class Part1Adapter(private val part1Model: List<ModelPart1>) :
    RecyclerView.Adapter<Part1Adapter.Part1ViewHolder>() {

    private lateinit var part1Listener: OnItemClickListener

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        part1Listener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Part1ViewHolder {
        val itemView =
            ItemsRvPart1Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Part1ViewHolder(itemView, part1Listener)
    }

    override fun onBindViewHolder(holder: Part1ViewHolder, position: Int) {
        holder.bindView(part1Model[position])
    }

    override fun getItemCount() = part1Model.size

    inner class Part1ViewHolder(
        private val binding: ItemsRvPart1Binding,
        listener: OnItemClickListener
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bindView(modelPart1: ModelPart1){
            binding.tvPart1OrderNumber.text = modelPart1.orderNumber.toString()
            binding.tvPart1NumberQuestion.text = modelPart1.questionCount.toString()
            binding.tvPart1TopicHeading.text = modelPart1.heading
            binding.ivPart1BgRectangle.setImageResource(modelPart1.background)
        }

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }
}