package com.example.testapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PageIndice : AppCompatActivity() {

    private lateinit var butRetour: Button
    private lateinit var butRejoindre: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_indice)

        butRetour = findViewById(R.id.Retour)
        butRetour.setOnClickListener {
            startActivity(Intent(this@PageIndice, MainActivity::class.java))
        }

        butRejoindre = findViewById(R.id.Rejoindre)
        butRejoindre.setOnClickListener {
            startActivity(Intent(this@PageIndice, PageVictoire::class.java))
        }
    }
}