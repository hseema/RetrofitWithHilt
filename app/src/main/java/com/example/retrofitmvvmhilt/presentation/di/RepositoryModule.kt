package com.example.retrofitmvvmhilt.presentation.di

import com.example.retrofitmvvmhilt.data.repository.AlbumsRepositoryImpl
import com.example.retrofitmvvmhilt.data.repository.datasource.AlbumsRemoteDataSource
import com.example.retrofitmvvmhilt.domain.repository.AlbumsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun getAlbumsRepository(
        albumsRemoteDataSource: AlbumsRemoteDataSource
    ):AlbumsRepository{
        return AlbumsRepositoryImpl(albumsRemoteDataSource)
    }
}