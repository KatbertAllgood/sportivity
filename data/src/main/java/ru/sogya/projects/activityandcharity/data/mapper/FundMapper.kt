package ru.sogya.projects.activityandcharity.data.mapper

import ru.sogya.projects.activityandcharity.data.entity.FundData
import ru.sogya.projects.activityandcharity.domain.entity.FundDomain

fun FundDomain.toData(): FundData = FundData(id, title, category)