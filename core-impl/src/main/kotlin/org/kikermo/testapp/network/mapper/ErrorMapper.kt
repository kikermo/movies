package org.kikermo.testapp.network.mapper

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import okhttp3.ResponseBody
import okio.IOException
import org.kikermo.testapp.domain.model.StatusError
import retrofit2.HttpException

internal fun Throwable.toStatusError(): StatusError {
    return when (this) {
        is IOException -> StatusError.NoInternetConnectionError
        is HttpException -> this.toErrorStatus()
        else -> StatusError.UnexpectedError
    }
}

private fun HttpException.toErrorStatus(): StatusError {
    return when (this.code()) {
        404 -> StatusError.ResourceUnavailableError(response()?.errorBody()?.string()?:"")
        else -> StatusError.UnexpectedError
    }
}
