package com.example.testdriverspractice.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.testdriverspractice.R
import com.example.testdriverspractice.model.DataObject
import kotlinx.android.synthetic.main.card_view.view.*

class CustomAdapter(private val data: List<DataObject>):
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    private val items: MutableList<CardView>

    init{
        this.items = ArrayList()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view, parent, false)

        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvTitle.text = data[position].title
        holder.tvSubtitle.text = data[position].subtitle
        //holder.ivImage.background = data[position].image
        items.add(holder.card)
    }

    override fun getItemCount(): Int { return data.size }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTitle: TextView = itemView.tvTitle
        val tvSubtitle: TextView = itemView.tvSubtitle
        val ivImage: ImageView = itemView.ivbackground
        val card: CardView = itemView.card
    }
}