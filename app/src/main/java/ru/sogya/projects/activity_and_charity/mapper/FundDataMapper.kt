package ru.sogya.projects.activity_and_charity.mapper

import ru.sogya.projects.activity_and_charity.model.FundPresentation
import ru.sogya.projects.activityandcharity.domain.model.FundDomain

class FundDataMapper(private val fundDomain: FundDomain) {
    fun toData(): FundPresentation = FundPresentation(fundDomain.id, fundDomain.title, fundDomain.category)
}