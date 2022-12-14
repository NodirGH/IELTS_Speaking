package my.application.ieltsspeaking

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FirebaseDataAdapter (private val userList: ArrayList<FirebaseData>): RecyclerView.Adapter<FirebaseDataAdapter.FirebaseDataViewHolder>() {

    private lateinit var mListener: OnPart1TopicClickListener

    interface OnPart1TopicClickListener{
        fun onPart1TopicClick(position: Int)
    }

    fun setOnPart1TopicClickListener(clickListener: OnPart1TopicClickListener){
        mListener = clickListener
    }

    inner class FirebaseDataViewHolder(itemView: View, clickListener: OnPart1TopicClickListener): RecyclerView.ViewHolder(itemView){
        val orderNumber: TextView= itemView.findViewById(R.id.tvPart1_OrderNumber)
        val heading: TextView= itemView.findViewById(R.id.tvPart1TopicHeading)
        val questionCount: TextView= itemView.findViewById(R.id.tvPart1NumberQuestion)
//        val background: ImageView = itemView.findViewById(R.id.ivPart1BgRectangle)

        init {
            itemView.setOnClickListener{
                clickListener.onPart1TopicClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirebaseDataViewHolder {
        val itemV = LayoutInflater.from(parent.context).inflate(R.layout.items_rv_part1_topics, parent, false)
        return FirebaseDataViewHolder(itemV, mListener)
    }

    override fun onBindViewHolder(holder: FirebaseDataViewHolder, position: Int) {
        holder.apply {
            orderNumber.text = userList[position].orderNumber.toString()
            heading.text = userList[position].heading
            questionCount.text = userList[position].questionCount.toString()
//            background.setImageResource(userList[position].background)
        }
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}