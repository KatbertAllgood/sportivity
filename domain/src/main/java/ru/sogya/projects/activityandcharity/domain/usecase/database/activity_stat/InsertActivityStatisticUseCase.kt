package ru.sogya.projects.activityandcharity.domain.usecase.database.activity_stat

import ru.sogya.projects.activityandcharity.domain.entity.ActivityStatisticDomain
import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository

class InsertActivityStatisticUseCase(private val databaseRepository: DatabaseRepository) {
    operator fun invoke(activityStatisticDomain: ActivityStatisticDomain) =
        databaseRepository.insertActivityStatistic(activityStatisticDomain)
}