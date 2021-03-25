package com.example.tkugers.landingpage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment.findNavController
import android.widget.TextView
import com.example.tkugers.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class LandingPage : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_landing_page, container, false)
        val landingPageTagline = rootView.findViewById<TextView>(R.id.landingPageTagline)
        val landingPageTitle = rootView.findViewById<TextView>(R.id.landingPageTitle)
        val landingPageContent = rootView.findViewById<TextView>(R.id.landingPageContent)
        landingPageTagline.text = "9個問題"
        landingPageTitle.text = "通識課程推薦系統"
        landingPageContent.text = "謝謝同學幫忙測試這個系統，首先會請您評分您過去修過的通識課，然後藉由您所填的資料利用深度學習的方式推薦您新的通識課。"
        val fab = rootView.findViewById<FloatingActionButton>(R.id.landingPageFab)
        val navController = findNavController(this)
        fab.setOnClickListener {
            navController.navigate(R.id.action_sectionBreak_to_surveyingPage)
        }
        return rootView
    }

}