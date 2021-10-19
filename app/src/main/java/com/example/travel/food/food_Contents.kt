package com.example.travel.food

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.travel.R

class food_Contents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_contents)

        var intent = getIntent()

        val test1:TextView = findViewById(R.id.test1)
        test1.setText(intent.getStringExtra("title").toString())
    }
}