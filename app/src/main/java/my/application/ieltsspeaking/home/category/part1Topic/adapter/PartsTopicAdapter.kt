package my.application.ieltsspeaking.home.category.part1Topic.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import my.application.ieltsspeaking.databinding.ItemsRvPart1TopicsBinding
import my.application.ieltsspeaking.home.category.part1Topic.model.ModelPartsTopic

class PartsTopicAdapter(
    private val part1ModelTopic: List<ModelPartsTopic>,
    private val part1TopicClickListener: OnItemClickListener
) :
    RecyclerView.Adapter<PartsTopicAdapter.Part1ViewHolder>() {

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

    inner class Part1ViewHolder(val binding: ItemsRvPart1TopicsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindView(modelPartsTopic: ModelPartsTopic) {
            binding.tvPart1OrderNumber.text = modelPartsTopic.orderNumber.toString()
            binding.tvPart1NumberQuestion.text = part1ModelTopic.size.toString()
            binding.tvPart1TopicHeading.text = modelPartsTopic.heading
            binding.ivPart1BgRectangle.setImageResource(modelPartsTopic.background)

            binding.tvPart1NumberQuestion.text = modelPartsTopic.questionCount.toString()
        }
    }

    interface OnItemClickListener {
        fun onItemClick(part1ModelTopic: ModelPartsTopic)
    }

}