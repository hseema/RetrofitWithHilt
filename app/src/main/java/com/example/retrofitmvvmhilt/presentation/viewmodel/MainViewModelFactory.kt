package com.example.retrofitmvvmhilt.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.retrofitmvvmhilt.domain.GetAlbumsUseCase

class MainViewModelFactory(
    private val getAlbumsUseCase: GetAlbumsUseCase
    ): ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(getAlbumsUseCase) as T
    }
}