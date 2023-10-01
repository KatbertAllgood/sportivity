package ru.sogya.projects.activity_and_charity.mapper

import ru.sogya.projects.activity_and_charity.model.ActivityPresentation
import ru.sogya.projects.activityandcharity.domain.model.ActivityDomain

class ActivityDataMapper(private val activityDomain: ActivityDomain) {
    operator fun invoke(): ActivityPresentation =
        ActivityPresentation(activityDomain.title, activityDomain.id, activityDomain.valueType)
}