package com.example.travel.food

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.travel.R

class food_Contents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_contents)

        val backspace: ImageView = findViewById(R.id.backSpace)
        backspace.setOnClickListener { finish() }

        val image = getIntent().getIntExtra("image", 1)
        val title = getIntent().getStringExtra("title")
        val star = getIntent().getStringExtra("star")
        val sub = getIntent().getStringExtra("sub")
        val location = getIntent().getStringExtra("location")
        val writer = getIntent().getStringExtra("writer")

        val food_content_image: ImageView = findViewById(R.id.food_contentImage)
        val food_content_place:TextView = findViewById(R.id.food_contentPlace)
        val food_content_star:TextView = findViewById(R.id.food_contentStar)
        val food_content_sub:TextView = findViewById(R.id.food_contentSub)
        val food_content_location:TextView = findViewById(R.id.food_contentLocation)
        val food_content_writer:TextView = findViewById(R.id.food_contentWriter)

        food_content_image.setImageResource(image)
        food_content_place.text = title
        food_content_star.text = "추천 ( " +  star + " )"
        food_content_sub.text = sub
        food_content_location.text = "주소 : " + location
        food_content_writer.text = '"' + writer!! + '"'
    }
}