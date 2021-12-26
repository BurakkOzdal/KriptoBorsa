package com.example.retrofitkotlin.model

import com.google.gson.annotations.SerializedName


data class CryptoModel(
    //@SerializedName("currency") //Kotlinde gelen veri ile aynı isimde olunca değiken serialize yapmaya gerek yok
    val currency:String,

    //@SerializedName("price")
    val price:String
)