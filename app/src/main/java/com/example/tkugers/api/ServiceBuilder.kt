package com.example.tkugers.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ServiceBuilder {

    private fun getHttpClient(): OkHttpClient {
        val okHttpBuilder = OkHttpClient.Builder()
        okHttpBuilder.addInterceptor { chain ->
            val requestWithUserAgent = chain.request().newBuilder()
                .header("User-Agent", "My custom user agent")
                .build()
            chain.proceed(requestWithUserAgent)
        }
        return okHttpBuilder.build()
    }

    private val apiClient: Retrofit = Retrofit.Builder()
        .baseUrl("https://api-server-dot-tkugers.df.r.appspot.com")
        .client(getHttpClient())
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    fun<T> buildService(service: Class<T>): T{
        return apiClient.create(service)
    }
}