package com.example.retrofitmvvmhilt.data.repository.datasourceImpl

import com.example.retrofitmvvmhilt.data.model.Albums
import com.example.retrofitmvvmhilt.data.api.AlbumService
import com.example.retrofitmvvmhilt.data.repository.datasource.AlbumsRemoteDataSource
import retrofit2.Response

class AlbumsRemoteDataSourceImpl(private val albumService: AlbumService): AlbumsRemoteDataSource {
    override suspend fun getAlbums(): Response<Albums> = albumService.getAlbums()
}