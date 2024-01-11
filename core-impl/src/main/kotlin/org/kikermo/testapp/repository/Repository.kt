package org.kikermo.testapp.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.kikermo.testapp.domain.model.Movie
import org.kikermo.testapp.network.MovieService
import org.kikermo.testapp.network.mapper.DomainMapper
import org.kikermo.testapp.network.mapper.toStatusError
import javax.inject.Inject

internal class Repository @Inject constructor(
    private val service: MovieService,
    private val mapper: DomainMapper,
) {
    fun getMovies(): Flow<Result<List<Movie>>> {
        return getNetworkCallFlow(
            networkResourceFetcher = { service.getMovies() },
            mapper = { it.map(mapper::map) }
        )
    }

    private fun <NetworkModel, DomainModel> getNetworkCallFlow(
        networkResourceFetcher: suspend () -> Result<NetworkModel>,
        mapper: (NetworkModel) -> DomainModel
    ): Flow<Result<DomainModel>> {
        return flow {
            val networkResult = networkResourceFetcher()

            networkResult.fold(
                onSuccess = { emit(Result.success(mapper(it))) },
                onFailure = { emit(Result.failure(it.toStatusError())) }
            )
        }
    }
}
