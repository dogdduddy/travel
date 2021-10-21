package com.example.travel.Tourist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.travel.R

class Tourist_Contents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tourist_contents)

        val backspace: ImageView = findViewById(R.id.backSpace)
        backspace.setOnClickListener { finish() }

        val image = getIntent().getIntExtra("image", 1)
        val place = getIntent().getIntExtra("place", 1)
        val star = getIntent().getIntExtra("star", 1)
        val sub = getIntent().getIntExtra("sub", 1)
        val location = getIntent().getIntExtra("location", 1)
        val writer = getIntent().getIntExtra("writer", 1)

        val content_image:ImageView = findViewById(R.id.contentImage)
        val content_place:TextView = findViewById(R.id.contentPlace)
        val content_star:TextView = findViewById(R.id.contentStar)
        val content_sub:TextView = findViewById(R.id.contentSub)
        val content_location:TextView = findViewById(R.id.contentLocation)
        val content_writer:TextView = findViewById(R.id.contentWriter)


        content_image.setImageResource(image)
        content_place.text = resources.getString(place)
        content_star.text = "추천 ( " +  resources.getString(star) + " )"
        content_sub.text = resources.getString(sub)
        content_location.text = "주소 : " + resources.getString(location)
        content_writer.text = '"' +resources.getString(writer) + '"'



    }
}