package ru.sogya.projects.activityandcharity.domain.model

interface ActivityStatisticDomain : Statistic {
    override val userId: Int
    val activityId: Int
    override val money: Int
    val progress: Int
}