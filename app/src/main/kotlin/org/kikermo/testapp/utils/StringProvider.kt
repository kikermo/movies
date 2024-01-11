package org.kikermo.testapp.utils

import android.content.Context
import androidx.annotation.StringRes
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject


internal class StringProvider @Inject constructor(@ApplicationContext private val context: Context) {
    fun getString(@StringRes stringId: Int) = context.getString(stringId)
}