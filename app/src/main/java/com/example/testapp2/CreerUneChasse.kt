package com.example.testapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CreerUneChasse : AppCompatActivity() {

    private lateinit var butRetour: Button
    private lateinit var butCreer: Button
    private lateinit var butIndice: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creer_une_chasse)

        butRetour = findViewById(R.id.Retour)
        butRetour.setOnClickListener {
            startActivity(Intent(this@CreerUneChasse, MainActivity::class.java))
        }

        butCreer = findViewById(R.id.crer)
        butCreer.setOnClickListener {
            startActivity(Intent(this@CreerUneChasse, RecapitulatifChasse::class.java))
        }

        butIndice = findViewById(R.id.indice)
        butIndice.setOnClickListener {
            startActivity(Intent(this@CreerUneChasse, PoseIndices::class.java))
        }
    }
}