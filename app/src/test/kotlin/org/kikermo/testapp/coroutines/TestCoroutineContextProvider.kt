package org.kikermo.testapp.coroutines

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import org.kikermo.testapp.domain.coroutines.CoroutinesContextProvider
import kotlin.coroutines.CoroutineContext

@OptIn(ExperimentalCoroutinesApi::class)
class TestCoroutineContextProvider : CoroutinesContextProvider {
    private val testDispatcher = UnconfinedTestDispatcher()

    override val main: CoroutineContext = testDispatcher
    override val io: CoroutineContext = testDispatcher
}