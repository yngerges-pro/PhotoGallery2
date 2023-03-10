package com.bignerdranch.android.photogallery2.api

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

private const val API_KEY = "03eadef70fa854777e17dbf38f21bc8e"

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=" + API_KEY +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    fun fetchPhotos(): Call<FlickrResponse>
    @GET
    fun fetchUrlBytes(@Url url: String): Call<ResponseBody>
}