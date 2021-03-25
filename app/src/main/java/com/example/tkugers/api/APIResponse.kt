package com.example.tkugers.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class APIResponse(
    @Json(name = "answers")
    val answers: List<String>?
)