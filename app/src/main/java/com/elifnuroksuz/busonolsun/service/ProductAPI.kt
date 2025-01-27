package com.elifnuroksuz.busonolsun.service

import retrofit2.Call
import retrofit2.http.GET
import com.elifnuroksuz.busonolsun.model.Product

interface ProductAPI {

    @GET("products")
    fun getProducts(): Call<List<Product>>
}



