package com.example.tkugers.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class APIRequest(
    @Json(name = "希臘羅馬神話")
    val Course_1: String? = null,
    @Json(name = "中國歷史文物賞析")
    val Course_2: String? = null,
    @Json(name = "哲學概論")
    val Course_3: String? = null,
    @Json(name = "社會未來")
    val Course_4: String? = null,
    @Json(name = "finalPick")
    val finalPick: String? = null,
    @Json(name = "timestamp")
    val timestamp: String? = null
)