package com.example.ieltsspeaking.home.category.vocabulary.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ieltsspeaking.databinding.ItemsRvVocabularyBinding
import com.example.ieltsspeaking.home.category.part1Topic.adapter.PartsTopicAdapter
import com.example.ieltsspeaking.home.category.vocabulary.model.VocabularyModel

class VocabularyAdapter(
    private val vocabularyModel: List<VocabularyModel>
) : RecyclerView.Adapter<VocabularyAdapter.VocabularyViewHolder>() {

    private lateinit var vocabularyListener: OnVocabularyWordCLickListener

    interface OnVocabularyWordCLickListener {
        fun onItemClick(position: Int)
    }

    fun setOnWordClickListener(listener: OnVocabularyWordCLickListener) {
        vocabularyListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VocabularyViewHolder {
        val itemView =
            ItemsRvVocabularyBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VocabularyViewHolder(itemView, vocabularyListener)
    }

    override fun onBindViewHolder(holder: VocabularyViewHolder, position: Int) {
        holder.bindView(vocabularyModel[position])
    }

    override fun getItemCount() = vocabularyModel.size


    inner class VocabularyViewHolder(
        val binding: ItemsRvVocabularyBinding,
        listener: OnVocabularyWordCLickListener
    ) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindView(model: VocabularyModel) {
            binding.ivVocabularyPicture.setImageResource(model.backgroundPicture)
            binding.ivVocabularyBgOval.setImageResource(model.backgroundColor)
            binding.tvLearnedPercent.text = model.learnedPercent.toString()
            binding.tvVocabularyWordCount.text = model.wordCount.toString()
            binding.tvVocabularyTopicHeading.text = model.heading
        }

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }
}