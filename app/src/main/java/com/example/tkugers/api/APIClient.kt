package com.example.tkugers.api

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface APIClient {
    @Headers("Content-Type: application/json")
    @POST("/predict")
    suspend fun getRecommendedCourses(@Body courseData: APIRequest): Response<APIResponse>
}