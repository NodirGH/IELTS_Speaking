package my.application.ieltsspeaking.home.category.part1Topic.questions.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import my.application.ieltsspeaking.databinding.ItemsRvPart1QuestionsBinding
import my.application.ieltsspeaking.home.category.part1Topic.questions.model.ModelPartsQuestions

class PartsQuestionsAdapter() :
    RecyclerView.Adapter<PartsQuestionsAdapter.Part1QuestionsViewHolder>() {

    private lateinit var mListener: PartsQuestionClickListener

    interface PartsQuestionClickListener {
        fun onQuestionClick(question: ModelPartsQuestions)
    }

    fun setClickListener(clickListener: PartsQuestionClickListener) {
        mListener = clickListener
    }

    private var questions: List<ModelPartsQuestions> = emptyList()

    fun submitList(newQuestions: List<ModelPartsQuestions>) {
        questions = newQuestions
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Part1QuestionsViewHolder {
        val itemView =
            ItemsRvPart1QuestionsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Part1QuestionsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: Part1QuestionsViewHolder, position: Int) {
        holder.bindView(questions[position], mListener)
    }

    override fun getItemCount() = questions.size

    inner class Part1QuestionsViewHolder(
        private val binding: ItemsRvPart1QuestionsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindView(
            modelPartsQuestion: ModelPartsQuestions,
            clickListener: PartsQuestionClickListener
        ) {
            binding.tvPart1Question.text = modelPartsQuestion.question
            itemView.setOnClickListener { clickListener.onQuestionClick(questions[adapterPosition]) }
        }
    }
}