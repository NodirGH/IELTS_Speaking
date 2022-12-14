package my.application.ieltsspeaking.home.category.pronunciation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import my.application.ieltsspeaking.databinding.ItemsRvPronunciationBinding

class PronunciationAdapter(private val modelPronunciation: List<ModelPronunciation>) :
    RecyclerView.Adapter<PronunciationAdapter.PronunciationViewHolder>() {

    inner class PronunciationViewHolder(private val binding: ItemsRvPronunciationBinding) :
        RecyclerView.ViewHolder(binding.root) {

            fun bindView(modelPronunciation: ModelPronunciation){
                binding.tvTitlePronunciation.text = modelPronunciation.title
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PronunciationViewHolder {
        val view =
            ItemsRvPronunciationBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PronunciationViewHolder(view)
    }

    override fun onBindViewHolder(holder: PronunciationViewHolder, position: Int) {
        holder.bindView(modelPronunciation[position])
    }

    override fun getItemCount() = modelPronunciation.size
}