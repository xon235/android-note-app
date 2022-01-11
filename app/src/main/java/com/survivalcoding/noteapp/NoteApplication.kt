package com.survivalcoding.noteapp

import android.app.Application
import androidx.room.Room
import com.survivalcoding.noteapp.data.datasource.NoteDatabase
import com.survivalcoding.noteapp.data.repository.NoteRoomRepository

class NoteApplication : Application() {

    private val noteDatabase by lazy {
        Room.databaseBuilder(this, NoteDatabase::class.java, "note_db").build()
    }

    val noteRepository by lazy {
        NoteRoomRepository(noteDatabase.noteDao())
    }
}