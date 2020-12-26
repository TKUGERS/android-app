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
//        supportFragmentManager
//            .beginTransaction()
//            .add(
//                R.id.root_layout, SectionBreak.newInstance(
//                    "9個問題",
//                    "通識課程推薦系統",
//                    "謝謝同學幫忙測試這個系統，首先會請您評分您過去修過的通識課，然後藉由您所填的資料利用深度學習的方式推薦您新的通識課。"
//                )
//            )
//            .commit()
    }
}