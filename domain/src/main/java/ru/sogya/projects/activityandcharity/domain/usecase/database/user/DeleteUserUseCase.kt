package ru.sogya.projects.activityandcharity.domain.usecase.database.user

import ru.sogya.projects.activityandcharity.domain.model.UserDomain
import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository

class DeleteUserUseCase(private val databaseRepository: DatabaseRepository) {
    suspend operator fun invoke(userDomain: UserDomain) = databaseRepository.deleteUser(userDomain)
}