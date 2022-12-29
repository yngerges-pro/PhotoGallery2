package com.bignerdranch.android.photogallery2

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.bignerdranch.android.photogallery2.api.FlickrFetchr
import com.bignerdranch.android.photogallery2.models.GalleryItem

class PhotoGalleryViewModel : ViewModel() {
    val galleryItemLiveData: LiveData<List<GalleryItem>>
    init {
        galleryItemLiveData = FlickrFetchr().fetchPhotos()
    }
}