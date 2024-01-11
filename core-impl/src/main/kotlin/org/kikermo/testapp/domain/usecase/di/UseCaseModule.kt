package org.kikermo.testapp.domain.usecase.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.kikermo.testapp.domain.usecase.GetMoviesUseCase
import org.kikermo.testapp.domain.usecase.GetMoviesUseCaseImpl

@Module
@InstallIn(SingletonComponent::class)
internal interface UseCaseModule {
    @Binds
    fun bindsMoviesUsecase(getAlbumFirstPhotoUseCase: GetMoviesUseCaseImpl): GetMoviesUseCase
}
