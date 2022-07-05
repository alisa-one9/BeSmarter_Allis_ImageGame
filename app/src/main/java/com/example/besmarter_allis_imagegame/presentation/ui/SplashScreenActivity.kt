package com.example.besmarter_allis_imagegame.presentation.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.besmarter_allis_imagegame.R

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val logo: ImageView = findViewById(R.id.logo)
        val textView: TextView = findViewById(R.id.app_name_memory)

        logo.animate().alpha(1f).setDuration(900).withEndAction {
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            val j = Intent(this, MainActivity::class.java)
            startActivity(j)


        }
        textView.animate().alpha(1f).setDuration(900).withEndAction {
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }
    }


}