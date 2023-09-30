package ru.sogya.projects.activity_and_charity.model

import ru.sogya.projects.activityandcharity.domain.model.ActivityStatisticDomain
data class ActivityStatisticPresentation(
    override val userId: Int,
    override val activityId: Int,
    override val money: Int,
    override val progress: Int
) : ActivityStatisticDomain