package ru.sogya.projects.activityandcharity.data.mapper


import ru.sogya.projects.activityandcharity.data.model.UserData
import ru.sogya.projects.activityandcharity.data.model.UserStatisticData
import ru.sogya.projects.activityandcharity.domain.model.UserDomain
import ru.sogya.projects.activityandcharity.domain.model.UserStatisticDomain

fun UserDomain.toData(): UserData = UserData(
    id, name, email, achievementsId, departmentId, type, photoUrl, fundId
)

fun UserStatisticDomain.toData(): UserStatisticData = UserStatisticData(
    userId, money, achievementsProgress, ratingPosition
)