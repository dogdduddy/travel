package com.example.travel.Tourist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.travel.R

class TouristAdapter(private val context: Context, private val dataSet: List<affirmation>)
    : RecyclerView.Adapter<TouristAdapter.TouristViewHolder>() {

    class TouristViewHolder(private val view:View) : RecyclerView.ViewHolder(view) {
        val itemImage :ImageView = view.findViewById(R.id.item_image)
        val itemPlace :TextView = view.findViewById(R.id.item_place)
        val itemStar :TextView = view.findViewById(R.id.item_star)
        val itemSub :TextView = view.findViewById(R.id.item_sub)
        val itemLocation :TextView = view.findViewById(R.id.item_location)
        val itemWriter :TextView = view.findViewById(R.id.item_writer)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TouristViewHolder {
        val itemlayout = LayoutInflater.from(parent.context).inflate(R.layout.tourist_item,parent,false)
        return TouristViewHolder(itemlayout)
    }

    override fun onBindViewHolder(holder: TouristViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            itemClicklistener.onClick(it, position)
        }

        val item = dataSet[position]
        holder.itemImage.setImageResource(item.imageResource)
        holder.itemPlace.text = context.resources.getString(item.placeResource)
        holder.itemStar.text = context.resources.getString(item.starResource)
        holder.itemSub.text = context.resources.getString(item.subResource)
        holder.itemLocation.text = context.resources.getString(item.locationResource)
        holder.itemWriter.text = context.resources.getString(item.writerResource)
    }
    interface OnItemClickListener {
        fun onClick(v:View, position: Int)
    }
    fun setItemClickListener(onItemClickListener: OnItemClickListener) {
        this.itemClicklistener = onItemClickListener
    }
    private lateinit var itemClicklistener : OnItemClickListener

    // 람다표현식
    override fun getItemCount() = dataSet.size

}