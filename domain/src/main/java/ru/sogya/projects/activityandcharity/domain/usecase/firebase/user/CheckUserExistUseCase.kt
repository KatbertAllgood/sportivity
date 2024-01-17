package ru.sogya.projects.activityandcharity.domain.usecase.firebase.user

import ru.sogya.projects.activityandcharity.domain.repository.firebase.UserStoreRepository

class CheckUserExistUseCase(private val userStoreRepository: UserStoreRepository) {

    suspend operator fun invoke(email: String) = userStoreRepository.checkUserExist(email)
}