package ru.sogya.projects.activityandcharity.data.mapper


import ru.sogya.projects.activityandcharity.data.entity.UserData
import ru.sogya.projects.activityandcharity.data.entity.UserStatisticData
import ru.sogya.projects.activityandcharity.domain.entity.UserDomain
import ru.sogya.projects.activityandcharity.domain.entity.UserStatisticDomain

fun UserDomain.toData(): UserData = UserData(
    id, name, email, achievementsId, departmentId, type, photoUrl, fundId
)

fun UserStatisticDomain.toData(): UserStatisticData = UserStatisticData(
    userId, money, achievementsProgress, ratingPosition
)