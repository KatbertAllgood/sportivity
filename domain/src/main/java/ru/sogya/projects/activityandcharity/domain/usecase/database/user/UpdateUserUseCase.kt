package ru.sogya.projects.activityandcharity.domain.usecase.database.user

import ru.sogya.projects.activityandcharity.domain.model.UserDomain
import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository

class UpdateUserUseCase(private val databaseRepository: DatabaseRepository) {
    operator fun invoke(userDomain: UserDomain) = databaseRepository.updateUser(userDomain)
}