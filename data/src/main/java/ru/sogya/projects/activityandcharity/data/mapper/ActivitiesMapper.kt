package ru.sogya.projects.activityandcharity.data.mapper

import ru.sogya.projects.activityandcharity.data.entity.ActivityData
import ru.sogya.projects.activityandcharity.data.entity.ActivityStatisticData
import ru.sogya.projects.activityandcharity.domain.entity.ActivityDomain
import ru.sogya.projects.activityandcharity.domain.entity.ActivityStatisticDomain

fun ActivityDomain.toData(): ActivityData =
    ActivityData(title, id, valueType)

fun ActivityStatisticDomain.toData(): ActivityStatisticData =
    ActivityStatisticData(userId, activityId, money, progress)