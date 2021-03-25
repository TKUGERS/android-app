package com.example.tkugers.recommendingpage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tkugers.R
import com.example.tkugers.SharedViewModel
import com.example.tkugers.ratingpage.course2instructor
import com.example.tkugers.surveyingpage.Course
import com.example.tkugers.surveyingpage.ListAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton


class RecommendingPage : Fragment() {
    private lateinit var list: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_recommending_page, container, false)

        val model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        // Log.e("Debugging Purpose: ", model.response.toString())
        val madapter = ListAdapter( apiResponse2Course(model.response.answers!!),
            R.layout.fragment_recommending_page_list,
            R.id.recommendingPageListTitle,
            R.id.recommendingPageListInstructor,
            R.id.recommendingPageListCardView )
        list = rootView.findViewById(R.id.recommendingPageList)
        list.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = madapter
        }
        val navController = NavHostFragment.findNavController(this)
        val fab = rootView.findViewById<FloatingActionButton>(R.id.recommendingPageFab)
        fab.setOnClickListener {
            navController.navigate(R.id.action_recommendingPage_to_finishedPage)
        }
        return rootView
    }

    private fun apiResponse2Course(courses: List<String>): List<Course> {
        val res = mutableListOf<Course>()
        for(course_name in courses) {
            val course = Course(
                title = course_name,
                instructor = course2instructor(course_name),
                isSelected = false
            )
            res.add(course)
        }
        return res.toList()
    }

}