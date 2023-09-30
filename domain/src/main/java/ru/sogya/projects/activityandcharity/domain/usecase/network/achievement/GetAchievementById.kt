package ru.sogya.projects.activityandcharity.domain.usecase.network.achievement

import ru.sogya.projects.activityandcharity.domain.repository.NetworkRepository

class GetAchievementById(private val networkRepository: NetworkRepository) {
    operator fun invoke(userId:Int) = networkRepository.getAchievementById(userId)
}