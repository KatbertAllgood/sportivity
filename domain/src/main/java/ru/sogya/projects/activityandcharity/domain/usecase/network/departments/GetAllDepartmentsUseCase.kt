package ru.sogya.projects.activityandcharity.domain.usecase.network.departments

import ru.sogya.projects.activityandcharity.domain.repository.NetworkRepository

class GetAllDepartmentsUseCase(private val networkRepository: NetworkRepository) {
    operator fun invoke() = networkRepository.getAllDepartments()
}