package com.example.ieltsspeaking.home.category.part1Topic.questions.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ieltsspeaking.databinding.ItemsRvPart1QuestionsBinding
import com.example.ieltsspeaking.home.category.part1Topic.questions.model.ModelPartsQuestions

class Part1QuestionsAdapter(
    private val modelPartsQuestions: List<ModelPartsQuestions>,
    private val part1QuestionClickListener: OnItemClickListener
) : RecyclerView.Adapter<Part1QuestionsAdapter.Part1QuestionsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Part1QuestionsViewHolder {
        val itemView =
            ItemsRvPart1QuestionsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Part1QuestionsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: Part1QuestionsViewHolder, position: Int) {
        holder.bindView(modelPartsQuestions[position])
        holder.itemView.setOnClickListener {
            part1QuestionClickListener.onItemClick(modelPartsQuestions[position])
        }
    }

    override fun getItemCount() = modelPartsQuestions.size

    inner class Part1QuestionsViewHolder(
        private val binding: ItemsRvPart1QuestionsBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bindView(modelPartsQuestions: ModelPartsQuestions) {
            binding.tvPart1Question.text = modelPartsQuestions.question
//            binding.btnPart1Learned  //TODO should be bind
        }
    }

    interface OnItemClickListener {
        fun onItemClick(modelPartsQuestions: ModelPartsQuestions)
    }
}