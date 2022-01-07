package com.example.retrofitmvvmhilt.data.repository.datasource

import com.example.retrofitmvvmhilt.data.model.Albums
import retrofit2.Response

interface AlbumsRemoteDataSource {
    suspend fun getAlbums(): Response<Albums>
}