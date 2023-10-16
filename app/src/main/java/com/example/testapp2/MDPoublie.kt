package com.example.testapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MDPoublie : AppCompatActivity() {

    private lateinit var butValider: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mdpoublie)

        butValider = findViewById(R.id.valider)
        butValider.setOnClickListener {
            startActivity(Intent(this@MDPoublie, MainActivity::class.java))
        }

    }
}