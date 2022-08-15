package com.example.ieltsspeaking.home.category.part1Topic.categories.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ieltsspeaking.databinding.ItemsRvPart1QuestionsBinding
import com.example.ieltsspeaking.home.category.part1Topic.categories.model.ModelPart1Questions

class Part1QuestionsAdapter(
    private val modelPart1Questions: List<ModelPart1Questions>
//    private val part1QuestionClickListener: OnItemClickListener
) : RecyclerView.Adapter<Part1QuestionsAdapter.Part1QuestionsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Part1QuestionsViewHolder {
        val itemView =
            ItemsRvPart1QuestionsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Part1QuestionsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: Part1QuestionsViewHolder, position: Int) {
        holder.binding.tvPart1Question.text = modelPart1Questions[position].question
        holder.itemView.setOnClickListener {
//            part1QuestionClickListener.onItemClick(modelPart1Questions[position])
        }
//        holder.bindView(modelPart1Questions[position])
    }

    override fun getItemCount() = modelPart1Questions.size

    inner class Part1QuestionsViewHolder(
        val binding: ItemsRvPart1QuestionsBinding
//        listener: OnItemClickListener
    ) : RecyclerView.ViewHolder(binding.root) {

//        fun bindView(modelPart1Questions: ModelPart1Questions) {
//            binding.tvPart1Question.text = modelPart1Questions.question
////            binding.btnPart1Learned.setOnClickListener {
//        }
    }

    interface OnItemClickListener {
        fun onItemClick(modelPart1Questions: ModelPart1Questions)
    }
}
