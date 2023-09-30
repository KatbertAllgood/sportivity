package ru.sogya.projects.activity_and_charity.model

import ru.sogya.projects.activityandcharity.domain.model.ActivityDomain

data class ActivityPresentation(
    override val title: String,
    override val id: Int,
    override val valueType: Int
) : ActivityDomain
