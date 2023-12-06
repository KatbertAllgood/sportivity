package ru.sogya.projects.activityandcharity.data.mapper

import ru.sogya.projects.activityandcharity.data.model.FundData
import ru.sogya.projects.activityandcharity.domain.model.FundDomain

fun FundDomain.toData(): FundData = FundData(id, title, category)