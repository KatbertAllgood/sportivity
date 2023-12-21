package ru.sogya.projects.activityandcharity.domain.usecase.database.user_stat

import ru.sogya.projects.activityandcharity.domain.entity.UserStatisticDomain
import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository

class UpdateUserStatisticUseCase(private val databaseRepository: DatabaseRepository) {
    operator fun invoke(userStatisticDomain: UserStatisticDomain) =
        databaseRepository.updateUserStatistic(userStatisticDomain)
}