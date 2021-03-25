package com.example.tkugers.surveyingpage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tkugers.R

class FieldM : Fragment() {

    private lateinit var mList: RecyclerView

    private val courses = listOf(
        Course("表演藝術", "吳文琪...等", false),
        Course("音樂概論","干詠穎", false),
        Course("臺灣劇場講座","陳慧勻", false),
        Course("數位藝術內容發展","謝朝鐘", false),
        Course("數位藝術概論","柯建恩...等", false),
        Course("世界名曲賞析與詮釋","林鄉雨...等", false),
        Course("西洋歌劇欣賞入門","王淑堯...等", false),
        Course("書法藝術的應用","張炳煌", false),
        Course("造型藝術中的基礎素描技法","戴佳茹", false),
        Course("鋼琴藝術與生活","李珮瑜", false),
        Course("音樂與藝術的對話","李珮瑜...等", false),
        Course("藝術與人生－與大師對話","戴佳茹", false),
        Course("身體語言與舞蹈藝術","吳文琪", false),
        Course("從文本到舞台－讀劇概論","陳慧勻", false),
        Course("歐洲文化藝術行旅","戴佳茹", false),
        Course("新媒體藝術概論","林俊賢", false)
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
        val rootView = inflater.inflate(R.layout.fragment_field_m, container, false)
        mList = rootView.findViewById(R.id.surveyingPageMList)
        mList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = madapter
        }
        return rootView
    }

    companion object {
        fun newInstance(): Fragment = FieldM()
    }
}