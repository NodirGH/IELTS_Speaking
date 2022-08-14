package com.example.ieltsspeaking.home.category.fulltest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.home.category.fulltest.adapter.FullTestAdapter
import com.example.ieltsspeaking.home.category.fulltest.data.DataFullTest

class FullTestFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_full_test, container, false)

        val data = DataFullTest.getData()
        val recyclerView = view.findViewById<RecyclerView>(R.id.rvFullTestFragment)
        val adapter = FullTestAdapter(data)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

        return view
    }
}