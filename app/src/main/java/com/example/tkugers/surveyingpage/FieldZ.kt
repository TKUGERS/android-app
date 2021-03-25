package com.example.tkugers.surveyingpage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tkugers.R

class FieldZ : Fragment() {
    private lateinit var zList: RecyclerView

    private val courses = listOf(
        Course("生物科技","陳銘凱...等",false),
        Course("機械簡史","楊龍杰",false),
        Course("全球科技革命","陳惇凱...等",false),
        Course("地球生態環境","黃富國...等",false),
        Course("能源與材料科技","王儀雯...等",false),
        Course("電子與電腦科技","何金新...等",false),
        Course("海洋科技","楊龍杰",false),
        Course("科技永續","高思懷...等",false),
        Course("智慧綠生活","李安瑞...等",false),
        Course("科技進化","吳國暉...等",false),
        Course("智慧機器人","吳乾埼...等",false)
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
        val rootView = inflater.inflate(R.layout.fragment_field_z, container, false)
        zList = rootView.findViewById(R.id.surveyingPageZList)
        zList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = madapter
        }
        return rootView
    }

    companion object {
        fun newInstance(): Fragment = FieldZ()
    }
}