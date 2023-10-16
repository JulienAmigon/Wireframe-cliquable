package com.example.testapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ChasseDebut : AppCompatActivity() {

    private lateinit var butRetour: Button
    private lateinit var butRejoindre: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chasse_debut)

        butRetour = findViewById(R.id.Retour)
        butRetour.setOnClickListener {
            startActivity(Intent(this@ChasseDebut, LancerUneChasse::class.java))
        }

        butRejoindre = findViewById(R.id.Rejoindre)
        butRejoindre.setOnClickListener {
            startActivity(Intent(this@ChasseDebut, ChasseRejointe::class.java))
        }

    }
}