package ru.sogya.projects.activityandcharity.mapper

import ru.sogya.projects.activityandcharity.domain.model.UserStatisticDomain
import ru.sogya.projects.activityandcharity.model.UserStatisticData

class UserStatisticDomainMapper(private val userStatisticDomain: UserStatisticDomain) {
    fun toData(): UserStatisticData = UserStatisticData(
        userStatisticDomain.userId,
        userStatisticDomain.money,
        userStatisticDomain.achievementsProgress,
        userStatisticDomain.ratingPosition
    )
}