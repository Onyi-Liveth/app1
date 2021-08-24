package com.example.fetchdata

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val image : ImageView = findViewById(R.id.imageView)
        image.visibility = View.INVISIBLE
        val submitButton : Button = findViewById(R.id.BUTTON)


        submitButton.setOnClickListener {
            image.visibility = View.VISIBLE




        }
    }
}