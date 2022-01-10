package com.survivalcoding.noteapp.data.repository

import com.survivalcoding.noteapp.data.data_source.NoteDao
import com.survivalcoding.noteapp.domain.model.Note
import com.survivalcoding.noteapp.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRoomRepository(private val noteDao: NoteDao) : NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return noteDao.selectAll()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return noteDao.selectById(id)
    }

    override suspend fun upsertNote(note: Note) {
        noteDao.upsert(note)
    }

    override suspend fun deleteNote(note: Note) {
        deleteNote(note)
    }
}