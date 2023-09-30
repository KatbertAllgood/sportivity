package ru.sogya.projects.activityandcharity.domain.usecase.database.department

import ru.sogya.projects.activityandcharity.domain.model.ActivityDomain
import ru.sogya.projects.activityandcharity.domain.model.DepartmentDomain
import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository

class InsertDepartmentsUseCase(private val databaseRepository: DatabaseRepository) {
    operator fun invoke(departments:List<DepartmentDomain>) = databaseRepository.insertActivities(departments)
}