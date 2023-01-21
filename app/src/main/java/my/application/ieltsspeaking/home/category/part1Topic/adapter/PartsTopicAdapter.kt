package my.application.ieltsspeaking.home.category.part1Topic.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.ItemsRvPart1TopicsBinding
import my.application.ieltsspeaking.home.category.part1Topic.model.ModelPartsTopic

class PartsTopicAdapter() :
    RecyclerView.Adapter<PartsTopicAdapter.Part1ViewHolder>() {

    private lateinit var mListener: PartTopicClickListener

    interface PartTopicClickListener {
        fun onPartsClick(topic: ModelPartsTopic)
    }

    fun setClickListener(clickListener: PartTopicClickListener) {
        mListener = clickListener
    }

    private var topics: List<ModelPartsTopic> = emptyList()

    fun submitList(newTopics : List<ModelPartsTopic>){
        topics  = newTopics
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Part1ViewHolder {
        val itemView =
            ItemsRvPart1TopicsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Part1ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: Part1ViewHolder, position: Int) {
        holder.bindView(topics[position], mListener)
    }

    override fun getItemCount() = topics.size

    inner class Part1ViewHolder(
        val binding: ItemsRvPart1TopicsBinding,
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bindView(
            modelPartsTopic: ModelPartsTopic, clickListener: PartTopicClickListener
        ) {
            binding.tvPart1OrderNumber.text = modelPartsTopic.orderNumber.toString()
            binding.tvPart1TopicHeading.text = modelPartsTopic.heading
            itemView.setOnClickListener {
                clickListener.onPartsClick(topics[adapterPosition])
            }

            val backgroundDrawable = when (adapterPosition % 10) {
                0 -> R.drawable.bg_part1_1
                1 -> R.drawable.bg_part1_2
                2 -> R.drawable.bg_part1_3
                3 -> R.drawable.bg_part1_4
                4 -> R.drawable.bg_part1_5
                5 -> R.drawable.bg_part1_6
                6 -> R.drawable.bg_part1_7
                7 -> R.drawable.bg_part1_8
                8 -> R.drawable.bg_part1_9
                9 -> R.drawable.bg_part1_10
                else -> R.drawable.bg_part1_1
            }

            binding.ivPart1BgRectangle.setImageResource(backgroundDrawable)
            binding.tvPart1NumberQuestion.text = modelPartsTopic.questionCount.toString()
        }
    }

    interface OnItemClickListener {
        fun onItemClick(partModelTopic: ModelPartsTopic)
    }

}