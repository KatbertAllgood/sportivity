package ru.sogya.projects.activity_and_charity.entity

import ru.sogya.projects.activityandcharity.domain.entity.FundDomain

data class FundPresentation(
    override val id: Int,
    override val title: Int,
    override val category: Int
) : FundDomain
