package ru.sogya.projects.activityandcharity.domain.model

interface ActivityStatisticDomain : Statistic {
    override val userId: Int
    val title: String
    override val money: Int
    val progress: Int
    val valueType: Int
}