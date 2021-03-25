package com.example.tkugers.surveyingpage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tkugers.R

class FieldV : Fragment() {

    private lateinit var vList: RecyclerView

    private val courses = listOf(
        Course("倫理學","王靈康",false),
        Course("哲學概論","王志銘...等",false),
        Course("醫學倫理","徐佐銘",false),
        Course("哲學經典導讀","蘇富芝...等",false),
        Course("宗教概論","唐耀棕...等",false),
        Course("宗教經典導讀","李峰銘",false),
        Course("生死學","鄭鈞瑋...等",false),
        Course("環境倫理","程進發",false),
        Course("職業倫理","王靈康",false),
        Course("性愛的文學與哲學","徐佐銘",false),
        Course("女性主義","王蔚婷...等",false),
        Course("邏輯與哲學","許樹和...等",false),
        Course("性學與哲學","胡延薇...等",false),
        Course("美學－理論與實務","王志銘...等",false),
        Course("台灣宗教","陳杏枝",false),
        Course("性別理論與實踐","劉亞蘭",false)
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
        val rootView = inflater.inflate(R.layout.fragment_field_v, container, false)
        vList = rootView.findViewById(R.id.surveyingPageVList)
        vList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = madapter
        }
        return rootView
    }

    companion object {
        fun newInstance(): Fragment = FieldV()
    }
}