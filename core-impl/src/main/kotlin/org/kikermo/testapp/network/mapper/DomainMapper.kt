package org.kikermo.testapp.network.mapper

import org.kikermo.testapp.domain.model.Movie
import org.kikermo.testapp.network.model.MovieItemResponse
import org.kikermo.testapp.network.model.MovieResponse
import javax.inject.Inject

internal class DomainMapper @Inject constructor() {
    fun map(response: MovieResponse): List<Movie> {
        return response.results.map(::map)
    }

    private fun map(response: MovieItemResponse): Movie {
        return Movie(
            id = response.id,
            originalTitle = response.originalTitle,
            title = response.title,
            posterPath = response.posterPath,
        )
    }
}
