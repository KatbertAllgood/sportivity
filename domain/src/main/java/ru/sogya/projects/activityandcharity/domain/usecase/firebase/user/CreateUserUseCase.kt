package ru.sogya.projects.activityandcharity.domain.usecase.firebase.user

import ru.sogya.projects.activityandcharity.domain.model.UserDomain
import ru.sogya.projects.activityandcharity.domain.repository.firebase.UserStoreRepository

class CreateUserUseCase(private val userStoreRepository: UserStoreRepository) {

    suspend operator fun invoke(user: UserDomain) = userStoreRepository.createUser(user)
}