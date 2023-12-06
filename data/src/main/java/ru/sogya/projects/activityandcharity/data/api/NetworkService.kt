package ru.sogya.projects.activityandcharity.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkService {
    fun getRetrofitService(): NetworkApi {
        return Retrofit.Builder()
            .baseUrl("https://0rlwqbsl-5000.euw.devtunnels.ms/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NetworkApi::class.java)
    }
}