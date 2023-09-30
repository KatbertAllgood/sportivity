package ru.sogya.projects.activityandcharity.domain.usecase.database.department

import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository

class GetAllDepartmentsUseCase(private val databaseRepository: DatabaseRepository) {
    operator fun invoke() = databaseRepository.getAllDepartments()
}