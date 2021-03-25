package com.example.tkugers.surveyingpage

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class CourseViewHolder(inflater: LayoutInflater,
                       parent: ViewGroup,
                       @LayoutRes Layout: Int,
                       @IdRes Title: Int,
                       @IdRes Instructor: Int,
                       @IdRes Card: Int)
    : RecyclerView.ViewHolder(inflater.inflate(Layout, parent, false)) {

    private var courseTitle: TextView? = null
    private var courseInstructor: TextView? = null
    private var courseCard: CardView? = null

    init {
        courseTitle = itemView.findViewById(Title)
        courseInstructor = itemView.findViewById(Instructor)
        courseCard = itemView.findViewById(Card)
    }

    fun bind(course: Course) {
        courseTitle?.text = course.title
        courseInstructor?.text = course.instructor
        courseCard?.setOnClickListener {
            if(courseCard!!.isSelected) {
                courseCard!!.isSelected = false
                courseCard!!.setCardBackgroundColor(Color.WHITE)
            }
            else {
                courseCard!!.isSelected = true
                courseCard!!.setCardBackgroundColor(Color.LTGRAY)
            }
        }
    }
}