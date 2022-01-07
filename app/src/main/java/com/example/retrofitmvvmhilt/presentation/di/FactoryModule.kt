package com.example.retrofitmvvmhilt.presentation.di

import com.example.retrofitmvvmhilt.domain.GetAlbumsUseCase
import com.example.retrofitmvvmhilt.presentation.viewmodel.MainViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class FactoryModule {
    @Singleton
    @Provides
    fun getFactoryModule(
        getAlbumsUseCase: GetAlbumsUseCase
    ):MainViewModelFactory{
        return MainViewModelFactory(getAlbumsUseCase)
    }
}