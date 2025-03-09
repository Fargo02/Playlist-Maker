package com.example.playlistmaker.data.search.network

import com.example.playlistmaker.data.search.dto.TracksSearchResponse
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface ITunesApi {
    @GET("/search?entity=song")
    suspend fun searchTrack(@Query("term") text: String): TracksSearchResponse
}