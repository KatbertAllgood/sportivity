package ru.sogya.projects.activity_and_charity.entity

import ru.sogya.projects.activityandcharity.domain.entity.UserDomain

data class UserPresentation(
    override val id: Int,
    override val name: String,
    override val email: String,
    override val achievementsId: Int,
    override val departmentId: Int,
    override val type: Int,
    override val photoUrl: String?,
    override val fundId: Int
) : UserDomain