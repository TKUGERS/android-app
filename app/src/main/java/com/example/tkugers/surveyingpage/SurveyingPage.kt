package com.example.tkugers.surveyingpage

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.viewpager.widget.ViewPager
import com.example.tkugers.R
import com.example.tkugers.SharedViewModel
import com.example.tkugers.api.*
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener
import kotlinx.coroutines.*
import kotlinx.coroutines.GlobalScope.coroutineContext

class SurveyingPage : Fragment() {
    private lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager
    lateinit var adapter: LayoutAdapter
    private lateinit var model: SharedViewModel
    private val scope: CoroutineScope = MainScope()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_surveying_page, container, false)
        tabLayout = rootView.findViewById(R.id.surveyingPageTabLayout)
        viewPager = rootView.findViewById(R.id.surveyingPageViewPager)
        //人文領域
        tabLayout.addTab(tabLayout.newTab().setText("L"))
        tabLayout.addTab(tabLayout.newTab().setText("P"))
        tabLayout.addTab(tabLayout.newTab().setText("V"))
        tabLayout.addTab(tabLayout.newTab().setText("M"))
        //社會領域
        tabLayout.addTab(tabLayout.newTab().setText("T"))
        tabLayout.addTab(tabLayout.newTab().setText("R"))
        tabLayout.addTab(tabLayout.newTab().setText("W"))
        tabLayout.addTab(tabLayout.newTab().setText("S"))
        //科學領域
        tabLayout.addTab(tabLayout.newTab().setText("O"))
        tabLayout.addTab(tabLayout.newTab().setText("Z"))
        tabLayout.addTab(tabLayout.newTab().setText("U"))
        adapter = LayoutAdapter(childFragmentManager, tabLayout.tabCount)
//        surveyingPageTabLayout.tabGravity = TabLayout.GRAVITY_FILL
        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = NavHostFragment.findNavController(this)
        val fab = view.findViewById<FloatingActionButton>(R.id.surveyingPageFab)
        fab.setOnClickListener {
            val request = APIRequest(
                "來自Android Studio的測試",
                "5",
                "4",
                "5",
                "倫理學",
                "2020/12/1 上午11:46:36"
            )
            modifyRatingPage(request)
            navController.navigate(R.id.action_surveyingPage_to_ratingPage)
        }
        // TODO: 2020/12/30 Implement button to collect selected items
//        Log.e("Debugging Purpose",Courses_test[0].toString())
    }

    override fun onDestroy() {
        super.onDestroy()
        coroutineContext.cancelChildren()
    }

    private fun modifyRatingPage(request: APIRequest) {
        scope.launch {
            val result: APIResponse
            try {
                val retrofit = ServiceBuilder.buildService(APIClient::class.java)
                val response = retrofit.getRecommendedCourses(request)
                result = response.body()!!
                model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
                model.saveResponse(result)
                Log.e("Debugging Purpose: ", response.isSuccessful.toString())
                // Log.e("Debugging Purpose: ", response.body().toString())
            } catch (e: Exception) {
                Toast.makeText(requireView().context, "Error Occurred: ${e.message}", Toast.LENGTH_LONG).show()
            }
        }
        // Log.e("Debugging Purpose: ", result.toString())
    }

    companion object {
        fun newInstance(): Fragment = SurveyingPage()
    }
}