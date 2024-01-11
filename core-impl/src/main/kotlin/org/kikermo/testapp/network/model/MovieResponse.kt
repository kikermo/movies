package org.kikermo.testapp.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class MovieResponse(
    @SerialName("id") val id: Long,
    @SerialName("original_title") val originalTitle: String,
    @SerialName("title") val title: String,
    @SerialName("poster_path") val posterPath: String,
)
