package my.application.ieltsspeaking.home.category.pronunciation.categories.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.home.category.pronunciation.adapter.PronunciationAdapter
import my.application.ieltsspeaking.home.category.pronunciation.categories.model.ModelPronunciation

class PronunciationVideosAdapter(private val modelPronunciation: List<ModelPronunciation>): RecyclerView.Adapter<PronunciationVideosAdapter.PronunciationVideosViewHolder>() {

    private lateinit var mListener: OnPronunciationVideoClick

    interface OnPronunciationVideoClick {
        fun onVideoClick(position: Int)
    }

    fun setOnPronunciationVideo(clickListener: OnPronunciationVideoClick){
        mListener = clickListener
    }

    inner class PronunciationVideosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bindView(modelPronunciation: ModelPronunciation){
            val thumbnail = itemView.findViewById<ImageView>(R.id.ivThumbnail)
            val information = itemView.findViewById<TextView>(R.id.tvVideoInformation)
            val definition = itemView.findViewById<TextView>(R.id.tvVideoDetails)

            thumbnail.setImageResource(modelPronunciation.thumbnail)
            information.text = modelPronunciation.videoInformation
            definition.text = modelPronunciation.videoDetails
        }

        init {
            itemView.setOnClickListener {
                mListener.onVideoClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PronunciationVideosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rv_video_answer, parent, false)
        return PronunciationVideosViewHolder(view)
    }

    override fun onBindViewHolder(holder: PronunciationVideosViewHolder, position: Int) {
        holder.bindView(modelPronunciation[position])
    }

    override fun getItemCount() = modelPronunciation.size
}