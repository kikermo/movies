package org.kikermo.testapp.network

import org.kikermo.testapp.network.model.MovieResponse
import retrofit2.http.GET

interface MovieService {

    @GET("/3/discover/movie?include_adult=false&include_video=false&language=es-ES&page=1&sort_by=popularity.desc")
    suspend fun getMovies(): Result<MovieResponse>
}
