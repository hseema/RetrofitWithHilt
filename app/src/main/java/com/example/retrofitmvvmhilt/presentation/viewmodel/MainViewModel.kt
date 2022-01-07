package com.example.retrofitmvvmhilt.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.retrofitmvvmhilt.data.model.AlbumsItem
import com.example.retrofitmvvmhilt.domain.GetAlbumsUseCase

class MainViewModel(private val getAlbumsUseCase: GetAlbumsUseCase):ViewModel() {

    fun getAlbums():LiveData<List<AlbumsItem>> = liveData{
        emit(getAlbumsUseCase.execute())
    }
}