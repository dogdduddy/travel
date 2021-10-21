package com.example.travel.food

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.travel.R

class FoodAdapter(val context: Context, val foodList:MutableList<food_dataset>? ) : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {
    class FoodViewHolder(itemview: View) :RecyclerView.ViewHolder(itemview) {
        var foodImage:ImageView = itemview.findViewById(R.id.food_item_image)
        var foodTitle:TextView = itemview.findViewById(R.id.food_item_title)
        var foodSub:TextView = itemview.findViewById(R.id.food_item_sub)
        var foodStar:TextView = itemview.findViewById(R.id.food_item_star)
        var foodLocation:TextView = itemview.findViewById(R.id.food_item_location)
        var foodWriter:TextView = itemview.findViewById(R.id.food_item_writer)
        var overflow:ImageView = itemview.findViewById(R.id.overflow)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val itemview = LayoutInflater.from(parent.context).inflate(R.layout.food_card, parent, false)
        return FoodViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = foodList!![position]
        holder.foodImage.setImageResource(foodList[position].imageResource)
        holder.foodTitle.text = food.foodResource
        holder.foodSub.text = food.subResource
        holder.foodStar.text = food.starResource
        holder.foodLocation.text = food.locationResource
        holder.foodWriter.text = food.writerResource
        holder.overflow.setOnClickListener { showPopupMenu(holder.overflow, food) }
    }
    override fun getItemCount() = foodList!!.size

    private fun showPopupMenu(view:View, foodItem:food_dataset) {
        val popup = PopupMenu(context, view)
        val inflater = popup.menuInflater
        inflater.inflate(R.menu.food_menu, popup.menu)
        popup.setOnMenuItemClickListener { item ->
            when(item?.itemId) {
                R.id.food_detail -> {
                    val intent = Intent(context, food_Contents::class.java)
                    intent.putExtra("image", foodItem.imageResource)
                    intent.putExtra("title", foodItem.foodResource)
                    intent.putExtra("star", foodItem.starResource)
                    intent.putExtra("sub", foodItem.subResource)
                    intent.putExtra("location", foodItem.locationResource)
                    intent.putExtra("writer", foodItem.writerResource)
                    context.startActivity(intent)
                }
                R.id.food_web -> {
                    val intent = Intent(context, food_Contents::class.java)
                    context.startActivity(intent)
                }
            }
            false
        }
        popup.show()
    }

}