package com.example.tkugers.surveyingpage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tkugers.R

class FieldO : Fragment() {

    private lateinit var oList: RecyclerView

    private val courses = listOf(
        Course("資訊概論","洪復一...等",false),
        Course("電腦入門與應用","翁孟廷...等",false),
        Course("網路與資訊科技","鄭建富...等",false),
        Course("OFFICE證照實務","陳智揚...等",false),
        Course("網路與雲端應用","林國賡...等",false),
        Course("多媒體實務與應用","陳德展...等",false),
        Course("智慧型手機程式設計","林潮文...等",false),
        Course("iOS 程式開發","陳俊豪",false),
        Course("iOS 應用程式開發","林其誼...等",false),
        Course("進階C語言應用","陳瑞發...等",false),
        Course("PYTHON程式語言","游國忠...等",false),
        Course("電腦入門與程式思維","王駿瑋...等",false),
        Course("MOS證照實務","武士戎",false),
        Course("網頁程式設計","鄭國祥...等",false)
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
        val rootView = inflater.inflate(R.layout.fragment_field_o, container, false)
        oList = rootView.findViewById(R.id.surveyingPageOList)
        oList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = madapter
        }
        return rootView
    }

    companion object {
        fun newInstance(): Fragment = FieldO()
    }
}