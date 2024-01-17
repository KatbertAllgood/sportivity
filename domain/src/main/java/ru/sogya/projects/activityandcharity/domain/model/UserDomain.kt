package ru.sogya.projects.activityandcharity.domain.model

interface UserDomain {
    val id: String
    val tag:String
    val name: String
    val email: String
    val photoUrl: String?
}