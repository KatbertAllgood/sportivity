package ru.sogya.projects.activityandcharity.domain.usecase.database.activity

import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository

class GetAllActivitiesUseCase(private val databaseRepository: DatabaseRepository) {
    operator fun invoke() = databaseRepository.getAllActivities()
}