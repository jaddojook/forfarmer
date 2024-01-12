package com.example.tom

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Pm : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pm)

        val home: ImageButton = findViewById(R.id.home)
        home.setOnClickListener {
            Home()
        }
    }

    private fun Home() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}

