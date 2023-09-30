package ru.sogya.projects.activityandcharity.mapper

import ru.sogya.projects.activityandcharity.domain.model.FundDomain
import ru.sogya.projects.activityandcharity.model.FundData

class FundDomainMapper(private val fundDomain: FundDomain) {
    fun toData(): FundData = FundData(fundDomain.id, fundDomain.title, fundDomain.category)
}