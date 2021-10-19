package com.example.travel.food

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.travel.R

class Food : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var adapter: foodAdapter? = null
    private var foodList: MutableList<food_dataset>? = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        //val toolbar = findViewById<Toolbar>(R.id.toolbar)
        //supportActionBar?.hide()
        //setSupportActionBar(toolbar)

        recyclerView = findViewById(R.id.recycler_view_food)
        adapter = foodAdapter(this, foodList)
        recyclerView?.layoutManager = GridLayoutManager(this, 2)
        recyclerView?.itemAnimator = DefaultItemAnimator()
        recyclerView?.adapter = adapter
        prepareAlbums()

    }
    private fun prepareAlbums() {
        val covers = intArrayOf(
            R.drawable.album1,
            R.drawable.album2,
            R.drawable.album3,
            R.drawable.album4,
            R.drawable.album5,
            R.drawable.album6,
            R.drawable.album7,
            R.drawable.album8,
            R.drawable.album9,
            R.drawable.album10,
            R.drawable.album11)
        var a = food_dataset(covers[0],"Love poem", "4","신난다 요로로로로로롤 ㅎㅎㅎ","의정부 호원동","전병선")
        foodList!!.add(a)
        a = food_dataset(covers[1],"Love poem", "4","신난다 요로로로로로롤 ㅎㅎㅎ","의정부 호원동","전병선")
        foodList!!.add(a)
        a = food_dataset(covers[2],"Love poem", "4","신난다 요로로로로로롤 ㅎㅎㅎ","의정부 호원동","전병선")
        foodList!!.add(a)
        a = food_dataset(covers[3],"Love poem", "4","신난다 요로로로로로롤 ㅎㅎㅎ","의정부 호원동","전병선")
        foodList!!.add(a)
        a = food_dataset(covers[4],"Love poem", "4","신난다 요로로로로로롤 ㅎㅎㅎ","의정부 호원동","전병선")
        foodList!!.add(a)
        a = food_dataset(covers[5],"Love poem", "4","신난다 요로로로로로롤 ㅎㅎㅎ","의정부 호원동","전병선")
        foodList!!.add(a)
        a = food_dataset(covers[6],"Love poem", "4","신난다 요로로로로로롤 ㅎㅎㅎ","의정부 호원동","전병선")
        foodList!!.add(a)
        a = food_dataset(covers[7],"Love poem", "5","신난다 요로로로로로롤 ㅎㅎㅎ","의정부 호원동","전병선")
        foodList!!.add(a)
        a = food_dataset(covers[8],"Love poem", "3","신난다 요로로로로로롤 ㅎㅎㅎ","의정부 호원동","전병선")
        foodList!!.add(a)
        a = food_dataset(covers[9],"Love poem", "4","신난다 요로로로로로롤 ㅎㅎㅎ","의정부 호원동","전병선")
        foodList!!.add(a)
        a = food_dataset(covers[10],"Love poem", "5","신난다 요로로로로로롤 ㅎㅎㅎ","의정부 호원동","전병선")
        foodList!!.add(a)

        adapter!!.notifyDataSetChanged()
    }
}