package ru.sogya.projects.activityandcharity.domain.usecase.database.user_stat

import ru.sogya.projects.activityandcharity.domain.model.UserStatisticDomain
import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository

class DeleteUserStatisticUseCase(private val databaseRepository: DatabaseRepository) {
    operator fun invoke(userStatisticDomain: UserStatisticDomain) =
        databaseRepository.deleteUserStatistic(userStatisticDomain)
}