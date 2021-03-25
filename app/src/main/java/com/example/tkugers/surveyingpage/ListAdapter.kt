package com.example.tkugers.surveyingpage

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val list: List<Course>,
                  @LayoutRes Layout: Int,
                  @IdRes Title: Int,
                  @IdRes Instructor: Int,
                  @IdRes Card: Int)
    : RecyclerView.Adapter<CourseViewHolder>() {

    init {
        setHasStableIds(true)
    }

    private val layout = Layout
    private val title = Title
    private val instructor = Instructor
    private val card = Card

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return CourseViewHolder(inflater, parent, layout, title, instructor, card)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val course: Course = list[position]
        holder.bind(course)
    }

    override fun getItemCount(): Int = list.size
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
}