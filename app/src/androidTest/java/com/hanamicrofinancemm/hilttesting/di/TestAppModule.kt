package com.hanamicrofinancemm.hilttesting.di

import com.hanamicrofinancemm.hilttesting.FakeLocationProvider
import com.hanamicrofinancemm.hilttesting.LocationProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Singleton


@Module
@TestInstallIn(components = [SingletonComponent::class], replaces = [AppModule::class] )
object TestAppModule {


    @Provides
    @Singleton
    fun provideLocationProvider(): LocationProvider {
        return FakeLocationProvider()
    }
}