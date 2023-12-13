package ru.sogya.projects.activityandcharity.mapper

import ru.sogya.projects.activityandcharity.domain.model.FundDomain
import ru.sogya.projects.activityandcharity.model.FundData

fun FundDomain.toData(): FundData = FundData(id, title, category)