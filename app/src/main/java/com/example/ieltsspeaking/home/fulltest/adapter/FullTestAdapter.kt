package com.example.ieltsspeaking.home.fulltest.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.home.fulltest.model.FullTestModel

class FullTestAdapter(private val model: List<FullTestModel>) :
    RecyclerView.Adapter<FullTestAdapter.FullTestViewHolder>() {

    inner class FullTestViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val subject: TextView = itemView.findViewById(R.id.tvSubjects)
        private val mark: TextView = itemView.findViewById(R.id.tvMarks)

        fun bindView(model: FullTestModel) {
            subject.text = model.subject
            mark.text = model.mark
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FullTestViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.items_rv_full_test, parent, false)
        return FullTestViewHolder(view)
    }

    override fun onBindViewHolder(holder: FullTestViewHolder, position: Int) {
        holder.bindView(model[position])
    }

    override fun getItemCount() = model.size
}