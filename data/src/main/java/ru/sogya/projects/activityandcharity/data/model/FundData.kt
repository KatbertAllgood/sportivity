package ru.sogya.projects.activityandcharity.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.sogya.projects.activityandcharity.domain.model.FundDomain

@Entity(tableName = "current_fund")
data class FundData(
    @PrimaryKey
    override val id: Int,
    override val title: Int,
    override val category: Int
) : FundDomain
