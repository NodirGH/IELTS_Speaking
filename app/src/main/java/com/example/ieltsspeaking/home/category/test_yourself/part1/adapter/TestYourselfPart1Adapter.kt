package com.example.ieltsspeaking.home.category.test_yourself.part1.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ieltsspeaking.databinding.ItemsRvTestYourselfPart1Binding
import com.example.ieltsspeaking.home.category.test_yourself.model.TestYourselfModel

class TestYourselfPart1Adapter(
    private val modelTestYourselfPart1: List<TestYourselfModel>,
    private val testYourselfPart1ClickListenerTestYourselfPart1: OnItemTestYourselfPart1ClickListener
) : RecyclerView.Adapter<TestYourselfPart1Adapter.TestYourselfPart1ViewHolder>() {

    inner class TestYourselfPart1ViewHolder(val binding: ItemsRvTestYourselfPart1Binding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindView(modelTestYourselfPart1: TestYourselfModel){
        binding.tvTestYourselfPart1Question.text = modelTestYourselfPart1.part1Question
            binding.tvPart1OrderNumber.text = modelTestYourselfPart1.orderNumber.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestYourselfPart1ViewHolder {
        val view = ItemsRvTestYourselfPart1Binding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return TestYourselfPart1ViewHolder(view)
    }

    override fun onBindViewHolder(holder: TestYourselfPart1ViewHolder, position: Int) {
        holder.bindView(modelTestYourselfPart1[position])
        holder.itemView.setOnClickListener {
            testYourselfPart1ClickListenerTestYourselfPart1.onItemClick(modelTestYourselfPart1[position])
        }
    }

    override fun getItemCount() = modelTestYourselfPart1.size

    interface OnItemTestYourselfPart1ClickListener {
        fun onItemClick(modelTestYourselfPart1: TestYourselfModel)
    }
}