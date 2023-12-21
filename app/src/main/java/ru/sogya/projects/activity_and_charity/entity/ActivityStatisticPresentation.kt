package ru.sogya.projects.activity_and_charity.entity

import ru.sogya.projects.activityandcharity.domain.entity.ActivityStatisticDomain
data class ActivityStatisticPresentation(
    override val userId: Int,
    override val activityId: Int,
    override val money: Int,
    override val progress: Int
) : ActivityStatisticDomain