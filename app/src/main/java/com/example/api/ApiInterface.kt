package com.example.api

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("d5087f8")
    fun getData(): Call<SmartCare>
}