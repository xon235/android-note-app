package com.survivalcoding.noteapp.presentation.add_edit_note

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.survivalcoding.noteapp.domain.model.Note
import com.survivalcoding.noteapp.domain.repository.NoteRepository
import kotlinx.coroutines.launch

class AddEditNoteViewModel(private val noteRepository: NoteRepository): ViewModel() {

    private val _note = MutableLiveData<Note>()
    val note: LiveData<Note> = _note

    fun getNoteById(id: Int) {
        viewModelScope.launch {
            _note.value = noteRepository.getById(id)
        }
    }

    fun updateNote(note: Note) {
        viewModelScope.launch {
            noteRepository.upsert(note)
        }
    }
}