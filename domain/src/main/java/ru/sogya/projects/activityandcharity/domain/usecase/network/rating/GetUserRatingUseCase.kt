package ru.sogya.projects.activityandcharity.domain.usecase.network.rating

import ru.sogya.projects.activityandcharity.domain.repository.NetworkRepository

class GetUserRatingUseCase(private val networkRepository: NetworkRepository) {
    operator fun invoke() = networkRepository.getUserRating()
}