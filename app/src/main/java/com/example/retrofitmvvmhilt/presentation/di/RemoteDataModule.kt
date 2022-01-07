package com.example.retrofitmvvmhilt.presentation.di

import com.example.retrofitmvvmhilt.data.api.AlbumService
import com.example.retrofitmvvmhilt.data.repository.datasource.AlbumsRemoteDataSource
import com.example.retrofitmvvmhilt.data.repository.datasourceImpl.AlbumsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RemoteDataModule {
    @Singleton
    @Provides
    fun provideAlbumsRemoteDataSource(albumService: AlbumService):AlbumsRemoteDataSource{
        return AlbumsRemoteDataSourceImpl(albumService)
    }
}