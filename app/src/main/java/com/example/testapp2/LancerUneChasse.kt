package com.example.testapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LancerUneChasse : AppCompatActivity() {

    private lateinit var butRetour: Button
    private lateinit var butSuite: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lancer_une_chasse)

        butRetour = findViewById(R.id.Retour)
        butRetour.text = "Retour"
        butRetour.setOnClickListener {
            startActivity(Intent(this@LancerUneChasse, MainActivity::class.java))
        }

        butSuite = findViewById(R.id.Suite)
        butSuite.text = "Chasse XYZ"
        butSuite.setOnClickListener {
            startActivity(Intent(this@LancerUneChasse, ChasseDebut::class.java))
        }


    }
}