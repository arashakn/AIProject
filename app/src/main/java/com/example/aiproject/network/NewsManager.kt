package com.example.aiproject.network

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import com.example.aiproject.models.HeadLines
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsManager {
    //private val _newsResponse = mutableStateOf(HeadLines())

    init {
        getArticles()
    }

    private fun getArticles(){
        val service = Api.retrofitService.getTopArticles("us","912ef6798b76401ca5d73c615fac4877")
        service.enqueue(object  : Callback<HeadLines>{
            override fun onResponse(call: Call<HeadLines>, response: Response<HeadLines>) {

                if(response.isSuccessful){
                    println("sucess")
                }
                else{
                    println("error")
                }
            }

            override fun onFailure(call: Call<HeadLines>, t: Throwable) {
                Log.d("error" , "${t.printStackTrace()}")
            }

        }
        )
    }
}