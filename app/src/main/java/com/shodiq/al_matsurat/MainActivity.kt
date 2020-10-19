package com.shodiq.al_matsurat

import android.content.Intent
import android.os.Bundle
import android.text.Layout
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val crdPagiKubra: CardView = findViewById(R.id.crd_pagi_kubro)
        crdPagiKubra.setOnClickListener(this)
        val crdPetangKubra: CardView = findViewById(R.id.crd_petang_kubra)
        crdPetangKubra.setOnClickListener(this)
        val crdPagiSughra: CardView = findViewById(R.id.crd_pagi_sughra)
        crdPagiSughra.setOnClickListener(this)
        val crdPetangSughra: CardView = findViewById(R.id.crd_petang_sughra)
        crdPetangSughra.setOnClickListener(this)
        val crdTasbih: CardView = findViewById(R.id.crd_tasbih)
        crdTasbih.setOnClickListener(this)
        val crdDoa: CardView = findViewById(R.id.crd_doa)
        crdDoa.setOnClickListener(this)
        val Pengaturan: CardView = findViewById(R.id.crd_pengaturan)
        Pengaturan.setOnClickListener(this)
        val Notifikasi: CardView = findViewById(R.id.crd_notify)
        Notifikasi.setOnClickListener(this)
    }


    override fun onClick(v: View?) {
        when (v?.id){
            R.id.crd_pagi_kubro -> {
                val movePagiKubra = Intent(this@MainActivity, PagiKubra::class.java)
                startActivity(movePagiKubra)
            }
            R.id.crd_petang_kubra -> {
                val movePetangKubra = Intent(this@MainActivity, PetangKubra::class.java)
                startActivity(movePetangKubra)
            }
            R.id.crd_pagi_sughra -> {
                val movePagiSughra = Intent(this@MainActivity, PagiSughra::class.java)
                startActivity(movePagiSughra)
            }
            R.id.crd_petang_sughra -> {
                val movePetangSughra = Intent(this@MainActivity, PetangSughra::class.java)
                startActivity(movePetangSughra)
            }
            R.id.crd_tasbih -> {
                val moveTasbih = Intent(this@MainActivity, Tasbih::class.java)
                startActivity(moveTasbih)
            }
            R.id.crd_doa -> {
                val moveDoa = Intent(this@MainActivity, Doa::class.java)
                startActivity(moveDoa)
            }
            R.id.crd_pengaturan -> {
                val movePengaturan = Intent(this@MainActivity, Pengaturan::class.java)
                startActivity(movePengaturan)
            }
            R.id.crd_notify ->{
                val moveNotifikasi = Intent(this@MainActivity, Notifikasi::class.java)
                startActivity(moveNotifikasi)
            }
        }
    }
}