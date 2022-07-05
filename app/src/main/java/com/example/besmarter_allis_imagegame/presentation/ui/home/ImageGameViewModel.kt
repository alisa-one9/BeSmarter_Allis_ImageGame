package com.example.besmarter_allis_imagegame.presentation.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
//import com.example.besmarter_allis_imagegame.models.Movie


//import com.example.besmarter_allis_imagegame.models.Movies
//import com.example.besmarter_allis_imagegame.remotedata_images.Retrofit
//import com.example.besmarter_allis_imagegame.remotedata_images.RetrofitApi
//import com.example.besmarter_allis_imagegame.source_image_game.ManualParsingImpl
//import com.example.besmarter_allis_imagegame.source_image_game.RepositoryImage
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

//class ImageGameViewModel : ViewModel() {
//    val loadingProgressBar = MutableLiveData<Boolean>()



//private val dataRepository = RepositoryImage(ManualParsingImpl())

//private val dataRepository = RepositoryImage(Retrofit.servisApi)
//
//    val liveData = MutableLiveData<Movie>()
//
//
//     fun fetchImage(){
//
//             viewModelScope.launch {
//                 val image: Movie = withContext(Dispatchers.IO) {
//                     dataRepository.getImages().movies[0]
//                 }
//                 liveData.value = image
//             }
//
//    }
//}