package com.example.tkugers.surveyingpage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tkugers.R

class FieldS : Fragment() {

    private lateinit var sList: RecyclerView

    private val courses = listOf(
        Course("非營利組織","張景台...等",false),
        Course("社會企業","詹立煒...等",false),
        Course("企業與法律","呂其昌...等",false),
        Course("生活與法律","許昭元...等",false),
        Course("民主政治","黃琛瑜...等",false),
        Course("公民社會","周應龍...等",false),
        Course("公民參與","戴政龍...等",false),
        Course("民主政治","安娜...等",false),
        Course("公民文化","何景榮...等",false),
        Course("憲法與人權","謝相慶...等",false),
        Course("資訊生活與法律","陳銘祥",false),
        Course("智慧財產權與法律","王琇慧...等",false)
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
        val rootView = inflater.inflate(R.layout.fragment_field_s, container, false)
        sList = rootView.findViewById(R.id.surveyingPageSList)
        sList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = madapter
        }
        return rootView
    }

    companion object {
        fun newInstance(): Fragment = FieldS()
    }
}