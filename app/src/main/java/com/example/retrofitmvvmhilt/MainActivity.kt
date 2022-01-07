package com.example.retrofitmvvmhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.retrofitmvvmhilt.data.model.AlbumsItem
import com.example.retrofitmvvmhilt.databinding.ActivityMainBinding
import com.example.retrofitmvvmhilt.presentation.viewmodel.MainViewModel
import com.example.retrofitmvvmhilt.presentation.viewmodel.MainViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    @Inject
    lateinit var factory: MainViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this,factory).get(MainViewModel::class.java)

        val responseLiveData = viewModel.getAlbums()
        responseLiveData.observe(this, Observer {
            val albumsList:ListIterator<AlbumsItem> = it.listIterator()
            if(albumsList!=null){
                while(albumsList.hasNext()){
                    val albumsItem: AlbumsItem = albumsList.next()
                    Log.i("RetrofitTag",albumsItem.userId.toString())
                    val result:String =  " "+"Albums Title: ${albumsItem.title}"+"\n"+
                            " "+"Albums Id: ${albumsItem.id}"+"\n"+
                            " "+"Albums UserId: ${albumsItem.userId}"+"\n\n\n"
                    binding.textView.append(result)
                }
            }
        })
    }
}