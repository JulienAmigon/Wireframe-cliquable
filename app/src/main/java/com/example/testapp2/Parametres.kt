package com.example.testapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Parametres : AppCompatActivity() {

    private lateinit var butRetour: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parametres)

        butRetour = findViewById(R.id.Retour)
        butRetour.setOnClickListener {
            startActivity(Intent(this@Parametres, Profil::class.java))
        }
    }
}