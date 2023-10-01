package ru.sogya.projects.activity_and_charity.mapper

import ru.sogya.projects.activity_and_charity.model.UserPresentation
import ru.sogya.projects.activityandcharity.domain.model.UserDomain

class UserDataMapper(private val userDomain: UserDomain) {
    fun toData(): UserPresentation = UserPresentation(
        userDomain.id,
        userDomain.name,
        userDomain.email,
        userDomain.achievementsId,
        userDomain.departmentId,
        userDomain.type,
        userDomain.photoUrl,
        userDomain.fundId
    )
}