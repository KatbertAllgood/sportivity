package ru.sogya.projects.activity_and_charity.model

import ru.sogya.projects.activityandcharity.domain.model.FundDomain

data class FundPresentation(
    override val id: Int,
    override val title: Int,
    override val category: Int
) : FundDomain
