package ru.sogya.projects.activityandcharity.domain.usecase.database.activity_stat

import ru.sogya.projects.activityandcharity.domain.model.ActivityStatisticDomain
import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository

class DeleteActivityStatisticUseCase(private val databaseRepository: DatabaseRepository) {
    operator fun invoke(activityStatisticDomain: ActivityStatisticDomain) =
        databaseRepository.deleteActivityStatistic(activityStatisticDomain)
}