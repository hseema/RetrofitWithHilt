package com.example.retrofitmvvmhilt.domain.repository

import com.example.retrofitmvvmhilt.data.model.AlbumsItem

interface AlbumsRepository {
    suspend fun getAlbums():List<AlbumsItem>
}