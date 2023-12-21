package ru.sogya.projects.activity_and_charity.mapper

import ru.sogya.projects.activity_and_charity.entity.FundPresentation
import ru.sogya.projects.activityandcharity.domain.entity.FundDomain

fun FundDomain.toPresentation(): FundPresentation = FundPresentation(id, title, category)