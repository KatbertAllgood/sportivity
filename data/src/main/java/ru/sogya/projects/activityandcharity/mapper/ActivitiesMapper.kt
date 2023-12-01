package ru.sogya.projects.activityandcharity.mapper

import ru.sogya.projects.activityandcharity.domain.model.ActivityDomain
import ru.sogya.projects.activityandcharity.domain.model.ActivityStatisticDomain
import ru.sogya.projects.activityandcharity.model.ActivityData
import ru.sogya.projects.activityandcharity.model.ActivityStatisticData

fun ActivityDomain.toData(): ActivityData =
    ActivityData(title, id, valueType)

fun ActivityStatisticDomain.toData(): ActivityStatisticData =
    ActivityStatisticData(userId, activityId, money, progress)