package com.hanamicrofinancemm.hilttesting.di

import com.hanamicrofinancemm.hilttesting.DefaultLocationProvider
import com.hanamicrofinancemm.hilttesting.LocationProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {



    @Provides
    @Singleton
    fun provideLocationProvider(): LocationProvider {
        return DefaultLocationProvider()
    }
}