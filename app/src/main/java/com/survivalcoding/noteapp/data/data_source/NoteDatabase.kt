package com.survivalcoding.noteapp.data.data_source

import androidx.room.Database
import com.survivalcoding.noteapp.domain.model.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase {
    abstract fun noteDao(): NoteDao
}