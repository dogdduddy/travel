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
        holder.foodImage.setImageResource(R.drawable.ic_launcher_background)
        holder.foodTitle.text = food.foodResource.toString()
        holder.foodSub.text = food.subResource.toString()
        holder.foodStar.text = food.starResource.toString()
        holder.foodLocation.text = food.locationResource.toString()
        holder.foodWriter.text = food.writerResource.toString()
        holder.overflow.setOnClickListener { showPopupMenu(holder.overflow) }
    }
    override fun getItemCount() = foodList!!.size

    private fun showPopupMenu(view:View) {
        val popup = PopupMenu(context, view)
        val inflater = popup.menuInflater
        inflater.inflate(R.menu.food_menu, popup.menu)
        var listener = PopupListener()
        popup.setOnMenuItemClickListener(listener)
        popup.show()
    }


    // Menu Item 클릭시 페이지 이동
    inner class PopupListener : PopupMenu.OnMenuItemClickListener {
        override fun onMenuItemClick(item: MenuItem?): Boolean {
            when(item?.itemId) {
                R.id.food_detail -> {
                    val intent = Intent(context, food_Contents::class.java)
                    intent.putExtra("title", foodList!!.get(0).foodResource.toString())
                    context.startActivity(intent)
                }
                R.id.food_web -> {
                    val intent = Intent(context, food_Contents::class.java)
                    context.startActivity(intent)
                }

            }
            return false
        }
    }
}