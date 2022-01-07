package com.example.retrofitmvvmhilt.presentation.di

import com.example.retrofitmvvmhilt.data.api.AlbumService
import com.example.retrofitmvvmhilt.data.api.RetrofitInstance
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetNodule {

    @Singleton
    @Provides
    fun provideRetrofit():Retrofit{
        return RetrofitInstance.getRetrofitInstance()
    }

    @Singleton
    @Provides
    fun getAlbumService(retrofit:Retrofit):AlbumService{
        return retrofit.create(AlbumService::class.java)
    }
}