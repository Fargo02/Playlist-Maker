package com.example.playlistmaker.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "track_name")
data class TrackEntity(
    @PrimaryKey
    val trackId: Long,
    val trackName: String,
    val artistName: String,
    val trackTimeMillis: String,
    val artworkUrl100: String,
    val collectionName: String? = null,
    val releaseDate: String,
    val primaryGenreName: String,
    val country: String,
    val previewUrl: String? = null,
    var isFavorite: Boolean,
    val currentTime: String,
)