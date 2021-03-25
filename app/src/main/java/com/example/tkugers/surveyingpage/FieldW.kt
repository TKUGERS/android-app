package com.example.tkugers.surveyingpage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tkugers.R

class FieldW : Fragment() {

    private lateinit var wList: RecyclerView

    private val courses = listOf(
        Course("台灣社會與文化","陳杏枝",false),
        Course("人際關係與溝通","胡延薇",false),
        Course("經濟學概論","鄧玉英",false),
        Course("正向心理學","宋鴻燕",false),
        Course("社會心理學","韓貴香",false),
        Course("文化與心理健康","宋鴻燕...等",false),
        Course("人權與社會正義","黃奕琳",false),
        Course("媒體與傳播文化","藍毓華...等",false),
        Course("社會變遷與社會教育","藍毓華",false),
        Course("性別角色與性屬關係","彭莉惠",false),
        Course("戰爭與人性","黃文智",false),
        Course("幸福經濟學","鄧玉英",false),
        Course("傳統社會與社會變遷","藍毓華",false),
        Course("發展心理學概論","宋鴻燕...等",false),
        Course("心理學導論","胡延薇...等",false),
        Course("社會學導論","鄧建邦...等",false),
        Course("政治學概論","黃奕琳",false),
        Course("生活與財經","曾慧敏...等",false),
        Course("生活中的行銷","陳水蓮",false),
        Course("性別與社會","林怡君",false),
        Course("幸福經濟學－理性與感性","干詠穎...等",false),
        Course("幸福的理性與感性","韓貴香...等",false),
        Course("政治心理學","宋鴻燕...等",false),
        Course("數位環境與媒體新素養","藍毓華",false),
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
        val rootView = inflater.inflate(R.layout.fragment_field_w, container, false)
        wList = rootView.findViewById(R.id.surveyingPageWList)
        wList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = madapter
        }
        return rootView
    }

    companion object {
        fun newInstance(): Fragment = FieldW()
    }
}