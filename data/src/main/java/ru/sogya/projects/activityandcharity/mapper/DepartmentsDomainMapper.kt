package ru.sogya.projects.activityandcharity.mapper

import ru.sogya.projects.activityandcharity.domain.model.DepartmentDomain
import ru.sogya.projects.activityandcharity.model.DepartmentData

class DepartmentsDomainMapper(private val departmentDomain: DepartmentDomain) {
    fun toData(): DepartmentData = DepartmentData(departmentDomain.id, departmentDomain.title)
}