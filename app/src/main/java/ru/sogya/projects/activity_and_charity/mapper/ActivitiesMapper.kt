package ru.sogya.projects.activity_and_charity.mapper

import ru.sogya.projects.activity_and_charity.model.ActivityPresentation
import ru.sogya.projects.activity_and_charity.model.ActivityStatisticPresentation
import ru.sogya.projects.activityandcharity.domain.model.ActivityDomain
import ru.sogya.projects.activityandcharity.domain.model.ActivityStatisticDomain

fun ActivityDomain.toPresentation(): ActivityPresentation =
    ActivityPresentation(title, id, valueType)

fun ActivityStatisticDomain.toPresentation(): ActivityStatisticPresentation =
    ActivityStatisticPresentation(userId, activityId, money, progress)

fun List<ActivityStatisticDomain>.toPresentation(): List<ActivityStatisticPresentation> =
    this.map { it.toPresentation() }