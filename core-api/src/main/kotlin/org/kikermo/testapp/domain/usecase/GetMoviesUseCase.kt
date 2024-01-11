package org.kikermo.testapp.domain.usecase

import kotlinx.coroutines.flow.Flow
import org.kikermo.testapp.domain.model.Movie
import org.kikermo.testapp.domain.model.StatusError

interface GetMoviesUseCase {
    operator fun invoke(): Flow<Status>

    sealed class Status {
        data class Success(val moviewList: List<Movie>) : Status()
        data class Failure(val error: StatusError) : Status()
    }
}
