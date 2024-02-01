package com.example.horizontalrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.horizontalrv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    val hrv=binding.rv
        val itemList = arrayListOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")
        val hadapter=horizontalRvAdapter(itemList)
        hrv.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        hrv.adapter=hadapter
    }
}