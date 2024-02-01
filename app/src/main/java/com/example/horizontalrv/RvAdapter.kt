package com.example.horizontalrv

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RvAdapter(private val context: Context, private val data: ArrayList<ArrayList<String>>) :
    RecyclerView.Adapter<RvAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val rowData = data[position]
        holder.bind(rowData)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var textView1: TextView = itemView.findViewById(R.id.txt)
        private var textView2: TextView = itemView.findViewById(R.id.txt2)

        fun bind(rowData: ArrayList<String>) {
            textView1.text = rowData[0]
            textView2.text = rowData[1]
        }
    }
}