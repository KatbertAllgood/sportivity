package ru.sogya.projects.activity_and_charity.model

import ru.sogya.projects.activityandcharity.domain.model.DepartmentDomain

data class DepartmentPresentation(
    override val id: Int,
    override val title: String
) : DepartmentDomain
