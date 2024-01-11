package org.kikermo.testapp.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class MovieResponse(
    @SerialName("page") val id: Long,
    @SerialName("results") val results: List<MovieItemResponse>,
    @SerialName("total_pages") val totalPages: Int,
    @SerialName("total_results") val total_results: Int,
)


@Serializable
data class MovieItemResponse(
    @SerialName("id") val id: Long,
    @SerialName("original_title") val originalTitle: String,
    @SerialName("title") val title: String,
    @SerialName("poster_path") val posterPath: String,
)
