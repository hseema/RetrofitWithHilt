package com.example.retrofitmvvmhilt.data.api

import com.example.retrofitmvvmhilt.data.model.Albums
import retrofit2.Response
import retrofit2.http.GET

interface AlbumService {

    @GET("/albums")
    suspend fun getAlbums():Response<Albums>
}