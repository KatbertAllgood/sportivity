package ru.sogya.projects.activityandcharity.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.sogya.projects.activityandcharity.util.Constants

object NetworkService {
    fun getRetrofitService(): NetworkApi {
        return Retrofit.Builder()
            .baseUrl("https://0rlwqbsl-5000.euw.devtunnels.ms/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NetworkApi::class.java)
    }
}