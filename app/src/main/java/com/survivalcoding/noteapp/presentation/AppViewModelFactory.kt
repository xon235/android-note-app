package com.survivalcoding.noteapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.survivalcoding.noteapp.NoteApplication
import com.survivalcoding.noteapp.presentation.add_edit_note.AddEditNoteViewModel
import com.survivalcoding.noteapp.presentation.notes.NotesViewModel

class AppViewModelFactory(private val noteApplication: NoteApplication): ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(NotesViewModel::class.java) -> {
                NotesViewModel(noteApplication.noteRepository) as T
            }
            modelClass.isAssignableFrom(AddEditNoteViewModel::class.java) -> {
                AddEditNoteViewModel(noteApplication.noteRepository) as T
            }
            else -> {
                throw IllegalArgumentException("Unknown ViewModel Class ${modelClass.canonicalName}")
            }
        }
    }
}