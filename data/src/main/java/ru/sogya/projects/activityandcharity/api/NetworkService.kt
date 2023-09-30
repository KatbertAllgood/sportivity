package ru.sogya.projects.activityandcharity.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.sogya.projects.activityandcharity.util.Constants

object NetworkService {
    fun getRetrofitService(): NetworkApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NetworkApi::class.java)
    }
}