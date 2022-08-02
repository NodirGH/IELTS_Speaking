package com.example.ieltsspeaking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.ieltsspeaking.databinding.ActivityMainBinding
import com.example.ieltsspeaking.home.adapter.HomeAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //recycler view
        binding.rvHome.layoutManager = GridLayoutManager(this, 2)
        binding.rvHome.adapter = HomeAdapter()

        //drawer layout
        toggle = ActionBarDrawerToggle(this, binding.drawerLayoutHome, R.string.open, R.string.close)
        binding.drawerLayoutHome.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.ibMenu.setOnClickListener {
            if (!binding.drawerLayoutHome.isOpen){
                binding.drawerLayoutHome.open()
            }
        }


        binding.navView.setNavigationItemSelectedListener {
            when (it.itemId) {
            R.id.navRate -> Toast.makeText(this, "Rate us", Toast.LENGTH_SHORT).show()
            R.id.navContact -> Toast.makeText(this, "Contact us", Toast.LENGTH_SHORT).show()
            R.id.navShare -> Toast.makeText(this, "Share it", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }
}