package org.kikermo.testapp.domain.usecase

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.kikermo.testapp.network.mapper.toStatusError
import org.kikermo.testapp.repository.Repository
import javax.inject.Inject

internal class GetMoviesUseCaseImpl @Inject constructor(
    private val repository: Repository,
) : GetMoviesUseCase {
    override fun invoke(): Flow<GetMoviesUseCase.Status> {
        val moviesFow = repository.getMovies()

        return moviesFow.map { result ->
            val movieList = result.getOrElse { error ->
                return@map GetMoviesUseCase.Status.Failure(error.toStatusError())
            }
            return@map GetMoviesUseCase.Status.Success(movieList)
        }
    }
}
