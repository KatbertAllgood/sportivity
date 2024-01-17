package ru.sogya.projects.activity_and_charity.model

import ru.sogya.projects.activityandcharity.domain.model.UserDomain

data class UserPresentation(
    override val id: String,
    override val name: String,
    override val email: String,
    override val photoUrl: String?,
    override val tag: String
) : UserDomain