package my.application.ieltsspeaking.home.category.vocabulary.categories.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import my.application.ieltsspeaking.databinding.ItemsRvVocabularyWordsBinding
import my.application.ieltsspeaking.home.category.vocabulary.categories.model.ModelVocabularyWordlist

class VocabularyWordsAdapter(private val modelVocabularyWordlist: List<ModelVocabularyWordlist>) :
    RecyclerView.Adapter<VocabularyWordsAdapter.VocabularyWordsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VocabularyWordsViewHolder {
        val itemView = ItemsRvVocabularyWordsBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return VocabularyWordsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: VocabularyWordsViewHolder, position: Int) {
        holder.bindView(modelVocabularyWordlist[position])
    }

    override fun getItemCount() = modelVocabularyWordlist.size

    inner class VocabularyWordsViewHolder(val binding: ItemsRvVocabularyWordsBinding) :
        RecyclerView.ViewHolder(binding.root) {

            fun bindView(modelVocabularyWordlist: ModelVocabularyWordlist){
                binding.tvVocabularyWordsList.text = modelVocabularyWordlist.vocabularyWordsList
            }

    }

}