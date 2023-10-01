package ru.sogya.projects.activity_and_charity.mapper

import ru.sogya.projects.activity_and_charity.model.ActivityStatisticPresentation
import ru.sogya.projects.activityandcharity.domain.model.ActivityStatisticDomain

class ActivityStatisticDataMapper(private val activityStatisticDomain: ActivityStatisticDomain) {
    fun toData(): ActivityStatisticPresentation =
        ActivityStatisticPresentation(
            activityStatisticDomain.userId,
            activityStatisticDomain.activityId,
            activityStatisticDomain.money,
            activityStatisticDomain.progress
        )
}