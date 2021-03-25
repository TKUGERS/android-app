package com.example.tkugers.surveyingpage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tkugers.R

class FieldT : Fragment() {

    private lateinit var tList: RecyclerView

    private val courses = listOf(
        Course("國際規範與禮儀","綠軒亞...等", false),
        Course("大三留學實務管理（一）","梁家恩...等", false),
        Course("大三留學實務管理（二）","周志偉...等", false),
        Course("大三留學實務管理（三）","林偉修...等", false),
        Course("大三留學實務管理（四）","林偉修...等", false),
        Course("世界人權問題","林立", false),
        Course("全球化發展","郭秋慶", false),
        Course("國際現勢","施正權...等", false),
        Course("世界環境保護","苑倚曼", false),
        Course("歐洲聯盟與歐洲統合","張福昌", false),
        Course("文化全球化","崔琳...等", false),
        Course("東亞與世界","徐浤馨", false),
        Course("全球體系與兩岸關係","翁明賢...等", false),
        Course("經濟全球化","陳逸青...等", false),
        Course("美洲現勢","黃富娟...等", false),
        Course("國際非政府組織","游雅雯...等", false),
        Course("莫內講座：歐洲聯盟與歐洲統合","陳麗娟", false),
        Course("莫內模組：歐洲聯盟與歐洲統合","卓忠宏", false),
        Course("台灣戰略地位","黃介正", false)
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
        val rootView = inflater.inflate(R.layout.fragment_field_t, container, false)
        tList = rootView.findViewById(R.id.surveyingPageTList)
        tList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = madapter
        }
        return rootView
    }

    companion object {
        fun newInstance(): Fragment = FieldT()
    }
}