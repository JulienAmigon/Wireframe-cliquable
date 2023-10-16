package com.example.testapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Profil : AppCompatActivity() {

    private lateinit var butRetour: Button
    private lateinit var butSuivant: Button
    private lateinit var butEdit: Button
    private lateinit var butParam: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        butRetour = findViewById(R.id.Retour)
        butRetour.setOnClickListener {
            startActivity(Intent(this@Profil, MainActivity::class.java))
        }

        butSuivant = findViewById(R.id.Suivre)
        butSuivant.setOnClickListener {
            startActivity(Intent(this@Profil, ChasseEnCours::class.java))
        }

        butEdit = findViewById(R.id.Editer)
        butEdit.setOnClickListener {
            startActivity(Intent(this@Profil, CreerUneChasse::class.java))
        }

        butParam = findViewById(R.id.Parametre)
        butParam.setOnClickListener {
            startActivity(Intent(this@Profil, Parametres::class.java))
        }
    }
}