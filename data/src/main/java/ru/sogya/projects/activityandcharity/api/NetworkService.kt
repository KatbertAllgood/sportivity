package ru.sogya.projects.activityandcharity.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkService {
    fun getRetrofitService(baseUri: String): NetworkApi {
        return Retrofit.Builder()
            .baseUrl(baseUri)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NetworkApi::class.java)
    }
}