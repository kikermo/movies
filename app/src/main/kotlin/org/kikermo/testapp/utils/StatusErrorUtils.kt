package org.kikermo.testapp.utils

import org.kikermo.testapp.R
import org.kikermo.testapp.domain.model.StatusError

internal fun StatusError.toText(stringProvider: StringProvider): String{
    return when(this) {
        StatusError.NoInternetConnectionError -> stringProvider.getString(R.string.general_error_internet_connection)
        is StatusError.ResourceUnavailableError -> stringProvider.getString(R.string.general_error_not_found)
        StatusError.UnexpectedError -> stringProvider.getString(R.string.general_error)
    }
}