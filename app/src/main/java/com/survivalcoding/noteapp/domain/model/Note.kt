package com.survivalcoding.noteapp.domain.model

import androidx.room.Entity

@Entity
data class Note(
    val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
)