package com.example.projeksatu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.content.Intent
import android.net.Uri

class MainAdabter(private val listData: ArrayList<Student>): RecyclerView.Adapter<MainAdabter.DataViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.adabter_main, parent, false)
        return DataViewHolder(view)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        val name = listData[position]
        holder.txtName.text = name.toString()

        holder.txtName.setOnClickListener {

            val keyword = listData[position].toString()

            val searchUrl = "https://www.google.com/search?q=$keyword"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(searchUrl))
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    class DataViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        val txtName: TextView = item.findViewById(R.id.txtName)
    }
}
