package ru.sogya.projects.activityandcharity.data.mapper

import ru.sogya.projects.activityandcharity.data.model.ActivityData
import ru.sogya.projects.activityandcharity.data.model.ActivityStatisticData
import ru.sogya.projects.activityandcharity.domain.model.ActivityDomain
import ru.sogya.projects.activityandcharity.domain.model.ActivityStatisticDomain

fun ActivityDomain.toData(): ActivityData =
    ActivityData(title, id, valueType)

fun ActivityStatisticDomain.toData(): ActivityStatisticData =
    ActivityStatisticData(userId, activityId, money, progress)