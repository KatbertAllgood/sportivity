package ru.sogya.projects.activity_and_charity.mapper


import ru.sogya.projects.activity_and_charity.entity.UserPresentation
import ru.sogya.projects.activity_and_charity.entity.UserStatisticPresentation
import ru.sogya.projects.activityandcharity.domain.entity.UserDomain
import ru.sogya.projects.activityandcharity.domain.entity.UserStatisticDomain

fun UserDomain.toPresentation(): UserPresentation = UserPresentation(
    id, name, email, achievementsId, departmentId, type, photoUrl, fundId
)

fun UserStatisticDomain.toPresentation(): UserStatisticPresentation = UserStatisticPresentation(
    userId, money, achievementsProgress, ratingPosition
)

fun List<UserStatisticDomain>.toPresentation(): List<UserStatisticPresentation> =
    this.map { it.toPresentation() }