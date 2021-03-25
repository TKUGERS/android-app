package com.example.tkugers.surveyingpage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tkugers.R

class FieldL : Fragment() {

    private lateinit var lList: RecyclerView

    private val courses = listOf(
        Course("希臘羅馬神話", "劉曉薇", false),
        Course("文學名篇選讀：愛戀與生活", "謝旻琪...等", false),
        Course("文學名篇選讀：群己與生命", "周君璞...等", false),
        Course("台灣文學選讀", "侯如綺", false),
        Course("科幻小說選讀", "林黛嫚", false),
        Course("當代英美文學經典", "羅艾琳", false),
        Course("日本文學中譯賞析", "顧錦芬", false),
        Course("聖經文學入門", "劉曉薇", false),
        Course("日本現代小說與電影", "顧錦芬", false),
        Course("西班牙語文學經典賞析", "林盛彬", false),
        Course("德語文學名著選讀（一）", "林郁嫺", false),
        Course("德語文學名著選讀（二）", "林郁嫺", false),
        Course("俄國文學經典入門", "龔信賢", false),
        Course("法國文學、生活與文化", "廖潤珮", false),
        Course("法國經典文學導讀", "謝淳清", false),
        Course("西班牙語國家文學名著賞析", "林盛彬", false),
        Course("村上春樹講座", "曾秋桂", false)
    )

    private var madapter = ListAdapter( courses,
                                        R.layout.fragment_surveying_page_list,
                                        R.id.surveyingPageListTitle,
                                        R.id.surveyingPageListInstructor,
                                        R.id.surveyingPageListCardView )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_field_l, container, false)
        lList = rootView.findViewById(R.id.surveyingPageLList)
        lList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = madapter
        }
        return rootView
    }

    companion object {
        fun newInstance(): Fragment = FieldL()
    }
}