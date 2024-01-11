package org.kikermo.testapp.coroutines

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.kikermo.testapp.domain.coroutines.CoroutinesContextProvider

@Module
@InstallIn(SingletonComponent::class)
internal interface CoroutinesModule {
    @Binds
    fun bindsContextProvider(contextProvider: AppCoroutinesContextProvider): CoroutinesContextProvider
}
