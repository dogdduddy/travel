package com.example.travel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupMenu
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.RecyclerView
import com.example.travel.Tourist.DataSet
import com.example.travel.Tourist.Tourist
import com.example.travel.food.Food

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var intent:Intent

        val Tourist_btn:ImageView = findViewById(R.id.Tourist_btn)
        val food_btn:ImageView = findViewById(R.id.food_btn)
        val accom_btn:ImageView = findViewById(R.id.accom_btn)

        // 버튼 클릭 이벤트. Intent
        Tourist_btn.setOnClickListener {
            intent = Intent(applicationContext, Tourist::class.java)
            startActivity(intent)
        }
        food_btn.setOnClickListener {
            intent = Intent(applicationContext, Food::class.java)
            startActivity(intent)
        } // food 클래스로 넘어가도록 설정해줌
        accom_btn.setOnClickListener {
            intent = Intent(applicationContext, Food::class.java)
            startActivity(intent)
        }
    }
}