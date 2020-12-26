package com.example.tkugers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment.findNavController
import android.widget.TextView
import androidx.annotation.IdRes
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import org.w3c.dom.Text

// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_TAGLINE = "tagline"
//private const val ARG_TITLE = "title"
//private const val ARG_CONTENT = "content"

class SectionBreak : Fragment() {
//    private var tagline: String? = null
//    private var title: String? = null
//    private var content: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        arguments?.let {
//            tagline = it.getString(ARG_TAGLINE)
//            title = it.getString(ARG_TITLE)
//            content = it.getString(ARG_CONTENT)
//        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_section_break, container, false)
        val sectionBreakTagline = rootView.findViewById<TextView>(R.id.sectionBreakTagline)
        val sectionBreakTitle = rootView.findViewById<TextView>(R.id.sectionBreakTitle)
        val sectionBreakContent = rootView.findViewById<TextView>(R.id.sectionBreakContent)
        sectionBreakTagline.text = "9個問題"
        sectionBreakTitle.text = "通識課程推薦系統"
        sectionBreakContent.text = "謝謝同學幫忙測試這個系統，首先會請您評分您過去修過的通識課，然後藉由您所填的資料利用深度學習的方式推薦您新的通識課。"
        val fab = rootView.findViewById<FloatingActionButton>(R.id.fab)
        val navController = findNavController(this)
        fab.setOnClickListener {
            navController.navigate(R.id.sectionBreak_SurveyingPage)
        }
        return rootView
    }

//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param tagline Parameter 1.
//         * @param title Parameter 2.
//         * @param content Parameter 3.
//         * @return A new instance of fragment SectionBreak.
//         */
//        @JvmStatic
//        fun newInstance(tagline: String, title: String, content: String) =
//            SectionBreak().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_TAGLINE, tagline)
//                    putString(ARG_TITLE, title)
//                    putString(ARG_CONTENT, content)
//                }
//            }
//    }

}