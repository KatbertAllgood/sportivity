package ru.sogya.projects.activityandcharity.domain.usecase.database.activity

import ru.sogya.projects.activityandcharity.domain.entity.ActivityDomain
import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository

class UpdateActivitiesUseCase(private val databaseRepository: DatabaseRepository) {
    operator fun invoke(activities:List<ActivityDomain>) = databaseRepository.updateActivities(activities)
}