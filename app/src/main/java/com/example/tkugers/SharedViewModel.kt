package com.example.tkugers

import androidx.lifecycle.ViewModel
import com.example.tkugers.api.APIResponse

class SharedViewModel : ViewModel() {
//    val selected = MutableLiveData<Course>()
//    fun select(course: Course) {
//        selected.value = course
//    }
    var response = APIResponse(listOf(""))
    fun saveResponse(res: APIResponse?) {
        if (res != null) {
            response = res
        }
    }
}