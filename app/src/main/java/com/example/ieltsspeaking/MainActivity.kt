package com.example.ieltsspeaking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.GridLayoutManager
import com.example.ieltsspeaking.databinding.ActivityMainBinding
import com.example.ieltsspeaking.home.adapter.HomeAdapter
import com.example.ieltsspeaking.home.model.ModelHome
import com.example.ieltsspeaking.home.viewmodel.ViewModelHome

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModelHome: ViewModelHome

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.rvHome.layoutManager = GridLayoutManager(this, 2)
        binding.rvHome.adapter = HomeAdapter()

    }
}