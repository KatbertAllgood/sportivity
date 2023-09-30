package ru.sogya.projects.activityandcharity.domain.usecase.network.departments

import ru.sogya.projects.activityandcharity.domain.repository.NetworkRepository

class GetDepartmentByIdUseCase(private val networkRepository: NetworkRepository) {
    operator fun invoke(departmentId: Int) = networkRepository.getDepartmentById(departmentId)
}