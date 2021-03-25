package com.example.tkugers.surveyingpage

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

@Suppress("DEPRECATION")
class LayoutAdapter(
    fm: FragmentManager,
    private var totalTabs: Int
) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            //人文領域
            0 -> {
                FieldL()
            }
            1 -> {
                FieldP()
            }
            2 -> {
                FieldV()
            }
            3 -> {
                FieldM()
            }
            //社會領域
            4 -> {
                FieldT()
            }
            5 -> {
                FieldR()
            }
            6 -> {
                FieldW()
            }
            7 -> {
                FieldS()
            }
            //科學領域
            8 -> {
                FieldO()
            }
            9 -> {
                FieldZ()
            }
            10 -> {
                FieldU()
            }
            else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}