package com.example.musicappkotlinfinal

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {
    @Headers("X-RapidAPI-Key: 73e5ef0075msh178fdcf33491cd6p12a068jsne3e71b7621c6","X-RapidAPI-Host: deezerdevs-deezer.p.rapidapi.com")

    @GET("search")
    fun getData(@Query("q")query: String):  Call<MyData>
}