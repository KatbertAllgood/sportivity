package ru.sogya.projects.activity_and_charity.entity

import ru.sogya.projects.activityandcharity.domain.entity.ActivityDomain

data class ActivityPresentation(
    override val title: String,
    override val id: Int,
    override val valueType: Int
) : ActivityDomain
