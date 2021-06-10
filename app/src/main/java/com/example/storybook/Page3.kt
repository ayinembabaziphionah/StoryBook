package com.example.storybook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class Page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)

        tvTurnPage5.setOnClickListener {
            val intent = Intent(this,Page4::class.java)
            startActivity(intent)
        }
    }
}