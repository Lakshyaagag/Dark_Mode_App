package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val buttonHot = findViewById<Button>(R.id.btnHOT)
        val buttonCool = findViewById<Button>(R.id.btnCOOL)
        val LinearLayout = findViewById<LinearLayout>(R.id.linearLayout)

        buttonHot.setOnClickListener {
            // I want to change the background color to black
            LinearLayout.setBackgroundColor(R.color.black)

        }

        buttonCool.setOnClickListener{
            //I want to change the background color to blue
            LinearLayout.setBackgroundColor(androidx.appcompat.R.color.material_blue_grey_800)



        }
    }
}