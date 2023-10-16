package com.example.testapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MapIndices : AppCompatActivity() {

    private lateinit var butValider : Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map_indices)

        butValider = findViewById(R.id.Valider)
        butValider.setOnClickListener {
            startActivity(Intent(this@MapIndices, MainActivity::class.java))
        }

    }
}