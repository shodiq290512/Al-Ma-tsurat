package com.shodiq.al_matsurat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Spalshcreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalshcreen)

        supportActionBar?.hide()
            Handler().postDelayed({
                val intent = Intent(this@Spalshcreen, MainActivity::class.java)
                startActivity(intent)
                finish()
            },1000)

    }
}