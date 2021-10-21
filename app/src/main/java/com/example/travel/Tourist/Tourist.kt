package com.example.travel.Tourist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.travel.R

class Tourist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tourist)

        val dataset = DataSet().makeSet()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view_Tourist)
        val touristAdapter = TouristAdapter(this, dataset)

        val backspace:ImageView = findViewById(R.id.backSpace)
        backspace.setOnClickListener { finish() }

        touristAdapter.setItemClickListener(object: TouristAdapter.OnItemClickListener{
            override fun onClick(v: View, position: Int) {
                val data_position = dataset[position]
                val intent = Intent(applicationContext, Tourist_Contents::class.java)
                intent.putExtra("image", data_position.imageResource)
                intent.putExtra("place", data_position.placeResource)
                intent.putExtra("sub", data_position.subResource)
                intent.putExtra("star", data_position.starResource)
                intent.putExtra("location", data_position.locationResource)
                intent.putExtra("writer", data_position.writerResource)
                startActivity(intent)
            }
        })
        // 클릭 이벤트 정의 후 바인딩 되도록 설정
        recyclerView.adapter = touristAdapter
    }
}