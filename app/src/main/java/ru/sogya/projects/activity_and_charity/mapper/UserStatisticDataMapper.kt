package ru.sogya.projects.activity_and_charity.mapper

import ru.sogya.projects.activity_and_charity.model.UserStatisticPresentation
import ru.sogya.projects.activityandcharity.domain.model.UserStatisticDomain

class UserStatisticDataMapper(private val userStatisticDomain: UserStatisticDomain) {
    fun toData(): UserStatisticPresentation = UserStatisticPresentation(
        userStatisticDomain.userId,
        userStatisticDomain.money,
        userStatisticDomain.achievementsProgress,
        userStatisticDomain.ratingPosition
    )
}