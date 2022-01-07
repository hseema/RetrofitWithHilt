package com.example.retrofitmvvmhilt.presentation.di

import com.example.retrofitmvvmhilt.domain.GetAlbumsUseCase
import com.example.retrofitmvvmhilt.domain.repository.AlbumsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class UseCaseModule {
    @Singleton
    @Provides
    fun getAlbumsUseCaseModule(
        albumsRepository: AlbumsRepository
    ):GetAlbumsUseCase{
        return GetAlbumsUseCase(albumsRepository)
    }
}