package ru.sogya.projects.activityandcharity.mapper


import ru.sogya.projects.activityandcharity.domain.model.UserDomain
import ru.sogya.projects.activityandcharity.domain.model.UserStatisticDomain
import ru.sogya.projects.activityandcharity.model.UserData
import ru.sogya.projects.activityandcharity.model.UserStatisticData

fun UserDomain.toData(): UserData = UserData(
    id, name, email, achievementsId, departmentId, type, photoUrl, fundId
)

fun UserStatisticDomain.toData(): UserStatisticData = UserStatisticData(
    userId, money, achievementsProgress, ratingPosition
)