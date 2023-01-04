package my.application.ieltsspeaking.home.category.pronunciation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import my.application.ieltsspeaking.databinding.ItemsRvPronunciationBinding
import my.application.ieltsspeaking.home.category.pronunciation.model.ModelPronunciation

class PronunciationAdapter(private val modelPronunciation: List<ModelPronunciation>) :
    RecyclerView.Adapter<PronunciationAdapter.PronunciationViewHolder>() {

    private lateinit var mListener: OnPronunciationClickListener

    interface OnPronunciationClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnPronunciationClick(clickListener: OnPronunciationClickListener){
        mListener = clickListener
    }

    inner class PronunciationViewHolder(private val binding: ItemsRvPronunciationBinding, listener: OnPronunciationClickListener) :
        RecyclerView.ViewHolder(binding.root) {

            fun bindView(modelPronunciation: ModelPronunciation){
                binding.tvTitlePronunciation.text = modelPronunciation.title
            }

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PronunciationViewHolder {
        val view =
            ItemsRvPronunciationBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PronunciationViewHolder(view, mListener)
    }

    override fun onBindViewHolder(holder: PronunciationViewHolder, position: Int) {
        holder.bindView(modelPronunciation[position])
    }

    override fun getItemCount() = modelPronunciation.size
}