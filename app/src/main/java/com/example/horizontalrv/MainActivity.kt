package com.example.horizontalrv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.horizontalrv.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val recyclerView: RecyclerView? = null
    private val adapter: RvAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val hrv=binding.rv
        val itemList = ArrayList<ArrayList<String>>()

        // Adding rows to the 2D ArrayList
        itemList.add(arrayListOf("Row 1, Text 1", "Row 1, Text 2"))
        itemList.add(arrayListOf("Row 2, Text 1", "Row 2, Text 2"))
        itemList.add(arrayListOf("Row 3, Text 1", "Row 3, Text 2"))

        val hadapter=RvAdapter(this, itemList)
        hrv.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        hrv.adapter=hadapter
    }
}