package ru.sogya.projects.activity_and_charity.mapper

import ru.sogya.projects.activity_and_charity.model.FundPresentation
import ru.sogya.projects.activityandcharity.domain.model.FundDomain

fun FundDomain.toPresentation(): FundPresentation = FundPresentation(id, title, category)