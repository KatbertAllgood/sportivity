package ru.sogya.projects.activityandcharity.domain.usecase.database.user

import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository

class GetUserUseCase(private val databaseRepository: DatabaseRepository) {
    operator fun invoke() = databaseRepository.getUser()
}