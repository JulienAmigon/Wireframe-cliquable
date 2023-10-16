package com.example.testapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class Connexion : AppCompatActivity() {

    private lateinit var butRetour: Button
    private lateinit var butProfil : Button
    private lateinit var butChange : Button
    private lateinit var change: ImageView
    private lateinit var butMDP: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connexion)

        butRetour = findViewById(R.id.Retour)
        butRetour.setOnClickListener {
            startActivity(Intent(this@Connexion, MainActivity::class.java))
        }

        butProfil = findViewById(R.id.Profil)
        butProfil.setOnClickListener {
            startActivity(Intent(this@Connexion, Profil::class.java))
        }

        butChange = findViewById(R.id.change)
        butChange.setOnClickListener {
            change = findViewById(R.id.IMGinscri)
            if (change.visibility==View.VISIBLE) {
                change.visibility=View.INVISIBLE
            }
            else
            {
                change.visibility= View.VISIBLE
            }
        }


        butMDP = findViewById(R.id.MDPoublie)
        butMDP.setOnClickListener {
            startActivity(Intent(this@Connexion, MDPoublie::class.java))
        }


    }

}

