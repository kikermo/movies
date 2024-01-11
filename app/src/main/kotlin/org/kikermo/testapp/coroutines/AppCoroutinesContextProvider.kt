package org.kikermo.testapp.coroutines

import kotlinx.coroutines.Dispatchers
import org.kikermo.testapp.domain.coroutines.CoroutinesContextProvider
import javax.inject.Inject
internal class AppCoroutinesContextProvider @Inject constructor() : CoroutinesContextProvider {
    override val main = Dispatchers.Main
    override val io = Dispatchers.IO
}
