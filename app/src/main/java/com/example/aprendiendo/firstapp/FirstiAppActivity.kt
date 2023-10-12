package com.example.aprendiendo.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.aprendiendo.R


class FirstiAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firsti_app)
        val btnClick = findViewById<AppCompatButton>(R.id.btnClick)
        val edText = findViewById<AppCompatEditText>(R.id.etName)

        btnClick.setOnClickListener {
            val name = edText.text.toString()
            if (name.isNotEmpty()) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            } else {
                Log.i("Javi", "Escribi tu nombre antes de empezar")
            }
        }
    }
}