package com.example.retrofitmvvmhilt.domain

import com.example.retrofitmvvmhilt.data.model.AlbumsItem
import com.example.retrofitmvvmhilt.domain.repository.AlbumsRepository

class GetAlbumsUseCase(private val albumsRepository: AlbumsRepository){
    suspend fun execute(): List<AlbumsItem> = albumsRepository.getAlbums()
}