package com.example.retrofitmvvmhilt.data.repository

import android.util.Log
import com.example.retrofitmvvmhilt.data.model.Albums
import com.example.retrofitmvvmhilt.data.model.AlbumsItem
import com.example.retrofitmvvmhilt.domain.repository.AlbumsRepository
import com.example.retrofitmvvmhilt.data.repository.datasource.AlbumsRemoteDataSource
import retrofit2.Response

class AlbumsRepositoryImpl(private val albumsRemoteDataSource: AlbumsRemoteDataSource):
    AlbumsRepository {
    override suspend fun getAlbums(): List<AlbumsItem> {
        try{
            val response:Response<Albums> = albumsRemoteDataSource.getAlbums()
            val body: Albums? = response.body()
            if(body!=null){
                return body
            }

        }catch (exception:Exception){
            Log.i("MyTag",exception.message.toString())
        }

        return emptyList()
    }
}