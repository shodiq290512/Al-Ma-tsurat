package com.shodiq.al_matsurat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tasbih.*

class Tasbih : AppCompatActivity() {

//    var hitung = 33

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasbih)

        crd_hitung.setOnClickListener {
            tv_count.text = (tv_count.text.toString().toInt() + 1).toString()
        }
        crd_reset.setOnClickListener{
            tv_count.text = "0"
        }
    }
}