package org.kikermo.testapp.domain.coroutines

import kotlin.coroutines.CoroutineContext

interface CoroutinesContextProvider {
    val main: CoroutineContext
    val io: CoroutineContext
}
