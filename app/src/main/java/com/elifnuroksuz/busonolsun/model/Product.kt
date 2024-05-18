package com.elifnuroksuz.busonolsun.model

import com.google.gson.annotations.SerializedName

data class Product (
    @SerializedName("title")
    val name: String,
    @SerializedName("price")
    val price: Double,
    @SerializedName("image")
    val imageurl : String
    )

