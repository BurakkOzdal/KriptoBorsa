package com.example.retrofitkotlin.service

import com.example.retrofitkotlin.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {

    //https://api.nomics.com/v1/prices?key=88b39056a6c067c1f4d0e36d03e86d71

    @GET("prices?key=88b39056a6c067c1f4d0e36d03e86d71")
    fun getData():Call<List<CryptoModel>>
}