package org.kikermo.testapp.network

import org.kikermo.testapp.network.model.MovieResponse
import retrofit2.http.GET

interface MovieService {

    @GET("/v3/discover/movie")
    suspend fun getMovies(): Result<List<MovieResponse>>
}
