package ru.sogya.projects.activityandcharity.api

import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import ru.sogya.projects.activityandcharity.model.ActivityData

interface NetworkApi {

    @GET()
    fun getAllActivities(): Flow<List<ActivityData>>
}