package com.example.tkugers.surveyingpage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tkugers.R

class FieldR : Fragment() {
    private lateinit var rList: RecyclerView

    private val courses = listOf(
        Course("環境未來","陳建甫...等",false),
        Course("經濟未來","王貞靜...等",false),
        Course("社會未來","李長潔...等",false),
        Course("科技未來","范素玲...等",false),
        Course("政治未來","周湘華...等",false),
        Course("社會未來－城市未來","鄧建邦",false),
        Course("社會未來－運動文化趨勢","紀舜傑",false),
        Course("經濟未來－長壽趨勢與高齡經濟","鄧玉英",false)
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
        val rootView = inflater.inflate(R.layout.fragment_field_r, container, false)
        rList = rootView.findViewById(R.id.surveyingPageRList)
        rList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = madapter
        }
        return rootView
    }

    companion object {
        fun newInstance(): Fragment = FieldR()
    }
}