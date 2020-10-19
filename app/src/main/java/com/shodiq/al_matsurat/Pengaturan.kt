package com.shodiq.al_matsurat

import android.annotation.SuppressLint
import android.app.Notification
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.*

class Pengaturan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pengaturan_activity)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.pengaturan, SettingsFragment())
            .commit()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }



    class SettingsFragment : PreferenceFragmentCompat() {
        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey)
        }
    }
}