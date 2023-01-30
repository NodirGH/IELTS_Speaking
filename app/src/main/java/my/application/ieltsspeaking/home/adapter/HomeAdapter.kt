package my.application.ieltsspeaking.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import my.application.ieltsspeaking.databinding.ItemsRvHomeBinding
import my.application.ieltsspeaking.home.model.ModelHome

class HomeAdapter(private val modelHome: List<ModelHome>) :
    RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    private lateinit var homeListener: OnItemClickListener

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        homeListener = listener
    }

//    private var modelHome: List<ModelHome> = emptyList()
//
//    fun submitHomeList(categories: List<ModelHome>){
//        modelHome = categories
//        notifyDataSetChanged()
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeAdapter.HomeViewHolder {
        val itemView =
            ItemsRvHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewHolder(itemView, homeListener)
    }

    override fun onBindViewHolder(holder: HomeAdapter.HomeViewHolder, position: Int) {
        holder.bindView(modelHome[position])
    }

    override fun getItemCount() = modelHome.size

    inner class HomeViewHolder(
        private val binding: ItemsRvHomeBinding,
        listener: OnItemClickListener
    ) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindView(modelHome: ModelHome) {
            binding.tvTitleItemsRV.text = modelHome.title
            binding.icInsideOval.setImageResource(modelHome.icon)
            binding.ivBackgroundOval.setImageResource(modelHome.backgroundColor)
        }

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }
}