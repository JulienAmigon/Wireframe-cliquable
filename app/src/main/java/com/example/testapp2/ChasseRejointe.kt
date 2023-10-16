package com.example.testapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ChasseRejointe : AppCompatActivity() {

    private lateinit var butRetour: Button
    private lateinit var butRejoindre: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chasse_rejointe)

        butRetour = findViewById(R.id.Retour)
        butRetour.setOnClickListener {
            startActivity(Intent(this@ChasseRejointe, LancerUneChasse::class.java))
        }

        butRejoindre = findViewById(R.id.Rejoindre)
        butRejoindre.setOnClickListener {
            startActivity(Intent(this@ChasseRejointe, PageIndice::class.java))
        }


    }
}