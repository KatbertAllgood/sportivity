package ru.sogya.projects.activity_and_charity.model

import ru.sogya.projects.activityandcharity.domain.model.UserStatisticDomain

data class UserStatisticPresentation(
    override val userId: Int,
    override val money: Int,
    override val achievementsProgress: Int,
    override val ratingPosition: Int
) : UserStatisticDomain
