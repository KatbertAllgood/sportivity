package ru.sogya.projects.activityandcharity.mapper

import ru.sogya.projects.activityandcharity.domain.model.ActivityStatisticDomain
import ru.sogya.projects.activityandcharity.model.ActivityStatisticData

class ActivityStatisticDomainMapper(private val activityStatisticDomain: ActivityStatisticDomain) {
    fun toData(): ActivityStatisticData =
        ActivityStatisticData(
            activityStatisticDomain.userId,
            activityStatisticDomain.activityId,
            activityStatisticDomain.money,
            activityStatisticDomain.progress
        )
}