package com.example.tkugers.surveyingpage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tkugers.R

class FieldP : Fragment() {
    private lateinit var pList: RecyclerView

    private val courses = listOf(
        Course("歐洲文化史", "劉增泉", false),
        Course("中國歷史文物賞析", "古怡青...等", false),
        Course("中國歷史文物賞析", "王樾...等", false),
        Course("近代史事叢譚", "羅運治", false),
        Course("西洋歷史與人物", "唐耀棕...等", false),
        Course("台灣歷史采風與踏查", "袁明道...等", false),
        Course("台灣海洋歷史與文化", "陳鈺祥", false)
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
        val rootView = inflater.inflate(R.layout.fragment_field_p, container, false)
        pList = rootView.findViewById(R.id.surveyingPagePList)
        pList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = madapter
        }
        return rootView
    }

    companion object {
        fun newInstance(): Fragment = FieldP()
    }
}