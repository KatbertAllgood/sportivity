package ru.sogya.projects.activity_and_charity.mapper


import ru.sogya.projects.activity_and_charity.model.UserPresentation
import ru.sogya.projects.activity_and_charity.model.UserStatisticPresentation
import ru.sogya.projects.activityandcharity.domain.model.UserDomain
import ru.sogya.projects.activityandcharity.domain.model.UserStatisticDomain

fun UserDomain.toPresentation(): UserPresentation = UserPresentation(
    id, name, email, achievementsId, departmentId, type, photoUrl, fundId
)

fun UserStatisticDomain.toPresentation(): UserStatisticPresentation = UserStatisticPresentation(
    userId, money, achievementsProgress, ratingPosition
)

fun List<UserStatisticDomain>.toPresentation(): List<UserStatisticPresentation> =
    this.map { it.toPresentation() }