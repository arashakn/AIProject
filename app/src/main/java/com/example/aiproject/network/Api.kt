package com.example.aiproject.network

import com.example.aiproject.network.api.NewsService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit

object Api {
    //private val  retrofit = Retrofit.Builder().baseUrl(BASE_URL).client(client).build()
    val retrofitService : NewsService by lazy { RetrofitInstance.getRetrofitInstance().create(NewsService::class.java) }
}