package com.example.testapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RecapitulatifChasse : AppCompatActivity() {

    private lateinit var butRetour: Button
    private lateinit var butValider : Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recapitulatif_chasse)

        butRetour = findViewById(R.id.Retour)
        butRetour.setOnClickListener {
            startActivity(Intent(this@RecapitulatifChasse, CreerUneChasse::class.java))
        }

        butValider = findViewById(R.id.Valider)
        butValider.setOnClickListener {
            startActivity(Intent(this@RecapitulatifChasse, MapIndices::class.java))
        }
    }
}