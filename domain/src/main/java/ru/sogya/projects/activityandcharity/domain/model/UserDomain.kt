package ru.sogya.projects.activityandcharity.domain.model

interface UserDomain {
    val id: Int
    val name: String
    val email: String
    val departmentId: Int
    val type: Int //Руководитель или сосунок
    val photoUrl: String
    val fundId: Int
}