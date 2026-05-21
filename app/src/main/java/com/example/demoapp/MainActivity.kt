package com.example.demoapp

import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Gradient Background
        val layout = window.decorView.rootView

        val gradient = GradientDrawable(
            GradientDrawable.Orientation.TOP_BOTTOM,
            intArrayOf(
                0xFF6A11CB.toInt(),
                0xFF2575FC.toInt()
            )
        )

        layout.background = gradient

        // IDs
        val txtHello = findViewById<TextView>(R.id.txtHello)
        val etName = findViewById<EditText>(R.id.etName)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)

        btnSubmit.setOnClickListener {

            val name = etName.text.toString()

            txtHello.text = "Hello $name"
        }
    }
}