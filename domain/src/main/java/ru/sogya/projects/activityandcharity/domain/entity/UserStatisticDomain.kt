package ru.sogya.projects.activityandcharity.domain.entity

interface UserStatisticDomain : Statistic {
    override val userId: Int
    override val money: Int
    val achievementsProgress: Int
    val ratingPosition: Int
}