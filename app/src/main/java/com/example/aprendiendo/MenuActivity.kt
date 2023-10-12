package com.example.aprendiendo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.aprendiendo.firstapp.FirstiAppActivity
import com.example.aprendiendo.firstapp.ResultActivity
import com.example.aprendiendo.imccalculator.ImcCalculatorActivity
import com.example.aprendiendo.superHeroApp.SuperHeroListActivity
import com.example.aprendiendo.todoApp.todoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnImcApp = findViewById<Button>(R.id.btnIMCApp)
        val btnTODOApp = findViewById<Button>(R.id.btnTODOApp)
        val btnSuperHero = findViewById<Button>(R.id.btnSuperHero)

        btnSaludApp.setOnClickListener { navigateToSaludApp() }
        btnImcApp.setOnClickListener { navigateToImcApp() }
        btnTODOApp.setOnClickListener { navigateToTODOApp() }
        btnSuperHero.setOnClickListener { navigateTobtnSuperHero() }
    }

    private fun navigateTobtnSuperHero() {
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludApp() {
        val intent = Intent(this, FirstiAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTODOApp() {
        val intent = Intent(this, todoActivity::class.java)
        startActivity(intent)
    }
}