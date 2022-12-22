package my.application.ieltsspeaking.home.category.video_answer.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.home.category.video_answer.model.ModelVideoAnswer

class VideoAnswerAdapter(private val videoList: List<ModelVideoAnswer>): RecyclerView.Adapter<VideoAnswerAdapter.VideoAnswerViewHolder>() {

    private lateinit var mListener: OnVideoAnswerClickListener

    interface OnVideoAnswerClickListener{
        fun onVideoClick(position: Int)
    }

    fun setOnVideoAnswerListener(clickListener: OnVideoAnswerClickListener){
        mListener = clickListener
    }

    inner class VideoAnswerViewHolder(itemView: View, clickListener: OnVideoAnswerClickListener): RecyclerView.ViewHolder(itemView){

        fun bindView(modelVideoAnswer: ModelVideoAnswer){
            val thumbnail = itemView.findViewById<ImageView>(R.id.ivThumbnail)
            val information = itemView.findViewById<TextView>(R.id.tvVideoInformation)
            val definition = itemView.findViewById<TextView>(R.id.tvVideoDetails)

            thumbnail.setImageResource(modelVideoAnswer.thumbnail)
            information.text = modelVideoAnswer.videoInformation
            definition.text = modelVideoAnswer.videoInformation
        }

        init {
            itemView.setOnClickListener {
                clickListener.onVideoClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoAnswerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rv_video_answer, parent, false)
        return VideoAnswerViewHolder(view, mListener)
    }

    override fun onBindViewHolder(holder: VideoAnswerViewHolder, position: Int) {
        holder.bindView(videoList[position])
    }

    override fun getItemCount() = videoList.size
}