package com.example.testapp2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var but: Button
    private lateinit var but2: Button
    private lateinit var but3: Button



    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        but = findViewById(R.id.LancerChasse)
        but.text = "Lancer une chasse"
        but.setOnClickListener {
            Log.d("MainActivity", "lancer")
            startActivity(Intent(this@MainActivity, LancerUneChasse::class.java))
        }

        but2 = findViewById(R.id.CreerChasse)
        but2.text = "Creer une chasse"
        but2.setOnClickListener {
            Log.d("MainActivity", "crer")
            startActivity(Intent(this@MainActivity, CreerUneChasse::class.java))
        }

        but3 = findViewById(R.id.Profil)
        but3.text = "Profil"
        but3.setOnClickListener {
            Log.d("MainActivity", "proil")
            startActivity(Intent(this@MainActivity, Connexion::class.java))
        }

    }
}