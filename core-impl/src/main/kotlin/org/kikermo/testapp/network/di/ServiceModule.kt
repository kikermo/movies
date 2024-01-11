package org.kikermo.testapp.network.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.kikermo.testapp.network.MovieService
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {
    @Provides
    @Singleton
    internal fun providesPhotoAlbumService(retrofit: Retrofit) =
        retrofit.create(MovieService::class.java)
}
