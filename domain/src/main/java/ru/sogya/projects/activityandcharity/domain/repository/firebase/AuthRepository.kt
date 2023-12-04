package ru.sogya.projects.activityandcharity.domain.repository.firebase

interface AuthRepository {

    fun login(login: String, password: String)

    fun registration(name: String, email: String, password: String)

    fun resetPassword(email: String)
}