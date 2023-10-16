package com.example.testapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class PoseIndices : AppCompatActivity() {

    private lateinit var butRetour: Button
    private lateinit var butChange: Button
    private lateinit var change: ImageView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pose_indices)

        butRetour = findViewById(R.id.Retour)
        butRetour.setOnClickListener {
            startActivity(Intent(this@PoseIndices, CreerUneChasse::class.java))
        }

        butChange = findViewById(R.id.change)
        butChange.setOnClickListener {
            change = findViewById(R.id.imageView9)
            change.visibility=1
        }
    }
}