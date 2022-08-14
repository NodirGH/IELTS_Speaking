package com.example.ieltsspeaking.home.category.part1Topic.categories.study.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ieltsspeaking.databinding.ItemsRvPart1QuestionsBinding
import com.example.ieltsspeaking.home.category.part1Topic.categories.model.ModelPart1Questions

class Part1QuestionsStudyAdapter(private val modelPart1Questions: List<ModelPart1Questions>) :
    RecyclerView.Adapter<Part1QuestionsStudyAdapter.Part1QuestionsStudyViewHolder>() {

//    private lateinit var part1QuestionsListener: OnItemClickListener

//    interface OnItemClickListener {
//        fun onItemClick(position: Int)
//    }

//    fun setOnItemClickListener(listener: OnItemClickListener) {
//        part1QuestionsListener = listener
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Part1QuestionsStudyViewHolder {
        val itemView =
            ItemsRvPart1QuestionsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Part1QuestionsStudyViewHolder(itemView)
    }

    override fun onBindViewHolder(holderStudy: Part1QuestionsStudyViewHolder, position: Int) {
        holderStudy.bindView(modelPart1Questions[position])
    }

    override fun getItemCount() = modelPart1Questions.size

    inner class Part1QuestionsStudyViewHolder(
        private val binding: ItemsRvPart1QuestionsBinding,
//        listener: OnItemClickListener
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bindView(modelPart1Questions: ModelPart1Questions) {
            binding.tvPart1Question.text = modelPart1Questions.question
            binding.btnPart1Learned.setOnClickListener {
//                modelPart1Questions.isLearned
            if (modelPart1Questions.isLearned){

            }
            }
        }
    }
}