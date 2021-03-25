package com.example.tkugers.ratingpage

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
import com.example.tkugers.surveyingpage.Course
import com.example.tkugers.surveyingpage.ListAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class RatingPage : Fragment() {
    private lateinit var lList: RecyclerView

    private val courses = listOf(
        Course("希臘羅馬神話", "劉曉薇", false),
        Course("OFFICE證照實務","陳智揚...等",false),
        Course("iOS 應用程式開發","林其誼...等",false),
        Course("造型藝術中的基礎素描技法","戴佳茹", false)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_rating_page, container, false)

        ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        // Log.e("Debugging Purpose: ", model.response.toString())
        val madapter = ListAdapter( courses,
                                    R.layout.fragment_rating_page_list,
                                    R.id.ratingPageListTitle,
                                    R.id.ratingPageListInstructor,
                                    R.id.ratingPageListCardView )
        lList = rootView.findViewById(R.id.ratingPageList)
        lList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = madapter
        }
        val navController = NavHostFragment.findNavController(this)
        val fab = rootView.findViewById<FloatingActionButton>(R.id.ratingPageFab)
        fab.setOnClickListener {
            navController.navigate(R.id.action_ratingPage_to_sectionBreak)
        }
        return rootView
    }
}