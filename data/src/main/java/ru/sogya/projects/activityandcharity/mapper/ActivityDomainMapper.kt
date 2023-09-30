package ru.sogya.projects.activityandcharity.mapper

import ru.sogya.projects.activityandcharity.domain.model.ActivityDomain
import ru.sogya.projects.activityandcharity.model.ActivityData

class ActivityDomainMapper(private val activityDomain: ActivityDomain) {
    operator fun invoke(): ActivityData =
        ActivityData(activityDomain.title, activityDomain.id, activityDomain.valueType)
}