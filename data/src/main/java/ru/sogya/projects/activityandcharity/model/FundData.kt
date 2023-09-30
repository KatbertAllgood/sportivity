package ru.sogya.projects.activityandcharity.model

import androidx.room.Entity
import ru.sogya.projects.activityandcharity.domain.model.FundDomain

@Entity(tableName = "current_fund")
data class FundData(
    override val id: Int,
    override val title: Int,
    override val category: Int
) : FundDomain
