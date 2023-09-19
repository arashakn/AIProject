package com.example.aiproject.network.api

import com.example.aiproject.models.HeadLines
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {
    @GET("top-headlines")
    fun getTopArticles(@Query("country") country : String, @Query("apiKey") apiKey : String) : Call<HeadLines>
}