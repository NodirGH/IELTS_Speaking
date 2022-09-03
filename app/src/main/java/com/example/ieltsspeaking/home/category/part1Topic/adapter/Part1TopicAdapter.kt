package com.example.ieltsspeaking.home.category.part1Topic.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ieltsspeaking.databinding.ItemsRvPart1TopicsBinding
import com.example.ieltsspeaking.home.category.part1Topic.model.ModelPart1Topic

class Part1TopicAdapter(
    private val part1ModelTopic: List<ModelPart1Topic>,
    private val part1TopicClickListener: OnItemClickListener
) :
    RecyclerView.Adapter<Part1TopicAdapter.Part1ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Part1ViewHolder {
        val itemView =
            ItemsRvPart1TopicsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Part1ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: Part1ViewHolder, position: Int) {
        holder.bindView(part1ModelTopic[position])
        holder.itemView.setOnClickListener {
            part1TopicClickListener.onItemClick(part1ModelTopic[position])
        }
    }

    override fun getItemCount() = part1ModelTopic.size

    inner class Part1ViewHolder(private val binding: ItemsRvPart1TopicsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindView(modelPart1Topic: ModelPart1Topic) {
            binding.tvPart1OrderNumber.text = modelPart1Topic.orderNumber.toString()
            binding.tvPart1NumberQuestion.text = modelPart1Topic.questionCount.toString()
            binding.tvPart1TopicHeading.text = modelPart1Topic.heading
            binding.ivPart1BgRectangle.setImageResource(modelPart1Topic.background)
        }
    }

    interface OnItemClickListener {
        fun onItemClick(part1ModelTopic: ModelPart1Topic)
    }

}