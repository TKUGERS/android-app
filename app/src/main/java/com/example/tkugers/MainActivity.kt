package com.example.tkugers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolBar = supportActionBar
        toolBar?.setDisplayShowHomeEnabled(true)
        toolBar?.setIcon(R.mipmap.ic_tkugers_logo)
        toolBar?.setLogo(R.mipmap.ic_tkugers_logo)
        toolBar?.setDisplayUseLogoEnabled(true)
    }
}