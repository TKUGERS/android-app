package com.example.tkugers.sectionbreak

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.example.tkugers.R
import com.google.android.material.floatingactionbutton.FloatingActionButton


class SectionBreak : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_section_break, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = NavHostFragment.findNavController(this)
        val fab = view.findViewById<FloatingActionButton>(R.id.sectionBreakFab)
        fab.setOnClickListener {
            navController.navigate(R.id.action_sectionBreak_to_recommendingPage)
        }
    }
}