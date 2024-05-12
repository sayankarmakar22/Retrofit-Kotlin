package com.example.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance  {

    private val retrofit by lazy{
        Retrofit.Builder().baseUrl("http://10.0.2.2:6999/SmartCare/Customer/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiInstance by lazy {
        retrofit.create(ApiInterface::class.java)
    }
}