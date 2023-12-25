package com.example.playlistmaker

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
//updated this!
interface TracksApi {

    @GET("/search?entity=song")
    fun searchTrack(@Query("term") text: String): Call<TrackResponse>
}