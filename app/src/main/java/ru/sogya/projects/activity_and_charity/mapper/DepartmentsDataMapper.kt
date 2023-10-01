package ru.sogya.projects.activity_and_charity.mapper

import ru.sogya.projects.activity_and_charity.model.DepartmentPresentation
import ru.sogya.projects.activityandcharity.domain.model.DepartmentDomain

class DepartmentsDataMapper(private val departmentDomain: DepartmentDomain) {
    fun toData(): DepartmentPresentation = DepartmentPresentation(departmentDomain.id, departmentDomain.title)
}