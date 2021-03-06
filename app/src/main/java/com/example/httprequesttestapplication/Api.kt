package com.example.httprequesttestapplication

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {

    @GET("/metric?rapidapi-key=336238b419msh595f95a90976111p180b85jsn20fd6314ff3b" +
            "&weight=150" +
            "&height=1.83")
    fun calculateBMI():Call<BMIResponse>

    @GET("/metric?rapidapi-key=336238b419msh595f95a90976111p180b85jsn20fd6314ff3b" +
            "&weight=150" +
            "&height=1.83")
    suspend fun calculateBMIC():Call<BMIResponse>

//    @Query("weight")
//    weight:String,
//    @Query("height")
//    height:String

}