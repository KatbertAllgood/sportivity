package ru.sogya.projects.activityandcharity.mapper

import ru.sogya.projects.activityandcharity.domain.model.UserDomain
import ru.sogya.projects.activityandcharity.model.UserData

class UserDomainMapper(private val userDomain: UserDomain) {
    fun toData(): UserData = UserData(
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