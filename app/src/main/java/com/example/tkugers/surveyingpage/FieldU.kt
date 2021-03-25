package com.example.tkugers.surveyingpage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tkugers.R

class FieldU : Fragment() {

    private lateinit var uList: RecyclerView

    private val courses = listOf(
        Course("生活邏輯","曾琇瑱",false),
        Course("物理與生活","洪振湧...等",false),
        Course("宇宙的探索","秦一男...等",false),
        Course("化學與生活：化學、環境與社會","鄧金培...等",false),
        Course("化學與生活：化學、醫藥與社會","鄭鈞霆...等",false),
        Course("生命科學：人體的奧秘","陳銘凱",false),
        Course("生命科學：基因科技與健康","王芸馨...等",false),
        Course("光、攝影和視覺","林震安...等",false),
        Course("生活中的化學","謝忠宏...等",false),
        Course("數學漫遊","潘志實...等",false),
        Course("科技的原理","李明憲",false),
        Course("半導體與生活","鄭振益...等",false),
        Course("生命科學：DNA科技時代","莊子超",false),
        Course("性別中的科學","朱惠芳",false),
        Course("性別與科學","李明憲",false),
        Course("科學之旅","陳旭...等",false),
        Course("化學與生活：化學、食品與社會","王三郎...等",false),
        Course("統計與生活","陳順益...等",false)
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
        val rootView = inflater.inflate(R.layout.fragment_field_u, container, false)
        uList = rootView.findViewById(R.id.surveyingPageUList)
        uList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = madapter
        }
        return rootView
    }

    companion object {
        fun newInstance(): Fragment = FieldU()
    }
}