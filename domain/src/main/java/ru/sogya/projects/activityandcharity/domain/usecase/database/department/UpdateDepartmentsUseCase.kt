package ru.sogya.projects.activityandcharity.domain.usecase.database.department

import ru.sogya.projects.activityandcharity.domain.model.DepartmentDomain
import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository

class UpdateDepartmentsUseCase(private val databaseRepository: DatabaseRepository) {
    operator fun invoke(departments: List<DepartmentDomain>) =
        databaseRepository.updateDepartments(departments)
}