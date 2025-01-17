package com.example.api

import android.app.DownloadManager.Request
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        https://meme-api.herokuapp.com/gimme

        val text1 = findViewById<TextView>(R.id.text)

        getData()


    }

    private fun getData() {
        RetrofitInstance.apiInstance.getData().enqueue(object : Callback<ApiData?> {
            override fun onResponse(call: Call<ApiData?>, response: Response<ApiData?>) {
                val text1 = findViewById<TextView>(R.id.text)
                text1.text = response.body()?.title
            }

            override fun onFailure(call: Call<ApiData?>, t: Throwable) {
                Toast.makeText(baseContext,"API CALL FAILED",Toast.LENGTH_SHORT).show()
            }
        })
    }
}