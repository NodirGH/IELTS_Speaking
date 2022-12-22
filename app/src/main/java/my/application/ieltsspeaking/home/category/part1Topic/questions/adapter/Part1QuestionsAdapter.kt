package my.application.ieltsspeaking.home.category.part1Topic.questions.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import my.application.ieltsspeaking.databinding.ItemsRvPart1QuestionsBinding
import my.application.ieltsspeaking.home.category.part1Topic.questions.model.ModelPartsQuestions

class Part1QuestionsAdapter(private val modelPartsQuestions: List<ModelPartsQuestions>) :
    RecyclerView.Adapter<Part1QuestionsAdapter.Part1QuestionsViewHolder>() {

    private lateinit var mListener: Part1QuestionClickListener

    interface Part1QuestionClickListener {
        fun onQuestionClick(position: Int)
    }

    fun setOnPart1QuestionClickListener(clickListener: Part1QuestionClickListener) {
        mListener = clickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Part1QuestionsViewHolder {
        val itemView =
            ItemsRvPart1QuestionsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Part1QuestionsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: Part1QuestionsViewHolder, position: Int) {
        holder.bindView(modelPartsQuestions[position], mListener)
            }

    override fun getItemCount() = modelPartsQuestions.size

    inner class Part1QuestionsViewHolder(private val binding: ItemsRvPart1QuestionsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindView(modelPartsQuestions: ModelPartsQuestions, clickListener: Part1QuestionClickListener) {
            binding.tvPart1Question.text = modelPartsQuestions.question
            itemView.setOnClickListener { clickListener.onQuestionClick(adapterPosition) }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(modelPartsQuestions: ModelPartsQuestions)
    }
}